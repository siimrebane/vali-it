package ee.bcs.valiit.sample;

import java.util.*;

public class ListMapSamples {
    public static void main(String[] args) {
        int[] array = new int[4];

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0, 4);
        list.add(0, 1);
        list.set(0, 2);
        list.add(5);
        list.add(8);
        list.add(3);
        System.out.println(sum(list));

        List<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(5);
        list2.add(8);
        list2.add(3);
        System.out.println(sum(list2));

        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(5);
        set.add(8);
        set.add(3);
        set.size();
        int x = 3;
        set.remove(x);
        System.out.println(sum(set));

        String text = "sos";
        Character esimeneTaht = text.charAt(0);
        Character teineTaht = text.charAt(1);
        Character kolmasTaht = text.charAt(2);

        Map<Character, String> map = new HashMap<>();
        map.put('s', "...");
        map.put('o', "---");
        System.out.println(map.get(esimeneTaht) + " " + map.get(teineTaht) + " " + map.get(kolmasTaht));

        String a = text.substring(0,1);
        String b = text.substring(1,2);
        String c = text.substring(2,3);

        Map<String, String> map2 = new HashMap<>();
        map2.put("s", "...");
        map2.put("o", "---");
        System.out.println(map2.get(a) + " " + map2.get(b) + " " + map2.get(c));
    }

    public static int sum(List<Integer> list){
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        return sum;
    }

    public static int sum(Set<Integer> set){
        int sum = 0;
        for (Integer integer : set) {
            sum = sum + integer;
        }
        return sum;
    }
}
