package net.shimonsolo.LatamLand.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.shimonsolo.LatamLand.screen.CustomScreenHandler;

public class ItemCard extends Item {
    public ItemCard(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (!world.isClient) {
            player.openHandledScreen(new SimpleNamedScreenHandlerFactory(
                    (syncId, inventory, playerEntity) -> new CustomScreenHandler(syncId, inventory),
                    Text.of("Hello World")
            ));
        }
        return TypedActionResult.success(player.getStackInHand(hand));
    }
}
