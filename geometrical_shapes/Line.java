package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {
    private Point start;
    private Point end;
    private Color color;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.color = Color.WHITE;
    }

    public static Line random(int width, int height) {
        return new Line(Point.random(width, height), Point.random(width, height));
    }

    public void draw(Displayable displayable) {
        int x1 = start.getX();
        int y1 = start.getY();
        int x2 = end.getX();
        int y2 = end.getY();

        // Bresenham line algorithm
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = x1 < x2 ? 1 : -1;
        int sy = y1 < y2 ? 1 : -1;
        int err = dx - dy;

        while (true) {
            displayable.display(x1, y1, color);
            if (x1 == x2 && y1 == y2) break;
            int e2 = 2 * err;
            if (e2 > -dy) { err -= dy; x1 += sx; }
            if (e2 < dx) { err += dx; y1 += sy; }
        }
    }

    public Color getColor() {
        return color;
    }
}
