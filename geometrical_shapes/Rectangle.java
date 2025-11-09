package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {
    private Point p1, p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void draw(Displayable displayable) {
        Color color = getColor();

        Point p3 = new Point(p1.getX(), p2.getY());
        Point p4 = new Point(p2.getX(), p1.getY());
        
        Line l1 = new Line(p1, p3, color);
        Line l2 = new Line(p3, p2, color);
        Line l3 = new Line(p2, p4, color);
        Line l4 = new Line(p4, p1, color);

        l1.draw(displayable);
        l2.draw(displayable);
        l3.draw(displayable);
        l4.draw(displayable);

    }

    public Color getColor() {
        int c1 = (int) (Math.random() * (255 + 1));
        int c2 = (int) (Math.random() * (255 + 1));
        int c3 = (int) (Math.random() * (255 + 1));

        return Color.getHSBColor(c1, c2, c3);
    }
}
