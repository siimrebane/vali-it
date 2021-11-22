package ee.bcs.valiit.solution;

public class AccountDtoSolution {
    private String accountNumber;
    private Integer balance;
    private boolean locked;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "AccountDtoSolution{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", locked=" + locked +
                '}';
    }
}
