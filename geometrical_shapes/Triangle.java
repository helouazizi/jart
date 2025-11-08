package geometrical_shapes;

import java.awt.Color;

public class Triangle implements Drawable {
    private Point a, b, c;
    private Color color;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = Color.RED;
    }

    public void draw(Displayable displayable) {
        new Line(a, b).draw(displayable);
        new Line(b, c).draw(displayable);
        new Line(c, a).draw(displayable);
    }

    public Color getColor() {
        return color;
    }
}
