package ee.bcs.valiit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public void transferMoney(String fromAccount,
                              String toAccount,
                              BigDecimal amount){
        BigDecimal fromAccountBalance = accountRepository.getBalance(fromAccount);
        if(fromAccountBalance.compareTo(amount) >= 0){
            BigDecimal toAccountBalance = accountRepository.getBalance(toAccount);
            fromAccountBalance = fromAccountBalance.subtract(amount);
            toAccountBalance = toAccountBalance.add(amount);
            accountRepository.updateBalance(fromAccount, fromAccountBalance);
            accountRepository.updateBalance(toAccount, toAccountBalance);
        }
    }
}
