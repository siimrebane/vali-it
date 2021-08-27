package ee.bcs.valiit.sample;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("EE123", 4.72);
        map.put("EE124", 236.72);
        map.put("EE125", 999999.9);
        System.out.println(map.get("EE124"));
        System.out.println(map.get("EE125"));

        String accountNumbwe = "EE123";
        Double amountToAdd = 50.00;
        Double balance = map.get(accountNumbwe);
        Double newBalance = balance + amountToAdd;
        map.put(accountNumbwe, newBalance);
    }

}
