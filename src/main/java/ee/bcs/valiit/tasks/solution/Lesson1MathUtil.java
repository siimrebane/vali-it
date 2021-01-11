package ee.bcs.valiit.tasks.solution;

public class Lesson1MathUtil {
    private String test;

    public Lesson1MathUtil(String test) {
        this.test = test;
    }

    public static void main(String[] args) {
        System.out.println(min(3, 5));
        System.out.println(min(-1, -9));
    }

    // TODO tagasta a ja b väikseim väärtus
    public static int min(int a, int b) {
        if(a < b){
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta a ja b suurim väärtus
    public static int max(int a, int b) {
        return 0;
    }

    // TODO tagasta a absoluut arv
    public static int abs(int a) {
        return 0;
    }

    // TODO tagasta true, kui a on paaris arv
    // tagasta false kui a on paaritu arv
    public static boolean isEven(int a) {
        return true;
    }

    // TODO tagasta kolmest arvust kõige väiksem
    public static int min(int a, int b, int c) {
        return 0;
    }

    // TODO tagasta kolmest arvust kõige suurem
    public static int max(int a, int b, int c) {
        return 0;
    }
}
