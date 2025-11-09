package geometrical_shapes;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image implements Displayable {
    private BufferedImage bufferedImage;
    private int width;
    private int height;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        this.bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
          for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                bufferedImage.setRGB(x, y, Color.BLACK.getRGB());
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void display(int x, int y, Color color) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            bufferedImage.setRGB(x, y, color.getRGB());
        }
    }

    public void save(String filename) {
        try {
            ImageIO.write(bufferedImage, "png", new File(filename));
            System.out.println("Image saved successfully to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving image: " + e.getMessage());
            e.printStackTrace();
        }
    }
}