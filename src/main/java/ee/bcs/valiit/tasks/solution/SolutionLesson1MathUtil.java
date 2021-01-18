package ee.bcs.valiit.tasks.solution;

public class SolutionLesson1MathUtil {
    private String test;

    public SolutionLesson1MathUtil(String test) {
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
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta a absoluut arv
    public static int abs(int a) {
        if(a >= 0){
            return a;
        } else {
            return -a;
        }
    }

    // TODO tagasta true, kui a on paaris arv
    // tagasta false kui a on paaritu arv
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    // TODO tagasta kolmest arvust kõige väiksem
    public static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    // TODO tagasta kolmest arvust kõige suurem
    public static int max(int a, int b, int c) {
        if(a >= b && a >= c){
            return a;
        } else if(b >= a && b >= c){
            return b;
        } else {
            return c;
        }
    }
}
