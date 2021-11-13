package me.icedchai.skeletonmobs.common;


import me.icedchai.skeletonmobs.common.entity.SkeletonKnightEntity;
import me.icedchai.skeletonmobs.common.entity.StrayKnightEntity;
import me.icedchai.skeletonmobs.common.entity.WitherArcherEntity;
import me.icedchai.skeletonmobs.common.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Init implements ModInitializer {

	public static String MODID = "icedchaiskeletons";

	public static final Logger LOGGER = LogManager.getLogger("icedchais");

	public static final EntityType<SkeletonKnightEntity> SKNIGHT = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MODID, "skeleton_knight"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SkeletonKnightEntity::new).dimensions(EntityDimensions.fixed(0.6f, 1.99f)).build()
	);
	public static final EntityType<WitherArcherEntity> WARCHER = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MODID, "wither_archer"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, WitherArcherEntity::new).fireImmune().dimensions(EntityDimensions.fixed(0.7f, 2.4f)).build()
	);
	public static final EntityType<StrayKnightEntity> STKNIGHT = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MODID, "stray_knight"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, StrayKnightEntity::new).dimensions(EntityDimensions.fixed(0.6f, 1.99f)).build()
	);
	public static final ItemGroup MAIN_ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MODID, "skeleton_spawn_eggs"),
			() -> new ItemStack(Items.BONE));

	@Override
	public void onInitialize() {
		FabricDefaultAttributeRegistry.register(SKNIGHT, SkeletonKnightEntity.createSKnightAttributes());
		FabricDefaultAttributeRegistry.register(WARCHER, WitherArcherEntity.createWArcherAttributes());
		FabricDefaultAttributeRegistry.register(STKNIGHT, StrayKnightEntity.createStKnightAttributes());
		ModItems.register();
	}
}
