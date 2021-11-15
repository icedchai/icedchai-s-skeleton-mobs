package me.icedchai.skeletonmobs.common.mixin;

import me.icedchai.skeletonmobs.IcedchaisSkeletons;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public class spawnMixin extends DefaultBiomeFeatures{
    @Inject(method = "addMonsters", at = @At("HEAD"), cancellable = true)
    private static void spawnSKnight(SpawnSettings.Builder builder,  int zombieWeight, int zombieVillagerWeight, int skeletonWeight, CallbackInfo cir) {
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(IcedchaisSkeletons.SKNIGHT, 100, 3, 5));
    }

    @Inject(method="addSnowyMobs", at = @At("HEAD"), cancellable = true)
    private static void spawnStKnight(SpawnSettings.Builder builder, CallbackInfo cir){
        builder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(IcedchaisSkeletons.STKNIGHT, 80, 3, 5));
    }
}
