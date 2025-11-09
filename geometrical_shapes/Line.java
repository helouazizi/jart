package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {
    private Point p1, p2;
    private Color color;

    public Line(Point p1, Point p2, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }

    public void draw(Displayable displayable) {
        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();
        int step = Math.abs(dx) > Math.abs(dy) ? Math.abs(dx) : Math.abs(dy);
        float x_incr = (float) dx / step;
        float y_incr = (float) dy / step;
        float x = p1.getX();
        float y = p1.getY();
        for (int i = 0; i < step; i++) {
            displayable.display((int)x,(int) y, color);
            x += x_incr;
            y += y_incr;
        }
    }

    public Color getColor() {
        int c1 = (int) (Math.random() * (255 + 1));
        int c2 = (int) (Math.random() * (255 + 1));
        int c3 = (int) (Math.random() * (255 + 1));

        return Color.getHSBColor(c1, c2, c3);
    }
}
