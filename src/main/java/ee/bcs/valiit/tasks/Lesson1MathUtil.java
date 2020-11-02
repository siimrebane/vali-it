package ee.bcs.valiit.tasks;

public class Lesson1MathUtil {
    private String test;

    public Lesson1MathUtil(String test) {
        this.test = test;
    }

    public static void main(String[] args) {
        System.out.println(min(3, 6));
        System.out.println(min(3, -6));
        String a = "asdf";
        String b = "asdf";
        if (a == b) {
            System.out.println("test");
        }
    }

    public static int min(int a, int b) {
        // TODO tagasta a ja b väikseim väärtus
        if (a <= b) {
            return a;
        }
        return b;
    }

    public static int max(int a, int b) {
        // TODO tagasta a ja b suurim väärtus
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            return b;
        }
    }

    public static int abs(int a) {
        // TODO tagasta a absoluut arv
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public static boolean isEven(int a) {
        // TODO tagasta true, kui a on paaris arv
        // tagasta false kui a on paaritu arv
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int min(int a, int b, int c) {
        int sisemine = min(a, b);
        return min(sisemine, c);
    }

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }
}
