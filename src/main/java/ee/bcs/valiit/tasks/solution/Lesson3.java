package ee.bcs.valiit.tasks.solution;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort2(new int[]{5, -6, 9, 12, 7})));
    }

    public static int sum(int[] x) {
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int x) {
        int sum = 1;
        for (int i = 1; i < x; i++) {
            sum *= i;
        }
        return sum;
    }

    // 5, -6, 9, 12, 7
    public static int[] sort(int[] a) {
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
        }
        return a;
    }

    // 5, -6, 9, 12, 7
    public static int[] sort2(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int minIndex = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            int tmp = array[j];
            array[j] = array[minIndex];
            array[minIndex] = tmp;
        }
        return array;
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        return "";
    }

    public static boolean isPrime(int x) {
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        return false;
    }
}
