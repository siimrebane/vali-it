package ee.bcs.valiit.controller;

import java.math.BigDecimal;
import java.util.List;

public class BankAccount {
    private String accountNr;
    private BigDecimal balance;
    private List<Transfer> transfers;

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

    public List<Transfer> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<Transfer> transfers) {
        this.transfers = transfers;
    }
}
