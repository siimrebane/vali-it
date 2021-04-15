package ee.bcs.valiit.sample.oop;

public class Circle extends Shape {
    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double circumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
}
