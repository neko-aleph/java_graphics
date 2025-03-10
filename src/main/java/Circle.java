public class Circle extends Shape {
    private float radius;

    public Circle(Point location, float radius, float xspeed, float yspeed, Color color) {
        super(location, radius*2, radius*2, xspeed, yspeed, color);
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
}
