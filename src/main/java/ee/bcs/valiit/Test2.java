package ee.bcs.valiit;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        Map<String, BigDecimal> accounts = new HashMap<>();
        accounts.put("EE123", BigDecimal.ZERO);
        accounts.put("EE124", BigDecimal.TEN);
        accounts.put("EE125", new BigDecimal("23493294"));
        System.out.println(accounts.get("EE124"));
    }
}
