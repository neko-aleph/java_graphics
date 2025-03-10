import iface.Movable;

public abstract class Shape implements Movable {
    protected Point location;
    protected float width;
    protected float height;
    protected float xspeed;
    protected float yspeed;
    protected Color color;

    public Shape(Point location, float width, float height, float xspeed, float yspeed, Color color) {
        this.location = location;
        this.width = width;
        this.height = height;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
        this.color = color;
    }

    public Shape(float x, float y, float width, float height, float xspeed, float yspeed, Color color) {
        this(new Point(x, y), width, height, xspeed, yspeed, color);
    }

    public Shape() {
        this(0, 0, 50, 50, 1, 1, new Color(255, 255, 255));
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
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

    @Override
    public void move() {
        location.setX(location.getX() + xspeed);
        location.setY(location.getY() + yspeed);

        if (location.getX() > 800 - width/2 || location.getX() < width/2) {
            xspeed *= -1;
        }
        if (location.getY()> 600 - height/2 || location.getY() < height/2) {
            yspeed *= -1;
        }
    }
}
