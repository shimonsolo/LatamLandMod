package net.shimonsolo.LatamLand.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class CatchMagic extends Item {
    public CatchMagic(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        context.getPlayer().sendMessage(Text.of("Hiciste click en un bloque."));
        return ActionResult.PASS;
    }
}
