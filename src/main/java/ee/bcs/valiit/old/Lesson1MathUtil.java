package ee.bcs.valiit.old;

public class Lesson1MathUtil {
    private String test;

    public Lesson1MathUtil(String test) {
        this.test = test;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Lesson1MathUtil lesson1MathUtil1 = new Lesson1MathUtil("test");
        Lesson1MathUtil lesson1MathUtil2 = new Lesson1MathUtil("test2");
        lesson1MathUtil1.test();
        lesson1MathUtil2.test();

        int[][] twoArray = new int[3][4];
    }

    public void test(){
        System.out.println(test);
    }

    public static int min(int a, int b) {
        // TODO tagasta a ja b väikseim väärtus
        return 0;
    }

    public static int max(int a, int b) {
        // TODO tagasta a ja b suurim väärtus
        return 0;
    }

    public static int abs(int a) {
        // TODO tagasta a absoluut arv
        return 0;
    }

    public static boolean isEven(int a) {
        // TODO tagasta true, kui a on paaris arv
        // tagasta false kui a on paaritu arv
        return false;
    }

    public static int min(int a, int b, int c) {
        // TODO tagasta a, b ja c väikseim väärtus
        return 0;
    }

    public static int max(int a, int b, int c) {
        // TODO tagasta a, b ja c suurim väärtus
        return 0;
    }

}
