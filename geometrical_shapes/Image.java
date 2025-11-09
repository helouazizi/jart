package geometrical_shapes;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image implements Displayable {
    private final BufferedImage image;

    public Image(int width, int height) {
        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }
    @Override
    public void display(int x, int y, Color color) {
    }

    @Override
    public void save(String string) {
        try {
            ImageIO.write(image, "png", new File(string));
        } catch (IOException e) {
            System.out.println(e);
        }

    }
    // Frame frame = new Frame();
}
