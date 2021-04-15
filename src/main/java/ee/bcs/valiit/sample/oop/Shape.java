package ee.bcs.valiit.sample.oop;

public abstract class Shape {
    int x;
    int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Shape b) {
        return Math.sqrt(Math.pow(this.x - b.getX(), 2) + Math.pow(this.y- b.getY(), 2));
    }

    public abstract double circumference();

    public abstract double area();
}
