package ee.bcs.valiit.tasks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.HashMap;

@RequestMapping("bank")
@RestController
public class BankController {
    HashMap<String, BigDecimal> accountMap = new HashMap<>();

    // http://localhost:8080/bank/createAccount?accountNr=EE123
    public void createAccount(){
    }

    // http://localhost:8080/bank/accountBalance?accountNr=EE123
    public BigDecimal accountBalance(){
        return BigDecimal.ZERO;
    }

    // http://localhost:8080/bank/depositMoney?accountNr=EE123&amount=12
    public void depositMoney(){

    }

    // http://localhost:8080/bank/withdrawMoney?accountNr=EE123&amount=12
    public void withdrawMoney(){

    }

    // http://localhost:8080/bank/transferMoney?fromAccount=EE123&toAccount=EE124&amount=12
    public void transferMoney(){

    }
}
