package net.shimonsolo.LatamLand.screen;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.MatrixStack;

import java.util.List;

public class CustomScreen extends Screen {

    private static final Identifier BACKGROUND_TEXTURE = new Identifier("latamland", "textures/gui/card_background.png");

    private static String message = "Hello World"; // Texto predeterminado
    private static float textScale = 2.0f; // Tamaño de la fuente predeterminado (escala)

    public CustomScreen(Text title) {
        super(title);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);

        // Tamaño de la imagen
        int imageWidth = 200;
        int imageHeight = 150;

        int x = (this.width - imageWidth) / 2;
        int y = (this.height - imageHeight) / 2;

        context.drawTexture(BACKGROUND_TEXTURE, x, y, 0, 0, imageWidth, imageHeight, imageWidth, imageHeight);

        String currentMessage = message;

        List<String> lines = List.of(currentMessage.split("/n"));

        float scale = textScale;

        MatrixStack matrices = context.getMatrices();
        matrices.push();
        matrices.scale(scale, scale, 1.0f);

        int textX = (int) ((x + (imageWidth / 2) - (this.textRenderer.getWidth(currentMessage) / 2) * scale) / scale);
        int textY = (int) ((y + (imageHeight / 2) - 4) / scale);

        for (String line : lines) {
            context.drawText(this.textRenderer, line, textX, textY, 0x000000, false);
            textY += 10;
        }

        matrices.pop();

        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public void renderBackground(DrawContext context) {
        super.renderBackground(context);
    }

    public static void setMessage(String newMessage) {
        message = newMessage;
    }

    public static void setTextScale(float scale) {
        textScale = scale;
    }
}
