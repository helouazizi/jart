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
        this.color = Color.MAGENTA;
    }

    public static Circle random(int width, int height) {
        Random random = new Random();
        Point center = new Point(random.nextInt(width), random.nextInt(height));
        int radius = random.nextInt(50) + 10;
        return new Circle(center, radius);
    }

    @Override
    public void draw(Displayable displayable) {
        int x0 = center.getX();
        int y0 = center.getY();
        int x = radius;
        int y = 0;
        int decisionOver2 = 1 - x;

        while (y <= x) {
            displayable.display( x + x0,  y + y0, color);
            displayable.display( y + x0,  x + y0, color);
            displayable.display(-x + x0,  y + y0, color);
            displayable.display(-y + x0,  x + y0, color);
            displayable.display(-x + x0, -y + y0, color);
            displayable.display(-y + x0, -x + y0, color);
            displayable.display( x + x0, -y + y0, color);
            displayable.display( y + x0, -x + y0, color);
            y++;
            if (decisionOver2 <= 0) {
                decisionOver2 += 2 * y + 1;
            } else {
                x--;
                decisionOver2 += 2 * (y - x) + 1;
            }
        }
    }

    @Override
    public Color getColor() {
        return color;
    }
}
