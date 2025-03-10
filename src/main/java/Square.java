public class Square extends Shape {
    private float side;

    public Square(Point location, float side, float xspeed, float yspeed, Color color) {
        super(location, side, side, xspeed, yspeed, color);
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
}
