package ee.bcs.valiit.solution;

import java.util.Scanner;

// TODO kasuta if/else. Ära kasuta Math librarit
public class Lesson1Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vali meetod, mida tahad tööle panna");
        System.out.println("1 - min");
        System.out.println("2 - max");
        System.out.println("0 - välju");

        int choise = scanner.nextInt();
        if(choise == 1){
            System.out.println("sisesta number");
            int a = scanner.nextInt();
            System.out.println("sisesta teine number");
            int b = scanner.nextInt();
            System.out.println("Nendest kõige väiksem on: " + min(a, b));
        }

    }


    // TODO tagasta kolmest arvust kõige väiksem
    // min3(a = 1, b = 2, c = 3)
    public static int min3(int a, int b, int c) {
        if(a <= b && a <= c){
            return a;
        } else if(b <= a && b <= c){
            return b;
        } else {
            return c;
        }
    }

    // TODO tagasta a ja b väikseim väärtus
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta a ja b suurim väärtus
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta a absoluut arv
    public static int abs(int a) {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }

    // TODO tagasta true, kui a on paaris arv
    // tagasta false kui a on paaritu arv
    public static boolean isEven(int a) {
        if(a % 2 == 0){
            return true;
        } else {
            return false;
        }
    }



    // TODO tagasta kolmest arvust kõige suurem
    public static int max3(int a, int b, int c) {
        return max(max(a, b), c);
    }

    // TODO
    //  Tagasta string mille väärtus oleks "\"\\""
    //  Trüki muutuja sisu välja
    public static String someString() {
        return "\"\\\"\\\\\"\"";
    }
}
