package geometrical_shapes;

import java.awt.Color;

public class Line {

    private Point startPoint;
    private Point endPoint;
    private Color color;

    public Line(Point start, Point end) {
        this.startPoint = start;
        this.endPoint = end;
        this.color = Color.GREEN;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Color getColor() {
        return this.color;
    }

    public void draw(Displayable d) {
        int x1 = startPoint.getX();
        int y1 = startPoint.getY();
        int x2 = endPoint.getX();
        int y2 = endPoint.getY();

        int dx = x2 - x1;
        int dy = y2 - y1;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float xIncrement = (float) dx / steps;
        float yIncrement = (float) dy / steps;
        float x = x1;
        float y = y1;

        for (int i = 0; i <= steps; i++) {
            d.display(Math.round(x), Math.round(y), Color.CYAN);
            x += xIncrement;
            y += yIncrement;
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Line random(int widthBound, int heightBound) {
        Point randomP1 = Point.random(widthBound, heightBound);
        Point randomP2 = Point.random(widthBound, heightBound);
        return new Line(randomP1, randomP2);
    }
}