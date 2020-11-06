package ee.bcs.valiit;

public class Pair {
    private int a;
    private int b;
    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public Pair setA(int a) {
        this.a = a;
        return this;
    }

    public int getB() {
        return b;
    }

    public Pair setB(int b) {
        this.b = b;
        return this;
    }
}
