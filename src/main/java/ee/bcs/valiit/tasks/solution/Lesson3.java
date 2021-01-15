package ee.bcs.valiit.tasks.solution;

public class Lesson3 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(sort2(new int[]{5, -6, 9, 12, 7})));
        System.out.println(isPrime(2));
        System.out.println(isPrime(19));
        System.out.println(isPrime(21));
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
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            result += a.substring(i, i + 1);
        }
        return result;
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
