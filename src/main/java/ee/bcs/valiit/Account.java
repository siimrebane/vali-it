package ee.bcs.valiit;

import java.math.BigDecimal;

public class Account {
    private String accountNr;
    private BigDecimal balance;

    public Account() {
    }

    public Account(String accountNr) {
        this.accountNr = accountNr;
        this.balance = BigDecimal.ZERO;
    }

    public Account(String accountNr, BigDecimal balance) {
        this.accountNr = accountNr;
        this.balance = balance;
    }

    public String getAccountNr() {
        return accountNr;
    }

    public Account setAccountNr(String accountNr) {
        this.accountNr = accountNr;
        return this;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Account setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }
}
