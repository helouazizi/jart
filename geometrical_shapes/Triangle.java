package geometrical_shapes;

import java.awt.Color;

public class Triangle implements Drawable {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;
    private Color color;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;

        this.color = Color.RED;
    }

    @Override
    public Color getColor() {
        return this.color;
    }


    @Override
    public void draw(Displayable d) {
        Line side1 = new Line(vertex1, vertex2);
        Line side2 = new Line(vertex2, vertex3);
        Line side3 = new Line(vertex3, vertex1);

        // Tell each line to use the Triangle's color before drawing
        side1.setColor(this.color);
        side2.setColor(this.color);
        side3.setColor(this.color);

        // Now, when you draw them, they will use the new color
        side1.draw(d);
        side2.draw(d);
        side3.draw(d);
    }

}