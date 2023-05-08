// Name       : Ammar bin Jamalludin
// Matric No. : A21EC0160
// Title      : Java Class & Object

//Program B1
public class UsedCar {
    private String model;
    private double rateDepreciation;
    private double basicPrice;

    public UsedCar()
    {
        model="";
        rateDepreciation=0.0;
        basicPrice=0.0;
    }

    //answer i, ii, iii, iv, v, vi
    public UsedCar(String model, double rateDepreciation, double basicPrice)
    {
        this.model = model;
        this.rateDepreciation = rateDepreciation;
        this.basicPrice = basicPrice; 
    }

    public String getModel()
    {
        return model;
    } 

    public double getRateDepreciation()
    {
        return rateDepreciation;
    } 

    public double getBasicPrice()
    {
        return basicPrice;
    }

    //answer vi
    public double calcDepreciationCost()
    {
        return basicPrice * rateDepreciation;
    }
}
