package ee.bcs.valiit.solution;


import java.util.Scanner;

// TODO kasuta if/else. Ära kasuta Math librarit
public class Lesson1Solution {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("1 - min");
        System.out.println("2 - max");
        int command = sisend.nextInt();
        if(command == 1){
            System.out.println("Sisesta esimene number");
            int a = sisend.nextInt();
            System.out.println("Sisesta teine number");
            int b = sisend.nextInt();
            System.out.println("Vastus on:" + min(a,b));
        }
    }

    // TODO
    //  Tagasta string mille väärtus oleks "\"\\""
    //  Trüki muutuja sisu välja
    public static String someString(){
        return "\"\\\"\\\\\"\"";
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
        if(a < 0){
            return -a;
        } else {
            return a;
        }
    }

    // TODO tagasta true, kui a on paaris arv
    // tagasta false kui a on paaritu arv
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    // TODO tagasta kolmest arvust kõige väiksem
    public static int min3(int a, int b, int c) {
        if(a <= b && a <= c){
            return a;
        } else if(b <= a && b <= c){
            return b;
        } else {
            return c;
        }
    }

    // TODO tagasta kolmest arvust kõige suurem
    public static int max3(int a, int b, int c) {
        return max(a, max (b, c));
    }

}
