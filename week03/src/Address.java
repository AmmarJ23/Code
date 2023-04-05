public class Address {
    int homeNum;
    String streetAddress;

    public Address(int hN, String sA)
    {
        this.homeNum = hN;
        this.streetAddress = sA;
    }

    @Override
    public String toString() {
        return "\nHome Number: " + homeNum + "\nStreet Address: " + streetAddress;
    }
}
