package ee.bcs.valiit.solution.hibernate;

import javax.persistence.*;

@Table(name="account")
@Entity
public class SampleAccount {
    // Juhul kui on auto increment id tulp
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;

    // andmebaasis peab olema tulba nimi: account_number
    @Id
    private String accountNumber;

    private Double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
