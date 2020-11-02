package ee.bcs.valiit.tasks;

import java.math.BigDecimal;

public class Lesson4 {
    // TODO loo programm, mis hoiab mälus panga konto numbrit ja konto balanssi
    // TEE programm:
    //
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("10");
        BigDecimal b = BigDecimal.ONE;
        
        if(a.compareTo(b) < 0){
            System.out.println("jep");
        } else {
            System.out.println("ei ole");
        }
    }

}
