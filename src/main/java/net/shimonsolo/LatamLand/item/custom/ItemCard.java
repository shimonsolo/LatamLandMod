package net.shimonsolo.LatamLand.item.custom;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.shimonsolo.LatamLand.screen.CustomScreen;

public class ItemCard extends Item {
    public ItemCard(Settings settings) {
        super(settings);
    }


    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (world.isClient) {
            MinecraftClient.getInstance().setScreen(new CustomScreen(Text.of("Título de pantalla")));
        }
        return TypedActionResult.success(player.getStackInHand(hand));
    }}