package de.fhkiel.iue.oopming;

public class Point {
    private float x;
    private float y;

    // Konstruktor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getter und setter
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


    static Point randomPoint() {
        return Point.randomPoint(0, 600, 0, 400);
    }

    static Point randomPoint(int minx, int maxx, int miny, int maxy) {
        return new Point(minx + (int) (Math.random() * (maxx - minx)), miny + (int) (Math.random() * (maxy - miny)));
    }
}
