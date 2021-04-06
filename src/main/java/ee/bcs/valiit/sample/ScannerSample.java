package ee.bcs.valiit.sample;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palun sisesta number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Palun sisesta tekst");
        String s = scanner.nextLine();
        System.out.println("Sa sisestasid: " + a + " " + b);
        System.out.println("Sa sisestasid: " + s);
    }
}
