package ee.bcs.valiit.controller;

import java.math.BigDecimal;

public class Account {
    private Long id; // id
    private String accountNr; // account_nr
    private BigDecimal balance; // balance

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(String accountNr) {
        this.accountNr = accountNr;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
