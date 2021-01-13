package ee.bcs.valiit.tasks.solution;

public class Lesson3 {
    public static void main(String[] args) {
        sum(new int[]{1, 2, 3});
        System.out.println(factorial(5));
    }

    public static int sum(int[] x){
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int x) {
        int sum = 1;
        for(int i = 1; i < x; i++){
            sum *= i;
        }
        return sum;
    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi.
        // TODO kasuta tsükleid, ära kasuta ühtegi olemasolevat sort funktsiooni
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
