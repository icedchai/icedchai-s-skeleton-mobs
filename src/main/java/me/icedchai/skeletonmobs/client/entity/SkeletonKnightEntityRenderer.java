package me.icedchai.skeletonmobs.client.entity;

import me.icedchai.skeletonmobs.common.entity.SkeletonKnightEntity;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.SkeletonEntityModel;
import net.minecraft.util.Identifier;

public class SkeletonKnightEntityRenderer  extends BipedEntityRenderer<SkeletonKnightEntity, SkeletonEntityModel<SkeletonKnightEntity>> {

    public Identifier getTexture(SkeletonKnightEntity entity) {
        return new Identifier("minecraft", "textures/entity/skeleton/skeleton.png");
    }

    public SkeletonKnightEntityRenderer(EntityRendererFactory.Context context) {
        this(context, EntityModelLayers.SKELETON, EntityModelLayers.SKELETON_INNER_ARMOR, EntityModelLayers.SKELETON_OUTER_ARMOR);
    }
    public SkeletonKnightEntityRenderer(EntityRendererFactory.Context ctx, EntityModelLayer layer, EntityModelLayer legArmorLayer, EntityModelLayer bodyArmorLayer) {
        super(ctx, new SkeletonEntityModel(ctx.getPart(layer)), 0.5F);
        this.addFeature(new ArmorFeatureRenderer(this, new SkeletonEntityModel(ctx.getPart(legArmorLayer)), new SkeletonEntityModel(ctx.getPart(bodyArmorLayer))));
    }


}

