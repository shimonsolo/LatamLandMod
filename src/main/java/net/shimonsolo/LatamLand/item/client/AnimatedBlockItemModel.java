package net.shimonsolo.LatamLand.item.client;

import net.minecraft.util.Identifier;
import net.shimonsolo.LatamLand.Latamland;
import net.shimonsolo.LatamLand.item.custom.AnimatedBlockItem;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedBlockItemModel extends GeoModel<AnimatedBlockItem> {
    @Override
    public Identifier getModelResource(AnimatedBlockItem animatedBlockItem) {
        return new Identifier(Latamland.MODID, "geo/block/animated_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(AnimatedBlockItem animatedBlockItem) {
        return new Identifier(Latamland.MODID, "textures/block/animated_block.png");
    }

    @Override
    public Identifier getAnimationResource(AnimatedBlockItem animatedBlockItem) {
        return new Identifier(Latamland.MODID, "animations/block/animated_block.animation.json");
    }
}
