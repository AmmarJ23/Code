/*
 * Name         : Ammar bin Jamalludin
 * Matric No.   : A21EC0160
 * Question     : 2
 */

public class Service extends Item{
    private double man_hours;

    public Service(String name, double price, double man_hours) {
        super(name, price);
        this.man_hours = man_hours;
    }

    public double getTotalPrice(){
        if (man_hours <= 0.5) {
            return 15;
        } else {
            return 15 + 15 * (man_hours - 0.5);
        }
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("       Type: SERVICE");
        System.out.println("  Man Hours: " + this.man_hours);
        System.out.println("Total Price: " + this.getTotalPrice());
    }
    
}
