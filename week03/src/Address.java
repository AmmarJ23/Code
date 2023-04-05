public class Address {
    int homeNum;
    String streetAddress;

    public Address()
    {
        homeNum = 0;
        streetAddress = null;
    }

    public Address(int hN, String sA)
    {
        this.homeNum = hN;
        this.streetAddress = sA;
    }

    public void setHomeNum(int hN) {this.homeNum = hN;}
    public void setStreetAddress(String sA){this.streetAddress = sA;}

    @Override
    public String toString() 
    {
        return "\nHome Number: " + homeNum + "\nStreet Address: " + streetAddress;
    }

    public boolean equals(Address addrObj)
    {
        if(this.homeNum == addrObj.homeNum)
        {
            if(this.streetAddress == addrObj.streetAddress) 
                return true;
            else 
                return false;
        }
        else
            return false;
    }
}
