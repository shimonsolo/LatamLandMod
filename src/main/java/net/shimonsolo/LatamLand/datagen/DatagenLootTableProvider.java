package net.shimonsolo.LatamLand.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.shimonsolo.LatamLand.blocks.ModBlocks;
import net.shimonsolo.LatamLand.item.Moditems;

import java.util.concurrent.CompletableFuture;

public class DatagenLootTableProvider extends FabricBlockLootTableProvider {

    public DatagenLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate(){
        addDrop(ModBlocks.LATAM_BLOCK.getLeft(), drops(Moditems.LATAM));
        addDrop(ModBlocks.SPEAKER.getLeft());

        addDrop(ModBlocks.GOLD_BLOCK_SLAB.getLeft(), slabDrops(ModBlocks.GOLD_BLOCK_SLAB.getLeft()));
        addDrop(ModBlocks.GOLD_BLOCK_STAIRS.getLeft());
        addDrop(ModBlocks.GOLD_BLOCK_WALL.getLeft());

        addDrop(ModBlocks.DIRT_PATH_SLAB.getLeft(), slabDrops(ModBlocks.DIRT_PATH_SLAB.getLeft()));
        addDrop(ModBlocks.DIRT_PATH_STAIRS.getLeft());

        addDrop(ModBlocks.WHITE_CONCRETE_SLAB.getLeft(), slabDrops(ModBlocks.WHITE_CONCRETE_SLAB.getLeft()));
        addDrop(ModBlocks.BLACK_CONCRETE_SLAB.getLeft(), slabDrops(ModBlocks.BLACK_CONCRETE_SLAB.getLeft()));

        addDrop(ModBlocks.GRAY_CONCRETE_SLAB.getLeft(), slabDrops(ModBlocks.GRAY_CONCRETE_SLAB.getLeft()));
        addDrop(ModBlocks.GRAY_CONCRETE_STAIRS.getLeft());

        addDrop(ModBlocks.STAGE_BLOCK_SLAB.getLeft(), slabDrops(ModBlocks.STAGE_BLOCK_SLAB.getLeft()));
        addDrop(ModBlocks.STAGE_BLOCK_STAIRS.getLeft());
    }
}
