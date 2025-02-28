package net.shimonsolo.LatamLand.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.shimonsolo.LatamLand.Latamland;
import net.shimonsolo.LatamLand.blocks.ModBlocks;

public class ModitemGroups {
    public static final ItemGroup LATAM_BLOCK_GROUP = registerItemGroup("latam_block_group",
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.Latamland.latam_block_group"))
                    .icon(() -> new ItemStack(Moditems.LATAM))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.LATAM_BLOCK.getRight());
                        entries.add(ModBlocks.STAGE_BLOCK.getRight());
                        entries.add(ModBlocks.STAGE_BLOCK_SLAB.getRight());
                        entries.add(ModBlocks.STAGE_BLOCK_STAIRS.getRight());
                        entries.add(ModBlocks.SPEAKER.getRight());
                        entries.add(ModBlocks.STAND.getRight());
                        entries.add(ModBlocks.MICROPHONESTAND.getRight());
                        entries.add(ModBlocks.MICPODCAST.getRight());
                        entries.add(ModBlocks.TABLE.getRight());
                        entries.add(ModBlocks.SEAT.getRight());
                        entries.add(ModBlocks.SUBWOOFER18.getRight());
                        entries.add(ModBlocks.SPEAKER2.getRight());

                        entries.add(ModBlocks.GOLD_BLOCK_SLAB.getRight());
                        entries.add(ModBlocks.GOLD_BLOCK_STAIRS.getRight());
                        entries.add(ModBlocks.GOLD_BLOCK_WALL.getRight());
                        entries.add(ModBlocks.GOLD_BLOCK_VERTICAL_SLAB.getRight());
                        entries.add(ModBlocks.GOLD_BLOCK_VERTICAL_STAIRS.getRight());

                        entries.add(ModBlocks.DIRT_PATH_SLAB.getRight());
                        entries.add(ModBlocks.DIRT_PATH_STAIRS.getRight());

                        entries.add(ModBlocks.MAGIC_CUBE.getRight());

                        entries.add(ModBlocks.WHITE_CONCRETE_SLAB.getRight());
                        entries.add(ModBlocks.WHITE_CONCRETE_VERTICAL_SLAB.getRight());
                        entries.add(ModBlocks.BLACK_CONCRETE_SLAB.getRight());

                        entries.add(ModBlocks.GRAY_CONCRETE_SLAB.getRight());
                        entries.add(ModBlocks.GRAY_CONCRETE_STAIRS.getRight());

                        entries.add(ModBlocks.MUD_BRICK_VERTICAL_SLAB.getRight());
                        entries.add(Moditems.ANIMATED_BLOCK_ITEM);
                        entries.add(ModBlocks.WHITE_BRICKS.getRight());
                    })
                    .build()
    );

    public static final ItemGroup LATAM_ITEM_GROUP = registerItemGroup("latam_item_group",
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.Latamland.latam_item_group"))
                    .icon(() -> new ItemStack(Moditems.LIGHTNING_STICK))
                    .entries((displayContext, entries) -> {
                        entries.add(Moditems.LATAM);
                        entries.add(Moditems.LIGHTNING_STICK);
                        entries.add(Moditems.MICROPHONE);
                        entries.add(Moditems.CARD);
                    })
                    .build()
    );

    private static ItemGroup registerItemGroup(String itemId, ItemGroup itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, new Identifier(Latamland.MODID, itemId), itemGroup);
    }

    public static void registerItemGoups() {
        Latamland.LOGGER.info("Registrando grupos de items...");
    }
}
