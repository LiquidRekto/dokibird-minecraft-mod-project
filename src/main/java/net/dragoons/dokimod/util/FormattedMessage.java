package net.dragoons.dokimod.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minecraft.server.MinecraftServer;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FormattedMessage {
    private MutableText baseText;

    private String message;
    private Formatting color;

    private boolean isTranslatable;

    public FormattedMessage(String message, Formatting color) {
        this.message = message;
        this.color = color;
    }

    public FormattedMessage(String message, Formatting color, boolean isTranslatable) {
        this.message = message;
        this.color = color;
        this.isTranslatable = isTranslatable;
    }

    public FormattedMessage(String message) {
        this.message = message;
        this.color = Formatting.WHITE;
    }

    @Getter
    public static class Builder {
        private MutableText baseText;

        public Builder append(FormattedMessage msgBlock) {
            if (this.baseText == null) this.baseText = Text.literal("");
            this.baseText.append(
                    msgBlock.isTranslatable
                            ? Text.translatable(msgBlock.getMessage()).setStyle(Style.EMPTY.withColor(msgBlock.getColor()))
                            : Text.literal(msgBlock.getMessage()).setStyle(Style.EMPTY.withColor(msgBlock.getColor()))
            );
            return this;
        }

        // NOTE
        // Use {} for the formatted texts
        // Template text is default to be white
        public Builder appendWithFormat(String templateText, FormattedMessage... messages) {
            Builder builder = this;
            // Separate via {}
            String[] separatedTexts = templateText.split("\\{\\}");
            for (int i = 0; i < separatedTexts.length; i++) {
                // The unformatted part
                builder = builder.append(new FormattedMessage(separatedTexts[i]));
                // The formatted part
                // If the index is out of range or not
                if (i <= messages.length - 1) {
                    builder = builder.append(messages[i]);
                }
            }
            return builder;
        }

        public Text build() {
            return baseText;
        }
    }
}
