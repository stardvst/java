import java.awt.*;

public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    public Rectangle() {
        origin = new Point(0,0);
    }

    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    public Rectangle(int w, int h) {
        this(new Point(0, 0), w, h);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 7);
        System.out.println(rect.width);
        System.out.println(rect.height);
    }
}