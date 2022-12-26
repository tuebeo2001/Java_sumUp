import java.util.Date;

public class Person {
    private String name;
    private String address;
    private Date DateOfBirth;

    public Person() {
    }

    public Person(String name, String address, Date dateOfBirth) {
        this.name = name;
        this.address = address;
        DateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                '}';
    }
}
