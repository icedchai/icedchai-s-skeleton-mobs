package me.icedchai.skeletonmobs.client.entity;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SkeletonEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.util.Identifier;

public class WitherArcherEntityRenderer extends SkeletonEntityRenderer {
    private static final Identifier TEXTURE = new Identifier("textures/entity/skeleton/wither_skeleton.png");

    public WitherArcherEntityRenderer(EntityRendererFactory.Context context) {
        super(context, EntityModelLayers.WITHER_SKELETON, EntityModelLayers.WITHER_SKELETON_INNER_ARMOR, EntityModelLayers.WITHER_SKELETON_OUTER_ARMOR);
    }

    public Identifier getTexture(AbstractSkeletonEntity abstractSkeletonEntity) {
        return TEXTURE;
    }

    protected void scale(AbstractSkeletonEntity abstractSkeletonEntity, MatrixStack matrixStack, float f) {
        matrixStack.scale(1.2F, 1.2F, 1.2F);
    }


}

