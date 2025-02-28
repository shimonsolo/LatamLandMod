package net.shimonsolo.LatamLand.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.shimonsolo.LatamLand.blocks.ModBlocks;
import net.shimonsolo.LatamLand.item.Moditems;


public class DatagenModelProvider extends FabricModelProvider {
    public DatagenModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LATAM_BLOCK.getLeft());
        // blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GOLDS_BLOCK.getLeft());

        BlockStateModelGenerator.BlockTexturePool goldTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GOLD_BLOCK.getLeft());
        goldTexturePool.stairs(ModBlocks.GOLD_BLOCK_STAIRS.getLeft());
        goldTexturePool.slab(ModBlocks.GOLD_BLOCK_SLAB.getLeft());
        goldTexturePool.wall(ModBlocks.GOLD_BLOCK_WALL.getLeft());

        BlockStateModelGenerator.BlockTexturePool dirtPathTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIRT_PATH.getLeft());
        dirtPathTexturePool.stairs(ModBlocks.DIRT_PATH_STAIRS.getLeft());
        dirtPathTexturePool.slab(ModBlocks.DIRT_PATH_SLAB.getLeft());

        BlockStateModelGenerator.BlockTexturePool whiteConcreteTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_CONCRETE.getLeft());
        whiteConcreteTexturePool.slab(ModBlocks.WHITE_CONCRETE_SLAB.getLeft());

        BlockStateModelGenerator.BlockTexturePool blackConcreteTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_CONCRETE.getLeft());
        blackConcreteTexturePool.slab(ModBlocks.BLACK_CONCRETE_SLAB.getLeft());

        BlockStateModelGenerator.BlockTexturePool grayConcreteTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAY_CONCRETE.getLeft());
        grayConcreteTexturePool.stairs(ModBlocks.GRAY_CONCRETE_STAIRS.getLeft());
        grayConcreteTexturePool.slab(ModBlocks.GRAY_CONCRETE_SLAB.getLeft());

        BlockStateModelGenerator.BlockTexturePool stageBlockTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STAGE_BLOCK.getLeft());
        stageBlockTexturePool.stairs(ModBlocks.STAGE_BLOCK_STAIRS.getLeft());
        stageBlockTexturePool.slab(ModBlocks.STAGE_BLOCK_SLAB.getLeft());
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Moditems.LATAM, Models.GENERATED);
    }
}
