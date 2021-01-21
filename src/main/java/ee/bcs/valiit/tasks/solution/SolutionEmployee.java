package ee.bcs.valiit.tasks.solution;

public class SolutionEmployee {
    private String name;
    private String address;
    private int age;

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

    public int getAge() {
        return age;
    }

    public SolutionEmployee setAge(int age) {
        this.age = age;
        return this;
    }
}
