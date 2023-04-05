public class Address {
    int homeNum;
    String streetAddress;

    public Address(int hN, String sA)
    {
        this.homeNum = hN;
        this.streetAddress = sA;
    }

    public Address()
    {
        homeNum = 0;
        streetAddress = null;
    }

    public void setHomeNum(int hN) {this.homeNum = hN;}
    public void setStreetAddress(String sA){this.streetAddress = sA;}

    @Override
    public String toString() {
        return "\nHome Number: " + homeNum + "\nStreet Address: " + streetAddress;
    }
}
