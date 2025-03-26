import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {
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
            shape.render(this);
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
                shapes.add(circle);
            } else {
                float side = random(10, 25);
                Square square = new Square(mouseX, mouseY, side, xspeed, yspeed, c);
                shapes.add(square);
            }

        } else if (mouseButton == RIGHT) {
            shapes.clear();
        }
    }
}
