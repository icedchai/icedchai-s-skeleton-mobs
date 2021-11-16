package me.icedchai.skeletonmobs;


import me.icedchai.skeletonmobs.common.entity.SkeletonKnightEntity;
import me.icedchai.skeletonmobs.common.entity.StrayKnightEntity;
import me.icedchai.skeletonmobs.common.entity.WitherArcherEntity;
import me.icedchai.skeletonmobs.common.init.entity.EntityInit;
import me.icedchai.skeletonmobs.common.init.item.ItemInit;
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

public class IcedchaisSkeletons implements ModInitializer {

	public static String MODID = "icedchaiskeletons";

	public static final Logger LOGGER = LogManager.getLogger("icedchais");

	@Override
	public void onInitialize() {
		EntityInit.register();
		ItemInit.register();
	}
}
