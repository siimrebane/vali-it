package ee.bcs.valiit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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



    @GetMapping("contract/{contractId}")
    public void getContracts(@PathVariable("contractId") Long contractId,
                             @RequestParam("status") String active,
                             @RequestParam("query") String query){

    }

    @GetMapping("employee/{employeeId}/contract/{contractId}")
    public void getEmployees(@PathVariable("employeeId") Long employeeId,
                             @PathVariable("contractId") Long contractId){

    }
}





