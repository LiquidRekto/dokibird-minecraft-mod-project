package net.dragoons.dokimod.util;

import net.dragoons.dokimod.cfg.GlobalCfg;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class ChatLogger {

    public static PlayerEntity player = null;

    public static void loadPlayer(PlayerEntity playerEntity) {
        player = playerEntity;
    }

    public static void log(String message) {
        if (!GlobalCfg.IS_CHAT_DEBUG) return;
        Text msg = new FormattedMessage.Builder().appendWithFormat(
                "{}: " + message,
                new FormattedMessage("[DEBUG]", Formatting.AQUA)
        ).build();
        player.sendMessage(msg);
    }
    public static void warn(String message) {
        if (!GlobalCfg.IS_CHAT_DEBUG) return;
        Text msg = new FormattedMessage.Builder().appendWithFormat(
                "{}: " + message,
                new FormattedMessage("[WARN]", Formatting.YELLOW)
        ).build();
        player.sendMessage(msg);
    }

    public static void error(String message) {
        if (!GlobalCfg.IS_CHAT_DEBUG) return;
        Text msg = new FormattedMessage.Builder().appendWithFormat(
                "{}: " + message,
                new FormattedMessage("[ERROR]", Formatting.RED)
        ).build();
        player.sendMessage(msg);
    }


    public static void format(String message) {
        Text msg = new FormattedMessage.Builder().appendWithFormat(
                "{}: " + message,
                new FormattedMessage("[DEBUG]", Formatting.YELLOW)
        ).build();
        player.sendMessage(msg);
    }
}
