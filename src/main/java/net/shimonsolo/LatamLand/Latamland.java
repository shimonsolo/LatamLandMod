package net.shimonsolo.LatamLand;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.shimonsolo.LatamLand.blocks.ModBlocks;
import net.shimonsolo.LatamLand.blocks.entity.ModBlockEntities;
import net.shimonsolo.LatamLand.command.MuteCommand;
import net.shimonsolo.LatamLand.command.UnMuteCommand;
import net.shimonsolo.LatamLand.item.ModitemGroups;
import net.shimonsolo.LatamLand.item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class Latamland implements ModInitializer {

    public static final String MODID = "latamland";

    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        Moditems.registerItems();
        ModitemGroups.registerItemGoups();
        ModBlockEntities.registerAllBlockEntities();
        MuteCommand.register();
        UnMuteCommand.register();

        GeckoLib.initialize();

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.LATAM_BLOCK.getLeft())
                .lightWithItem(Moditems.LATAM)
                .destDimID(new Identifier(Latamland.MODID, "event"))
                .tintColor(0,0,0)
                .registerPortal();
    }
}
