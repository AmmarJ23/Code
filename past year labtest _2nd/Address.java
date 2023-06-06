public class Address {
    private String street;
    private String city;
    private int postcode;
    private String state;

    public Address(String street, String city, int postcode, String state) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.state = state;
    }

    public String getAddress(){
        return this.street + ", " + this.postcode + " " + this.state + ", " + this.city;
    }
}
