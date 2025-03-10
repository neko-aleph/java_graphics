import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {
    private ArrayList<Circle> circles = new ArrayList<>();
    private ArrayList<Square> squares = new ArrayList<>();
    private ArrayList<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void settings() {
        size(800, 600);
    }

    public void draw() {
        background(102);
        for (Shape shape : shapes) {
            shape.move();
        }
        for (Circle circle : circles) {
            Color c = circle.getColor();
            fill(c.getR(), c.getG(), c.getB());
            Point location = circle.getLocation();
            float radius = circle.getRadius();
            ellipse(location.getX(), location.getY(), radius * 2, radius * 2);
        }
        for (Square square : squares) {
            Color c = square.getColor();
            fill(c.getR(), c.getG(), c.getB());
            Point location = square.getLocation();
            float side = square.getSide();
            rect(location.getX(), location.getY(), side, side);
        }
    }

    public void mousePressed() {
        if (mouseButton == LEFT) {
            float rnd = random(0, 1);
            float xspeed = random(2, 5) * (random(1) > 0.5 ? 1 : -1);
            float yspeed = random(2, 5) * (random(1) > 0.5 ? 1 : -1);
            int r = (int)random(0, 255);
            int g = (int)random(0, 255);
            int b = (int)random(0, 255);
            Color c = new Color(r, g, b);
            if (rnd < 0.5) {
                float radius = random(10, 30);
                Circle circle = new Circle(mouseX, mouseY, radius, xspeed , yspeed, c);
                circles.add(circle);
                shapes.add(circle);
            } else {
                float side = random(10, 25);
                Square square = new Square(mouseX, mouseY, side, xspeed, yspeed, c);
                squares.add(square);
                shapes.add(square);
            }

        } else if (mouseButton == RIGHT) {
            circles.clear();
            squares.clear();
            shapes.clear();
        }
    }
}
