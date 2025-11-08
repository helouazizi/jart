import geometrical_shapes.*;

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);

        // Draw a rectangle
        Rectangle rectangle = new Rectangle(new Point(50, 50), new Point(300, 200));
        rectangle.draw(image);

        // Draw a triangle
        Triangle triangle = new Triangle(
            new Point(100, 100),
            new Point(900, 900),
            new Point(100, 900)
        );
        triangle.draw(image);

        // Draw a line
        Line line = new Line(new Point(400, 400), new Point(800, 500));
        line.draw(image);

        // Draw a single point
        Point point = new Point(500, 500);
        point.draw(image);

        // Draw 50 random circles with random colors
        for (int i = 0; i < 50; i++) {
            Circle circle = Circle.random(image.getWidth(), image.getHeight());
            circle.draw(image);
        }

        // Save the final image
        image.save("image.png");
    }
}
