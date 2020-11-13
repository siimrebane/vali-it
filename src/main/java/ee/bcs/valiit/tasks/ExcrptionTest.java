package ee.bcs.valiit.tasks;

public class ExcrptionTest {
    public static void main(String[] args) {
        System.out.println(fib(1));
    }

    private static int fib(int i) {
        if (i < 1) {
            throw new RuntimeException();
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        return fib(i-1) + fib(i-2);
    }


}
