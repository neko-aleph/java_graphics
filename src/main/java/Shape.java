import iface.Movable;
import processing.core.PApplet;

import java.awt.*;

public abstract class Shape implements Movable {
    protected Point location;
    protected float xspeed;
    protected float yspeed;
    protected Color color;

    public Shape(Point location, float xspeed, float yspeed, Color color) {
        this.location = location;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
        this.color = color;
    }

    public Shape(float x, float y, float xspeed, float yspeed, Color color) {
        this(new Point(x, y), xspeed, yspeed, color);
    }

    public Shape() {
        this(0, 0, 1, 1, new Color(255, 255, 255));
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void render(PApplet pApplet);
}
