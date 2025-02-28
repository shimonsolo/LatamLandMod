package net.shimonsolo.LatamLand.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {

    public static final ScreenHandlerType<CustomScreenHandler> CUSTOM_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier("latamland", "custom_gui"), CustomScreenHandler::new);

    public static void register() {

    }
}
