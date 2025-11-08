package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Point implements Drawable {
    private int x;
    private int y;
    private Color color;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.GREEN;
    }

    public static Point random(int width, int height) {
        Random random = new Random();
        return new Point(random.nextInt(width), random.nextInt(height));
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void draw(Displayable displayable) {
        displayable.display(x, y, color);
    }

    public Color getColor() {
        return color;
    }
}
