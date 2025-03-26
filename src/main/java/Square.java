import processing.core.PApplet;

public class Square extends Shape {
    private float side;

    public Square(Point location, float side, float xspeed, float yspeed, Color color) {
        super(location, xspeed, yspeed, color);
        this.side = side;
    }

    public Square(float x, float y, float side, float xspeed, float yspeed, Color color) {
        this(new Point(x, y), side, xspeed, yspeed, color);
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void render(PApplet pApplet) {
        pApplet.fill(getColor().getR(), getColor().getG(), getColor().getB());
        pApplet.rect(location.getX(), location.getY(), side, side);
    }

    @Override
    public void move() {
        location.setX(location.getX() + xspeed);
        location.setY(location.getY() + yspeed);

        if (location.getX() > 800 - side/2 || location.getX() < side/2) {
            xspeed *= -1;
        }
        if (location.getY()> 600 - side/2 || location.getY() < side/2) {
            yspeed *= -1;
        }
    }
}
