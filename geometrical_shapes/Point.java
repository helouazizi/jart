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
        this.color = Color.BLACK;
    }

    public static Point random(int width, int height) {
        Random random = new Random();
        return new Point(random.nextInt(width), random.nextInt(height));
    }

    public int getX() { return x; }
    public int getY() { return y; }

    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, color);
    }

    @Override
    public Color getColor() {
        return color;
    }
}
