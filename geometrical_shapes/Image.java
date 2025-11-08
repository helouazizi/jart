package geometrical_shapes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Image implements Displayable {
    private final BufferedImage canvas;

    public Image(int width, int height) {
        canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // Fill background with black
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                canvas.setRGB(x, y, Color.BLACK.getRGB());
            }
        }
    }

    public void display(int x, int y, Color color) {
        if (x >= 0 && y >= 0 && x < canvas.getWidth() && y < canvas.getHeight()) {
            canvas.setRGB(x, y, color.getRGB());
        }
    }

    public void save(String filename) {
        try {
            ImageIO.write(canvas, "png", new File(filename));
            System.out.println("Image saved as " + filename);
        } catch (IOException e) {
            System.out.println("Failed to save image: " + e.getMessage());
        }
    }

    public int getWidth() {
        return canvas.getWidth();
    }

    public int getHeight() {
        return canvas.getHeight();
    }
}
