package ee.bcs.valiit.tasks.solution;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private LocalDate beginDate;

    public Integer getId() {
        return id;
    }

    public Vacation setId(Integer id) {
        this.id = id;
        return this;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Vacation setEmployee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public Vacation setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
        return this;
    }
}
