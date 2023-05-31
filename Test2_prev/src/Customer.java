import java.util.Vector;

public class Customer extends Person{
    private String address;
    private String phone;
    private Vector<Item> item;

    public Customer(String name, String ic_no, String address, String phone) {
        super(name, ic_no);
        this.address = address;
        this.phone = phone;
        item = new Vector<>();
    }

    public void addItem(Item item){
        this.item.add(item);
    }

    public void printInfo(){

        double grandTotalPrice = 0;

        super.printInfo();
        System.out.println("Address: " + this.address);
        System.out.println("  Phone: " + this.phone);

        System.out.println("\nOrdered Item(s) :");
        System.out.println(".................");

        for (Item itm : item) {
            itm.printInfo();
            grandTotalPrice = grandTotalPrice + itm.getTotalPrice();
        }

        System.out.println("");
        System.out.printf("GRAND TOTAL PRICE: %.2f", grandTotalPrice);
        System.out.println("");
    }

    
}
