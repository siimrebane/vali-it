package ee.bcs.valiit.controller;

import java.util.List;

public class BEmployee {
    private String firstName;
    private String lastName;
    private List<BContract> contracts;

    public String getFirstName() {
        return firstName;
    }

    public BEmployee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public BEmployee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public List<BContract> getContracts() {
        return contracts;
    }

    public BEmployee setContracts(List<BContract> contracts) {
        this.contracts = contracts;
        return this;
    }
}
