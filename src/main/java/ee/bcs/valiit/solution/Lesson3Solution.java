package ee.bcs.valiit.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lesson3Solution {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        System.out.println(evenFibonacci(10));
    }

    // TODO tagasta x faktoriaal.
    // Näiteks
    // x = 5
    // return 5*4*3*2*1 = 120
    public static int factorial(int x) {
        int sum = 1;
        for (int i = 1; i <= x; i++) {
            sum *= i; // sum = sum * i;
        }
        return sum;
    }

    // TODO tagasta string tagurpidi
    public static String reverseString(String a) {
        String resultString = "";
        for(int i = a.length()-1; i >= 0; i--){
            resultString += a.charAt(i);
        }
        //resultString += a.charAt(a.length()-1); //4
        //resultString += a.charAt(a.length()-2); //3
        //resultString += a.charAt(a.length()-3); //2
        //resultString += a.charAt(a.length()-4); //1
        //resultString += a.charAt(a.length()-5); //0
        return resultString;
    }

    // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
    public static boolean isPrime(int x) {
        if(x == 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
        // x % 1 == 0
        // x % 2 == 0???
        // x % 3 == 0???
        // ...
        // x % i == 0???
        // x % x == 0
    }

    // TODO sorteeri massiiv suuruse järgi.
    // TODO kasuta tsükleid, ära kasuta ühtegi olemasolevat sort funktsiooni
    public static int[] sort(int[] a) {
        // 2 9 1 7
        // 2 1 7 9
        // 1 2 7 9
        for(int j = 1; j < a.length; j++) {
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] > a[i]) {
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
        // 21
        // 0 1 1 2 3 5 8 13 21
        int a = 0;
        int b = 1;
        int sum = 0;
        while(b <= x){
            int c = a;
            a = b;
            b = c + b;
            if(a % 2==0){
                sum += a;
            }
        }
        return sum;
    }

    public static String morseCode(String text) {
        Map<Character, String> morseMap = new HashMap<>();
        morseMap.put('h', "....");
        morseMap.put('e', ".");
        morseMap.put('l', ".-..");
        morseMap.put('o', "---");
        morseMap.put('s', "...");
        //for(int i = 0; i < text.length(); i++){
        //    char c = text.charAt(i);
        //}
        String resultString = "";

        for (char c : text.toCharArray()) {
            if (!resultString.isEmpty()) {
                resultString += " ";
            }
            resultString += morseMap.get(c);
        }
        // TODO kirjuta programm, mis tagastab sisestatud teksti morse koodis (https://en.wikipedia.org/wiki/Morse_code)
        // Kasuta sümboleid . ja - ning eralda kõik tähed tühikuga
        return resultString;
    }
}
