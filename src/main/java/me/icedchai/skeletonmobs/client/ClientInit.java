package me.icedchai.skeletonmobs.client;

import me.icedchai.skeletonmobs.client.entity.StrayKnightEntityRenderer;
import me.icedchai.skeletonmobs.common.Init;
import me.icedchai.skeletonmobs.client.entity.SkeletonKnightEntityRenderer;
import me.icedchai.skeletonmobs.client.entity.WitherArcherEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import static me.icedchai.skeletonmobs.common.Init.MODID;

@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {
    public static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(new Identifier(MODID, "skeleton_knight"), "main");


    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Init.SKNIGHT, (ctx) -> {
            return new SkeletonKnightEntityRenderer(ctx);
        });
        EntityRendererRegistry.register(Init.WARCHER, (ctx) -> {
            return new WitherArcherEntityRenderer(ctx);
        });
        EntityRendererRegistry.register(Init.STKNIGHT, (ctx) -> {
            return new StrayKnightEntityRenderer(ctx);
        });

    }

}

