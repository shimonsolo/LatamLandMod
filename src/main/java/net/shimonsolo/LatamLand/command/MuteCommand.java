package net.shimonsolo.LatamLand.command;

import com.mojang.brigadier.Command;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class MuteCommand {
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("muteall")
                    .requires(source -> source.hasPermissionLevel(2))
                    .executes(context -> {
                        ServerCommandSource source = context.getSource();


                        for (ServerPlayerEntity player : source.getServer().getPlayerManager().getPlayerList()) {
                            source.getServer().getCommandManager().executeWithPrefix(source, "vmute " + player.getEntityName());
                        }


                        source.sendFeedback(() -> Text.literal("Todos los jugadores han sido muteados."), true);
                        return Command.SINGLE_SUCCESS;
                    })
            );
        });
    }
}