package net.shimonsolo.LatamLand.command;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.shimonsolo.LatamLand.screen.CustomScreen;

public class CardgiveCommand {

    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("card-give")
                    .then(CommandManager.argument("player", EntityArgumentType.player())
                            .then(CommandManager.argument("message", StringArgumentType.string())
                                    .then(CommandManager.argument("scale", FloatArgumentType.floatArg(0.1f, 5.0f))
                                            .executes(context -> {
                                                PlayerEntity player = EntityArgumentType.getPlayer(context, "player");

                                                String message = StringArgumentType.getString(context, "message");
                                                float scale = FloatArgumentType.getFloat(context, "scale");

                                                CustomScreen.setMessage(message);
                                                CustomScreen.setTextScale(scale);

                                                ServerCommandSource source = context.getSource();
                                                PlayerEntity sender = source.getPlayer();
                                                if (sender != null) {
                                                    sender.sendMessage(Text.of("El GUI de " + player.getEntityName() +
                                                            " ha sido actualizado con el mensaje: \"" + message +
                                                            "\" y la escala: " + scale), false);
                                                }

                                                giveCardToPlayer(player);

                                                return Command.SINGLE_SUCCESS;
                                            })))));
        });
    }

    private static void giveCardToPlayer(PlayerEntity player) {
        String giveCommand = "give " + player.getEntityName() + " latamland:card";

        ServerCommandSource source = player.getServer().getCommandSource();
        source.getServer().getCommandManager().executeWithPrefix(source, giveCommand);
    }
}