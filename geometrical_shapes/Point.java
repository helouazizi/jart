package geometrical_shapes;

import java.awt.Color;
import java.lang.Math;

public class Point implements Drawable {
    private int x, y;
    private Color color;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = getColor();
    }
    
    public int getX(){
        return x;
    }
     public int getY(){
        return y;
    }
    public void draw(Displayable displayable) {
        displayable.display(x, y, color);
    }
    public Color getColor() {
        int c1 = (int) (Math.random() * (255 + 1));
        int c2 = (int) (Math.random() * (255 + 1));
        int c3 = (int) (Math.random() * (255 + 1));

        return Color.getHSBColor(c1, c2, c3);
    }
}
