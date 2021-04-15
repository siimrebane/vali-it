package ee.bcs.valiit.solution.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleBankController {
    private static Map<String, Double> accountBalanceMap = new HashMap<>();

    public static void main(String[] args) {
/*
        if (line.equalsIgnoreCase("depositMoney")) {
            System.out.println("Please enter account nr");
            String accountNr = scanner.nextLine();
            System.out.println("Please enter amount");
            Double amount = scanner.nextDouble();
            scanner.nextLine();
            if (amount > 0) {
                Double currentBalance = accountBalanceMap.get(accountNr);
                Double newBalance = currentBalance + amount;
                accountBalanceMap.put(accountNr, newBalance);
            } else {
                System.out.println("Sisestatud summa peab olema positiivne number");
            }
        } else if (line.equalsIgnoreCase("withdrawMoney")) {
            System.out.println("Please enter account nr");
            String accountNr = scanner.nextLine();
            System.out.println("Please enter amount");
            Double amount = scanner.nextDouble();
            scanner.nextLine();
            if (amount > 0) {
                Double currentBalance = accountBalanceMap.get(accountNr);
                Double newBalance = currentBalance - amount;
                if (newBalance >= 0) {
                    accountBalanceMap.put(accountNr, newBalance);
                } else {
                    System.out.println("Kontol pole piisavalt raha");
                }
            } else {
                System.out.println("Sisestatud summa peab olema positiivne number");
            }
        } else if (line.equalsIgnoreCase("transferMoney")) {
            System.out.println("Please enter from account nr");
            String fromAccountNr = scanner.nextLine();
            System.out.println("Please enter to account nr");
            String toAccountNr = scanner.nextLine();
            System.out.println("Please enter amount");
            Double amount = scanner.nextDouble();
            scanner.nextLine();
            if (amount > 0) {
                double fromAccountBalance = accountBalanceMap.get(fromAccountNr);
                if (fromAccountBalance < amount) {
                    System.out.println("Kontol pole piisavalt raha");
                } else {
                    double toAccountBalance = accountBalanceMap.get(toAccountNr);
                    accountBalanceMap.put(fromAccountNr, fromAccountBalance - amount);
                    accountBalanceMap.put(toAccountNr, toAccountBalance + amount);
                }
            } else {
                System.out.println("Summa peab olema positiivne number");
            }
        }
        */
    }

    // http://localhost:8080/sample/bank/createAccount?accountNr=EE123&balance=1245
    @GetMapping("sample/bank/createAccount")
    public void createAccount(@RequestParam("accountNr") String accountNr, @RequestParam("balance") Double balance) {
        accountBalanceMap.put(accountNr, balance);
    }

    // http://localhost:8080/sample/bank/account
    @PostMapping("sample/bank/account")
    public void createAccount2(@RequestBody CreateAccountRequest request) {
        accountBalanceMap.put(request.getAccountNumber(), request.getAmount());
    }

    // http://localhost:8080/sample/bank/account/EE123
    @GetMapping("sample/bank/account/{accountNumber}")
    public String getBalance(@PathVariable("accountNumber") String accountNr){
        return "Konto balanss on: " + accountBalanceMap.get(accountNr);
    }
}
