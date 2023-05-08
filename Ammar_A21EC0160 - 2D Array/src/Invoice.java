class Invoice
{
    public String partDesc;
    public double price;
    public Invoice(String pD,double p){
        partDesc = pD;
        price = p;
    }

    public String getDesc() {
        return partDesc;
    }

    public double getPrice( ){
        return price;
    }
}