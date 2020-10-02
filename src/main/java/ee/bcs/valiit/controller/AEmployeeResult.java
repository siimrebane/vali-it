package ee.bcs.valiit.controller;

import java.util.List;

public class AEmployeeResult {
    private List<AEmployee> employees;

    public List<AEmployee> getEmployees() {
        return employees;
    }

    public AEmployeeResult setEmployees(List<AEmployee> employees) {
        this.employees = employees;
        return this;
    }
}
