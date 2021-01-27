package ee.bcs.valiit.tasks.solution;

public class SolutionEmployee {
    private Integer id;
    private String name;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public SolutionEmployee setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public SolutionEmployee setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public SolutionEmployee setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public SolutionEmployee setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
