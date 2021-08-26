package ee.bcs.valiit.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMapSample {
    public static void main(String[] args) {
        // list
       List<Integer> a = new ArrayList();
       a.add(7);
        System.out.println(a.size());
        System.out.println(a.get(0));
        a.set(0, 9);
        a.remove(0);
        System.out.println(a.size());

        // map
        Map<String, String> testMap = new HashMap<>();
        testMap.put("key", "value");
        testMap.put("key", "value2");
        testMap.put("key3", "value3");
        String vastus = testMap.get("key");
        System.out.println(vastus);
        System.out.println(testMap.get("2"));
        System.out.println(testMap.keySet());
        System.out.println(testMap.values());

        Map<String, Map<Integer, String>> testMap2 = new HashMap<>();
    }

}
