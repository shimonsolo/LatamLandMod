package net.shimonsolo.LatamLand.command;

import com.mojang.brigadier.Command;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class UnMuteCommand {
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("unmuteall")
                    .requires(source -> source.hasPermissionLevel(2)) // Requiere permisos de nivel 2
                    .executes(context -> {
                        ServerCommandSource source = context.getSource();

                        // Itera sobre todos los jugadores conectados
                        for (ServerPlayerEntity player : source.getServer().getPlayerManager().getPlayerList()) {
                            // Ejecuta el comando /vunmute para cada jugador
                            source.getServer().getCommandManager().executeWithPrefix(source, "vunmute " + player.getEntityName());
                        }

                        // Envía un mensaje de confirmación
                        source.sendFeedback(() -> Text.literal("Todos los jugadores han sido desmuteados."), true);
                        return Command.SINGLE_SUCCESS;
                    })
            );
        });
    }
}
