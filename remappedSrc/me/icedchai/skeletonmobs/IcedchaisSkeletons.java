package me.icedchai.skeletonmobs;


import me.icedchai.skeletonmobs.common.init.entity.EntityInit;
import me.icedchai.skeletonmobs.common.init.item.ItemInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IcedchaisSkeletons implements ModInitializer {

	public static String MODID = "icedchaiskeletons";

	public static final Logger LOGGER = LogManager.getLogger("icedchais");

	@Override
	public void onInitialize() {
		EntityInit.register();
		ItemInit.register();

		BiomeModifications.addSpawn(
				BiomeSelectors.spawnsOneOf(EntityType.SKELETON),
				SpawnGroup.MONSTER,
				EntityInit.SKNIGHT,
				10,
				4,
				4
		);

	}

}
