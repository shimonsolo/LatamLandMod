package net.shimonsolo.LatamLand.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;

public class CustomScreenHandler extends ScreenHandler {

    public CustomScreenHandler(int syncId, PlayerInventory playerInventory) {
        super(ModScreenHandlers.CUSTOM_SCREEN_HANDLER, syncId);
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int index) {
        return ItemStack.EMPTY;
    }
}
