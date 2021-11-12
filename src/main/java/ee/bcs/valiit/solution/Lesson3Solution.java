package ee.bcs.valiit.solution;

import java.util.HashMap;
import java.util.Map;

public class Lesson3Solution {

    public static void main(String[] args) {
        System.out.println(morseCode("hello"));
    }

    // TODO tagasta x faktoriaal.
    // Näiteks
    // x = 5
    // return 5*4*3*2*1 = 120
    public static int factorial(int x) {
        int sum = 1;
        for (int i = 1; i <= x; i++) {
            sum *= i; // sum = sum + i
        }
        return sum;
    }

    // TODO tagasta string tagurpidi
    public static String reverseString(String a) {
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            result = a.charAt(i) + result;
        }
        return result;
    }

    // TODO tagasta kas sisestatud arv on algarv (jagub ainult 1 ja iseendaga)
    public static boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    // TODO sorteeri massiiv suuruse järgi.
    // TODO kasuta tsükleid, ära kasuta ühtegi olemasolevat sort funktsiooni
    public static int[] sort(int[] a) {
        for (int j = 0; j < a.length; j++) {
            for (int i = 1; i < a.length - j; i++) {
                if (a[i] < a[i - 1]) {
                    int tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp;
                }
            }
        }
        return a;
    }

    public static int evenFibonacci(int x) {
        // TODO liida kokku kõik paaris fibonacci arvud kuni numbrini x
        int previous2 = 0;
        int previous = 1;
        int sum = 0;
        while (previous <= x) {
            if (previous % 2 == 0) {
                sum += previous;
            }
            int tmp = previous + previous2;
            previous2 = previous;
            previous = tmp;
        }
        return sum;
    }

    public static String morseCode(String text) {
        // TODO kirjuta programm, mis tagastab sisestatud teksti morse koodis (https://en.wikipedia.org/wiki/Morse_code)
        // Kasuta sümboleid . ja - ning eralda kõik tähed tühikuga
        Map<String, String> morseMap = new HashMap<>();
        morseMap.put("s", "...");
        morseMap.put("o", "---");
        morseMap.put("h", "....");
        morseMap.put("e", ".");
        morseMap.put("l", ".-..");
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            String letter = text.substring(i, i + 1);
            String morseCharacter = morseMap.get(letter);
            result = result + morseCharacter + " ";
        }
        return result.trim();
    }
}
