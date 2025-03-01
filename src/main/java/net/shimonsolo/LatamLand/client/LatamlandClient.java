package net.shimonsolo.LatamLand.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.shimonsolo.LatamLand.blocks.entity.ModBlockEntities;
import net.shimonsolo.LatamLand.blocks.entity.client.AnimatedBlockRenderer;
import net.shimonsolo.LatamLand.client.screen.ModScreenHandlers;

public class LatamlandClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(
                ModBlockEntities.ANIMATED_BLOCK_ENTITY,
                AnimatedBlockRenderer::new
        );
        ModScreenHandlers.register();
    }
}
