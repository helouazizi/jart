package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    private Point center;
    private int radius;
    private Color color;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        this.color = Color.GREEN;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void draw(Displayable d) {
        int centerX = center.getX();
        int centerY = center.getY();
        int x = radius;
        int y = 0;
        int err = 0;

        while (x >= y) {
            d.display(centerX + x, centerY + y, this.color);
            d.display(centerX + y, centerY + x, this.color);
            d.display(centerX - y, centerY + x, this.color);
            d.display(centerX - x, centerY + y, this.color);
            d.display(centerX - x, centerY - y, this.color);
            d.display(centerX - y, centerY - x, this.color);
            d.display(centerX + y, centerY - x, this.color);
            d.display(centerX + x, centerY - y, this.color);

            if (err <= 0) {
                y += 1;
                err += 2 * y + 1;
            }
            if (err > 0) {
                x -= 1;
                err -= 2 * x + 1;
            }
        }
    }

    public static Circle random(int widthBound, int heightBound) {
        Random rand = new Random();
        Point randomCenter = Point.random(widthBound, heightBound);
        int maxRadius = Math.min(widthBound, heightBound) / 5;
        int randomRadius = rand.nextInt(maxRadius) + 5;
        return new Circle(randomCenter, randomRadius);
    }
}
