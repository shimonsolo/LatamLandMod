package net.shimonsolo.LatamLand.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shimonsolo.LatamLand.Latamland;
import net.shimonsolo.LatamLand.blocks.ModBlocks;
import net.shimonsolo.LatamLand.item.custom.*;

public class Moditems {
    public static final net.minecraft.item.Item LATAM = registerItem("latam", new Latamitem(new net.minecraft.item.Item.Settings()));
    public static final net.minecraft.item.Item LIGHTNING_STICK = registerItem("lightning_stick", new LightningStick(new net.minecraft.item.Item.Settings()));
    public static final net.minecraft.item.Item CATCH_MAGIC = registerItem("catch_magic", new LightningStick(new net.minecraft.item.Item.Settings()));
    public static final net.minecraft.item.Item MICROPHONE = registerItem("microphone", new ItemCard(new net.minecraft.item.Item.Settings()));
    public static final net.minecraft.item.Item CARD = registerItem("card", new ItemCard(new net.minecraft.item.Item.Settings()));


    public static final net.minecraft.item.Item ANIMATED_BLOCK_ITEM = registerItem(
            "animated_block", new AnimatedBlockItem(ModBlocks.ANIMATED_BLOCK, new FabricItemSettings()));


    private static net.minecraft.item.Item registerItem(String itemId, net.minecraft.item.Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Latamland.MODID, itemId), item);
    }

    public static void registerItems() {
        Latamland.LOGGER.info("Registrando items...");
    }
}