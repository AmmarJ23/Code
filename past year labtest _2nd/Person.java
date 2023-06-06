public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private Address address;

    public Person(String firstName, String lastName, String gender, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    
}
