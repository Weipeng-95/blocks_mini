package de.fhkiel.iue.oopming;

import processing.core.PApplet;

import java.awt.*;

public class Main extends PApplet {
    private Circle circle = new Circle(new Point(100, 100), new Color(255, 0, 0), 100);
    private Square square = new Square(new Point(250, 100), new Color(0, 255, 0), 100);
    private EquiTriangle triangle = new EquiTriangle(new Point(400, 100), new Color(0, 0, 255), 100);

    public static void main(String[] args) {
        PApplet.main("de.fhkiel.iue.oopming.Main");
    }

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void draw() {
        background(0);
        circle.draw(this);
        
        square.draw(this);
        triangle.draw(this);

    }
}
