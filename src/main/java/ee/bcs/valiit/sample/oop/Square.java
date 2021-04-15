package ee.bcs.valiit.sample.oop;

public class Square extends Shape{
    private int sideLength;

    public Square(int x, int y, int sideLength){
        super(x, y);
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }


    @Override
    public double circumference() {
        return 4* sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }
}
