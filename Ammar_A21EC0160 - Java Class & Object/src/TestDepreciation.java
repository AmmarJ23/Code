// Name       : Ammar bin Jamalludin
// Matric No. : A21EC0160
// Title      : Java Class & Object

//Program B2
public class TestDepreciation {
    
    //answer viii, ix, x, xi, xii
    public static void displayInfo (UsedCar obj)
    {
        System.out.println("\n\nModel: " + obj.getModel() + 
        "\nRate of depreciation: " + obj.getRateDepreciation() + 
        "\nPurchase Price: " + obj.getBasicPrice() + 
        "\nTotal depreciation: " + obj.calcDepreciationCost());
    }
    
    public static void main(String[] args) 
    {
        //answer xiii, xiv
        UsedCar Car1 = new UsedCar("Toyota", 0.35, 75000);
        UsedCar Car2 = new UsedCar("Kia", 0.5, 100000);

        //answer xv, xvi
        displayInfo(Car1);
        displayInfo(Car2);
    }
}
