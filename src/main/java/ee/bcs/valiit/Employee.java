package ee.bcs.valiit;

public class Employee {
    private String firstName;
    private String lastName;
    private String age;

    public String getFirstName() {
        return firstName;
    }

    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Employee setAge(String age) {
        this.age = age;
        return this;
    }
}
