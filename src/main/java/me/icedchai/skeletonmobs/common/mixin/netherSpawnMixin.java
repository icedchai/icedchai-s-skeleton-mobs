 package me.icedchai.skeletonmobs.common.mixin;

        import me.icedchai.skeletonmobs.common.entity.WitherArcherEntity;
import me.icedchai.skeletonmobs.common.init.entity.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.feature.NetherFortressFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NetherFortressFeature.class)
public class netherSpawnMixin {
    private static final EntityType<WitherArcherEntity> WARCHER = EntityInit.WARCHER;
    @Inject(method = "getMonsterSpawns", at = @At("TAIL"), cancellable = true)
    private void spawnCustoms(CallbackInfoReturnable<Boolean> cir) {

    }

}