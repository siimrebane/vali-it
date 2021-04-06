package ee.bcs.valiit.solution;

import java.util.Scanner;

// TODO kasuta if/else. Ära kasuta Math librarit
public class SolutionLesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta millist funktsiooni tahad käivitada");
        System.out.println("1 - min");
        System.out.println("2 - max");
        System.out.println("3 - abs");
        System.out.println("4 - isEven");
        System.out.println("5 - min3");
        System.out.println("6 - max3");
        String functionNr = scanner.nextLine();
        if (functionNr.equalsIgnoreCase("min") || functionNr.equals("1")) {
            System.out.println("Sisesta 2 arvu");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Min on: " + min(a, b));
        } else if (functionNr.equalsIgnoreCase("max") || functionNr.equals("2")) {
            System.out.println("Sisesta 2 arvu");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Max on: " + max(a, b));
        } else if (functionNr.equalsIgnoreCase("abs") || functionNr.equals("3")) {
            System.out.println("Sisesta number");
            int a = scanner.nextInt();
            System.out.println("abs: " + abs(a));
        } else if (functionNr.equalsIgnoreCase("isEven") || functionNr.equals("4")) {
            System.out.println("Sisesta number");
            int a = scanner.nextInt();
            if (isEven(a)) {
                System.out.println("Tegu on paaris arvuga");
            } else {
                System.out.println("Tegu on paaritu arvuga");
            }
        } else if (functionNr.equalsIgnoreCase("min3") || functionNr.equals("5")) {
            System.out.println("Sisesta 3 arvu");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println("Min on: " + min3(a, b, c));
        } else if (functionNr.equalsIgnoreCase("max3") || functionNr.equals("6")) {
            System.out.println("Sisesta 3 arvu");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println("Max on: " + max3(a, b, c));
        } else {
            System.out.println("Valitud number ei olnud 1-6");
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
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    // TODO tagasta true, kui a on paaris arv
    // tagasta false kui a on paaritu arv
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    // TODO tagasta kolmest arvust kõige väiksem
    public static int min3(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    // TODO tagasta kolmest arvust kõige suurem
    public static int max3(int a, int b, int c) {
        return max(max(a, b), c);
    }
}
