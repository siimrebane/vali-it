package ee.bcs.valiit.controller;

import ee.bcs.valiit.respository2.AccountEntity;

import java.math.BigDecimal;

public class AccountResponse {
    private Long accountId;
    private String accountNr;
    private BigDecimal balance;

    public AccountResponse(AccountEntity account) {
        this.accountId = account.getId();
        this.accountNr = account.getAccountNr();
        this.balance = account.getBalance();
    }

    public Long getAccountId() {
        return accountId;
    }

    public AccountResponse setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountNr() {
        return accountNr;
    }

    public AccountResponse setAccountNr(String accountNr) {
        this.accountNr = accountNr;
        return this;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public AccountResponse setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }
}
