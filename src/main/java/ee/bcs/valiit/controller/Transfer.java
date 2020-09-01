package ee.bcs.valiit.controller;

import java.math.BigDecimal;

public class Transfer {
    private String receiver;
    private BigDecimal amount;

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "receiver='" + receiver + '\'' +
                ", amount=" + amount +
                '}';
    }
}
