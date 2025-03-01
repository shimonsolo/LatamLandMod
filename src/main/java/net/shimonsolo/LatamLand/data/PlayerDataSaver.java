package net.shimonsolo.LatamLand.data;

import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;

public class PlayerDataSaver {
    public static final TrackedData<String> CARD_MESSAGE = TrackedDataHandlerRegistry.STRING.create(0);

    public static void init(PlayerEntity player) {
        String currentMessage = player.getDataTracker().get(CARD_MESSAGE);
        if (currentMessage == null || currentMessage.isEmpty()) {
            player.getDataTracker().set(CARD_MESSAGE, "Hello World");
        }
    }

    public static String getMessage(PlayerEntity player) {
        return player.getDataTracker().get(CARD_MESSAGE);
    }

    public static void setMessage(PlayerEntity player, String message) {
        if (message != null && !message.isEmpty()) {
            player.getDataTracker().set(CARD_MESSAGE, message);
        }
    }
}
