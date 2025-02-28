package net.shimonsolo.LatamLand.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.shimonsolo.LatamLand.blocks.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class DatagenBlockTagProvider extends FabricTagProvider<Block> {
    public DatagenBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registiresFuture) {
        super(output, RegistryKeys.BLOCK,registiresFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(ModBlocks.GOLD_BLOCK_WALL.getLeft());
    }
}
