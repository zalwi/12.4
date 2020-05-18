package data;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String telNumber;

    public Customer(String id, String firstName, String lastName, String telNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telNumber='" + telNumber + '\'' +
                '}';
    }
}
