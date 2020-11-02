package ee.bcs.valiit.tasks;

import java.util.*;

public class Lesson3 {

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(4);
        testList.add(5);
        testList.add(6);
        Arrays.toString(new int[0]);
        for (Integer i : testList) {
            System.out.println(i);
        }

        System.out.print(testList);

        System.out.println(reverseString("Test1 Test2"));
        Map<String, String> testMap = new HashMap<>();
        test(testMap);
        Object a;
    }

    private static void test(Map<String, String> testMap) {
        testMap.put("test", "test");
    }

    public static int uusSumma(int x, int y) {
        // TODO liida kokku ja tagasta x ja y väärtus
        return 0;
    }

    public static int sum(int[] x){
        // Todo liida kokku kõik numbrid massivis x
        System.out.println("Tere");
        Scanner scanner = new Scanner(System.in);
        scanner.hasNext();
        String a = "1";
        int b = Integer.parseInt(a);
        return 0;
    }

    public static int factorial(int x) {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 4*3*2*1 = 24
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
        // Näiteks:
        // a = "Test";
        // return tseT";
        System.out.println(a.substring(0, 1));
        System.out.println(a.substring(1, 2));
        System.out.println(a.substring(2, 3));
        System.out.println(a.substring(3, 4));
        System.out.println(a.substring(2, 4));
        System.out.println(a.substring(2));

        String[] array = a.split("e");
        System.out.println(array[0]);
        System.out.println(array[1]);

        System.out.println(a.indexOf(" "));
        return "";
    }

    public static boolean isPrime(int x){
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        return false;
    }

}
