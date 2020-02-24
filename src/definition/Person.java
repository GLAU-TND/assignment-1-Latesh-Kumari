package definition;

//import adt.ListADT;


import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String email;

    public Person(String firstName, String lastName, String contactNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "person{" +
                "firstName='" + firstName + '\'' +
                ",lastName='" + lastName + '\'' +
                ",contactNumber=" + contactNumber +
                ",email='" + email + '\'' +
                '}';
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName, contactNumber, email);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(contactNumber, person.contactNumber) &&
                Objects.equals(email, person.email);

    }

}
