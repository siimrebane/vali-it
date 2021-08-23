package ee.bcs.valiit.sample;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palun sisesta esimene number");
        int a = scanner.nextInt();
        System.out.println("Palun sisesta tekst");
        scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(a);
        System.out.println(b);
    }
}
