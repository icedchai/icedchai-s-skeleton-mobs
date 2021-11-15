package me.icedchai.skeletonmobs.common.entity;

import me.icedchai.skeletonmobs.IcedchaisSkeletons;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;

import java.util.Random;

public class SkeletonKnightEntity extends SkeletonEntity {

    public Random random = new Random();


    public SkeletonKnightEntity(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);

    }

    protected void initEquipment(LocalDifficulty difficulty) {

        boolean hasHelmet=false;
        boolean hasHeavy=false;

        if(random.nextInt(2)==0) {
            this.equipStack(EquipmentSlot.HEAD, new ItemStack(Items.IRON_HELMET));
            hasHelmet=true;
        }
        if(random.nextInt(10)==0&&hasHelmet) {
            equipStack(EquipmentSlot.CHEST, new ItemStack(Items.IRON_CHESTPLATE));
            this.equipStack(EquipmentSlot.OFFHAND, new ItemStack(Items.SHIELD));
            this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(Items.IRON_SWORD));
            hasHeavy=true;
        }
        if(!hasHeavy)
            this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(Items.STONE_SWORD));

    }




    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SKELETON_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_SKELETON_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_SKELETON_DEATH;
    }


    SoundEvent getStepSound() { return SoundEvents.ENTITY_SKELETON_STEP;}

    protected void convertToStray() {
        this.convertTo(IcedchaisSkeletons.STKNIGHT, true);
        if (!this.isSilent()) {
            this.world.syncWorldEvent(null, WorldEvents.SKELETON_CONVERTS_TO_STRAY, this.getBlockPos(), 0);
        }

    }
    public static DefaultAttributeContainer.Builder createSKnightAttributes(){
        return HostileEntity.createHostileAttributes()

                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.26D)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 30)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20)
                ;
    }

    protected void dropEquipment(DamageSource source, int lootingMultiplier, boolean allowDrops) {
        super.dropEquipment(source, lootingMultiplier, allowDrops);
        Entity entity = source.getAttacker();
        if (entity instanceof CreeperEntity) {
            CreeperEntity creeperEntity = (CreeperEntity)entity;
            if (creeperEntity.shouldDropHead()) {
                creeperEntity.onHeadDropped();
                this.dropItem(Items.SKELETON_SKULL);
            }
        }

    }
}
