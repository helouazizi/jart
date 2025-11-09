package geometrical_shapes;

import java.util.Random;
import java.awt.Color;

public class Point implements Drawable {

    private int x;
    private int y;
    private Color color;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.RED;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void draw(Displayable d) {

        d.display(this.x, this.y, this.color);
    }

    public static Point random(int widthBound, int heightBound) {
        Random rand = new Random();
        int randomX = rand.nextInt(widthBound);
        int randomY = rand.nextInt(heightBound);
        return new Point(randomX, randomY);
    }
}