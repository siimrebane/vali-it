package ee.bcs.valiit.sample.oop;

public class SampleOopAccount {
    public String iban;
    public Double balance;


    public SampleOopAccount(String iban, Double balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public SampleOopAccount(){

    }

    public void deposit(int number, int amount) {
        balance = balance + number + amount;
    }
}
