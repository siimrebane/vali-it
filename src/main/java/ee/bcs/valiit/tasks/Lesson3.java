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
        List<String> list = new ArrayList<>();
        list.add("asd");
        list.add("asd");
        list.add("asd");
        list.add(3, "asd");
        list.get(0);
        list.remove(2);
        list.set(3, "asd");
        list.size();
        List<String> list2 = new ArrayList<>();
        list.addAll(list2);
        list.contains("asd");
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
        // TODO 1 leidke arrayst a üles kõige väiksem number
        // TODO 1.5 salvestage mingisse muutujasse ka index int a_i, millel
        // vastav number oli
        // TODO 2 looge uus array b, mis on sama suure kui array a
        // TODO 3 väärtustage b[0] = varem leitud miinimum väärtus
        // TODO 4 määrame a[a_i] = Integer.MAX_VALUE
        // TODO 5 üritame teha tsükli, kus me teeme kõike eelnevate
        // a.length korda, nii et kõigepealt täidame b[0], siis b[1] jne.
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
