package net.shimonsolo.LatamLand.blocks.entity.client;

import net.minecraft.util.Identifier;
import net.shimonsolo.LatamLand.Latamland;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedBlockModel extends GeoModel {
    @Override
    public Identifier getModelResource(GeoAnimatable geoAnimatable) {
        return new Identifier(Latamland.MODID, "geo/block/animated_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(GeoAnimatable geoAnimatable) {
        return new Identifier(Latamland.MODID, "textures/block/animated_block.png");

    }

    @Override
    public Identifier getAnimationResource(GeoAnimatable geoAnimatable) {
        return new Identifier(Latamland.MODID, "animations/block/animated_block.animation.json");

    }
}
