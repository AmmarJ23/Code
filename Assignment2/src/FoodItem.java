public class FoodItem {
    String description;
    double size, price;

    public FoodItem(String d, double s, double p)
    {
        this.description = d;
        this.size = s;
        this.price = p;
    }

    public void setDescription(String d){this.description = d;}
    public void setSize(double s){this.size = s;}
    public void setPrice(double p){this.price = p;}

    public String setDescription(){return description;}
    public double getSize(){return size;}
    public double getPrice(){return price;}

    @Override
    public String toString()
    {
        return 
    }
}
