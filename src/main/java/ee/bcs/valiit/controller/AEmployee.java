package ee.bcs.valiit.controller;

import java.util.List;

public class AEmployee {
    private String firstName;
    private String lastName;
    private List<AContract> contracts;

    public String getFirstName() {
        return firstName;
    }

    public AEmployee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public AEmployee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public List<AContract> getContracts() {
        return contracts;
    }

    public AEmployee setContracts(List<AContract> contracts) {
        this.contracts = contracts;
        return this;
    }
}
