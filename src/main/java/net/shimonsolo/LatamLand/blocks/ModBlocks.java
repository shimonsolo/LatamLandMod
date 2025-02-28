package net.shimonsolo.LatamLand.blocks;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.shimonsolo.LatamLand.Latamland;
import net.shimonsolo.LatamLand.blocks.custom.VerticalSlabBlock;
import net.shimonsolo.LatamLand.blocks.custom.VerticalStairsBlock;
import net.shimonsolo.LatamLand.blocks.custom.*;
import net.shimonsolo.LatamLand.blocks.custom.Block;

public class ModBlocks {
    public static final Pair<net.minecraft.block.Block, Item> LATAM_BLOCK =   registerBlock("latam_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Pair<net.minecraft.block.Block, Item> WHITE_BRICKS =   registerBlock("white_bricks", new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));
    public static final Pair<net.minecraft.block.Block, Item> SPEAKER =   registerBlock("speaker", new Speaker(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<net.minecraft.block.Block, Item> MAGIC_CUBE =   registerBlock("magic_cube", new MagicCube(AbstractBlock.Settings.copy(Blocks.BEDROCK)));
    public static final Pair<net.minecraft.block.Block, Item> STAND =   registerBlock("stand", new Stand(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<net.minecraft.block.Block, Item> MICROPHONESTAND =   registerBlock("microphone_stand", new MicrophoneStand(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<net.minecraft.block.Block, Item> MICPODCAST =   registerBlock("mic_podcast", new MicPodcast(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<net.minecraft.block.Block, Item> TABLE =   registerBlock("table", new Table(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Pair<net.minecraft.block.Block, Item> CHAIR =   registerBlock("chair", new Chair(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Pair<net.minecraft.block.Block, Item> SEAT =   registerBlock("seat", new Seat(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Pair<net.minecraft.block.Block, Item> SPEAKER2 =   registerBlock("speaker_2", new Speaker2(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Pair<net.minecraft.block.Block, Item> SUBWOOFER18 =   registerBlock("subwoofer18", new Subwoofer18(AbstractBlock.Settings.copy(Blocks.STONE)));

    public static final Pair<net.minecraft.block.Block, Item> GOLD_BLOCK =   registerBlock("gold_block", new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Pair<net.minecraft.block.Block, Item> GOLD_BLOCK_STAIRS =   registerBlock("gold_block_stairs", new StairsBlock(GOLD_BLOCK.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Pair<net.minecraft.block.Block, Item> GOLD_BLOCK_SLAB =   registerBlock("gold_block_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Pair<net.minecraft.block.Block, Item> GOLD_BLOCK_WALL =   registerBlock("gold_block_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Pair<net.minecraft.block.Block, Item> GOLD_BLOCK_VERTICAL_SLAB =   registerBlock("gold_block_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
    public static final Pair<net.minecraft.block.Block, Item> GOLD_BLOCK_VERTICAL_STAIRS =   registerBlock("gold_block_vertical_stairs", new VerticalStairsBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));

    public static final Pair<net.minecraft.block.Block, Item> DIRT_PATH =   registerBlock("dirt_path", new DirtPath(AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
    public static final Pair<net.minecraft.block.Block, Item> DIRT_PATH_STAIRS =   registerBlock("dirt_path_stairs", new StairsBlock(DIRT_PATH.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));
    public static final Pair<net.minecraft.block.Block, Item> DIRT_PATH_SLAB =   registerBlock("dirt_path_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT_PATH)));

    public static final Pair<net.minecraft.block.Block, Item> WHITE_CONCRETE =   registerBlock("white_concrete", new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Pair<net.minecraft.block.Block, Item> WHITE_CONCRETE_SLAB =   registerBlock("white_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Pair<net.minecraft.block.Block, Item> WHITE_CONCRETE_VERTICAL_SLAB =   registerBlock("white_concrete_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));

    public static final Pair<net.minecraft.block.Block, Item> BLACK_CONCRETE =   registerBlock("black_concrete", new Block(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Pair<net.minecraft.block.Block, Item> BLACK_CONCRETE_SLAB =   registerBlock("black_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));

    public static final Pair<net.minecraft.block.Block, Item> GRAY_CONCRETE =   registerBlock("gray_concrete", new Block(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Pair<net.minecraft.block.Block, Item> GRAY_CONCRETE_SLAB =   registerBlock("gray_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
    public static final Pair<net.minecraft.block.Block, Item> GRAY_CONCRETE_STAIRS =   registerBlock("gray_concrete_stairs", new StairsBlock(GRAY_CONCRETE.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));

    public static final Pair<net.minecraft.block.Block, Item> MUD_BRICK_VERTICAL_SLAB =   registerBlock("mud_brick_vertical_slab", new VerticalSlabBlock(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS)));

    public static final Pair<net.minecraft.block.Block, Item> STAGE_BLOCK =   registerBlock("stage_block", new Block(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Pair<net.minecraft.block.Block, Item> STAGE_BLOCK_SLAB =   registerBlock("stage_block_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));
    public static final Pair<net.minecraft.block.Block, Item> STAGE_BLOCK_STAIRS =   registerBlock("stage_block_stairs", new StairsBlock(GRAY_CONCRETE.getLeft().getDefaultState(), AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));

    public static final AnimatedBlock ANIMATED_BLOCK = Registry.register(Registries.BLOCK, new Identifier(Latamland.MODID, "animated_block"),
            new AnimatedBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));



    private static Pair<net.minecraft.block.Block, Item> registerBlock(String name, net.minecraft.block.Block block) {
        return new Pair<>(
                Registry.register(Registries.BLOCK, new Identifier(Latamland.MODID, name), block),
                Registry.register(Registries.ITEM, new Identifier(Latamland.MODID, name), new BlockItem(block, new Item.Settings()))
        );
    }

    public static void registerBlocks() {
        Latamland.LOGGER.info("Registrando bloques...");
    }
}
