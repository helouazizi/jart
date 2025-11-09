package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    private Point center;
    private int radius;
    private Color color;

    public Circle(Point center, int radius, Color color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    public Circle(Point center, int radius) {
        this(center, radius, Color.MAGENTA);
    }

    public static Circle random(int width, int height) {
        Random random = new Random();
        Point center = new Point(random.nextInt(width), random.nextInt(height));
        int radius = random.nextInt(50) + 10;

        Color color = new Color(
            random.nextInt(256),
            random.nextInt(256),
            random.nextInt(256)
        );

        return new Circle(center, radius, color);
    }

    public void draw(Displayable displayable) {
        System.out.println(String.format("%d %d %d",this.radius,this.center.getX(),this.center.getY()));
    }

    public Color getColor() {
        int c1 = (int) (Math.random() * (255 + 1));
        int c2 = (int) (Math.random() * (255 + 1));
        int c3 = (int) (Math.random() * (255 + 1));

        return Color.getHSBColor(c1, c2, c3);
    }
}
