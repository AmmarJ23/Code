/*
 * Name         : Ammar bin Jamalludin
 * Matric No.   : A21EC0160
 * Question     : 2
 */

public class Item {
    protected String name;
    protected double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double getTotalPrice() {
        return 0;
    }

    public void printInfo(){
        System.out.println("\nItem Name: " + name);
        System.out.println("    Price: " + price);
    }
}
