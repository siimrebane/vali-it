package ee.bcs.valiit.tasks;

import java.util.*;

public class Lesson3 {

    public static void main(String[] args) {
        String a = "";
        StringBuilder sb = new StringBuilder();
        test(sb);
        System.out.println(sb);
        for(int i = 0; i < 10; i++){

        }
    }

    public static void test(StringBuilder s){
        for (int i = 0; i < 100; i++){
            s.append("a");
        }
    }

    private static void test(Map<String, String> testMap) {
        testMap.put("test", "test");
    }

    public static int uusSumma(int x, int y) {
        // TODO liida kokku ja tagasta x y summa
        return 0;
    }

    public static int sum(int[] x){
        // Todo liida kokku kõik numbrid massivis x
        return 0;
    }

    public static int factorial(int x) {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 5*4*3*2*1 = 120
        return 0;
    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}
        return new int[0];
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        return "";
    }

    public static boolean isPrime(int x){
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        return false;
    }

}
