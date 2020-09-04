package ee.bcs.valiit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    private AccountService accountService;

    @PutMapping("transfer")
    public void transfer(@RequestBody TransferMoneyRequest request){
        accountService.transferMoney(request.getFromAccount(),
                request.getToAccount(),
                request.getAmount());
    }
}





