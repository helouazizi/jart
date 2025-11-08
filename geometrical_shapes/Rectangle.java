package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {
    private Point topLeft;
    private Point bottomRight;
    private Color color;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.color = Color.BLUE;
    }

    public void draw(Displayable displayable) {
        Point topRight = new Point(bottomRight.getX(), topLeft.getY());
        Point bottomLeft = new Point(topLeft.getX(), bottomRight.getY());

        new Line(topLeft, topRight).draw(displayable);
        new Line(topRight, bottomRight).draw(displayable);
        new Line(bottomRight, bottomLeft).draw(displayable);
        new Line(bottomLeft, topLeft).draw(displayable);
    }

    public Color getColor() {
        return color;
    }
}
