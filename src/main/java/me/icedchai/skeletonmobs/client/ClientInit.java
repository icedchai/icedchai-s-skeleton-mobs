package me.icedchai.skeletonmobs.client;

import me.icedchai.skeletonmobs.IcedchaisSkeletons;
import me.icedchai.skeletonmobs.client.entity.StrayKnightEntityRenderer;
import me.icedchai.skeletonmobs.client.entity.SkeletonKnightEntityRenderer;
import me.icedchai.skeletonmobs.client.entity.WitherArcherEntityRenderer;
import me.icedchai.skeletonmobs.common.init.entity.EntityInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import static me.icedchai.skeletonmobs.IcedchaisSkeletons.MODID;

@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {
    public static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(new Identifier(MODID, "skeleton_knight"), "main");


    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(EntityInit.SKNIGHT, (ctx) -> {
            return new SkeletonKnightEntityRenderer(ctx);
        });
        EntityRendererRegistry.register(EntityInit.WARCHER, (ctx) -> {
            return new WitherArcherEntityRenderer(ctx);
        });
        EntityRendererRegistry.register(EntityInit.STKNIGHT, (ctx) -> {
            return new StrayKnightEntityRenderer(ctx);
        });

    }

}

