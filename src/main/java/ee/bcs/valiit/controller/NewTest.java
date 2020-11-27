package ee.bcs.valiit.controller;

public class NewTest {
    private String name;
    private String address;

    public NewTest() {
    }

    public NewTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public NewTest setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public NewTest setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "NewTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
