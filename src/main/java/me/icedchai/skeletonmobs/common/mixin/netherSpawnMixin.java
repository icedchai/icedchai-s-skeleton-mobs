package me.icedchai.skeletonmobs.common.mixin;

import me.icedchai.skeletonmobs.IcedchaisSkeletons;
import me.icedchai.skeletonmobs.common.entity.WitherArcherEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.NetherFortressFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NetherFortressFeature.class)
public class netherSpawnMixin {
    private static final EntityType<WitherArcherEntity> WARCHER = IcedchaisSkeletons.WARCHER;
    @Inject(method = "", at = @At("HEAD"), cancellable = true)
    private void spawnCustoms(SpawnSettings.Builder builder, CallbackInfoReturnable<Boolean> cir) {
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(WARCHER, 50, 4, 4));
    }

}
