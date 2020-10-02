package ee.bcs.valiit.controller;

import java.util.ArrayList;
import java.util.List;

public class EmployeeJson {
    private String firstName;
    private String lastName;
    private List<ContractJson> contracts;

    public EmployeeJson() {
        this.firstName = "firstName";
        this.lastName = "lastName";
        contracts = new ArrayList<>();
        contracts.add(new ContractJson());
    }

    public String getFirstName() {
        return firstName;
    }

    public EmployeeJson setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public EmployeeJson setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public List<ContractJson> getContracts() {
        return contracts;
    }

    public EmployeeJson setContracts(List<ContractJson> contracts) {
        this.contracts = contracts;
        return this;
    }
}
