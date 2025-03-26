import processing.core.PApplet;

public class Circle extends Shape{
    private float radius;

    public Circle(Point location, float radius, float xspeed, float yspeed, Color color) {
        super(location, xspeed, yspeed, color);
        this.radius = radius;
    }

    public Circle(float x, float y, float radius, float xspeed, float yspeed, Color color) {
        this(new Point(x, y), radius, xspeed, yspeed, color);
    }

    public Circle() {
        this(new Point(), 20, 1, 1, new Color());
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void render(PApplet pApplet) {
        pApplet.fill(getColor().getR(), getColor().getG(), getColor().getB());
        pApplet.ellipse(location.getX(), location.getY(), radius * 2, radius * 2);
    }

    @Override
    public void move() {
        location.setX(location.getX() + xspeed);
        location.setY(location.getY() + yspeed);

        if (location.getX() > 800 - radius || location.getX() < radius) {
            xspeed *= -1;
        }
        if (location.getY()> 600 - radius || location.getY() < radius) {
            yspeed *= -1;
        }
    }
}
