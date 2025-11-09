package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {
    private Point corner1;
    private Point corner2;
    private Color color;

    public Rectangle(Point corner1, Point corner2) {
        this.corner1 = corner1;
        this.corner2 = corner2;
        this.color = Color.BLUE;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void draw(Displayable d) {
        int minX = Math.min(corner1.getX(), corner2.getX());
        int maxX = Math.max(corner1.getX(), corner2.getX());
        int minY = Math.min(corner1.getY(), corner2.getY());
        int maxY = Math.max(corner1.getY(), corner2.getY());

        for (int y = minY; y <= maxY; y++) {
            for (int x = minX; x <= maxX; x++) {

                if (y == minY || y == maxY || x == minX || x == maxX) {
                    d.display(x, y, this.color);
                }
            }
        }
    }
}
