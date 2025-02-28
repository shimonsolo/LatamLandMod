package net.shimonsolo.LatamLand.blocks.entity.client;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.shimonsolo.LatamLand.blocks.entity.AnimatedBlockEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class AnimatedBlockRenderer extends GeoBlockRenderer<AnimatedBlockEntity> {

    public AnimatedBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new AnimatedBlockModel());
    }
}
