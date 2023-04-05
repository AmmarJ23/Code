public class week03 {
    public static void main(String[] args) {
        System.out.println("\nWeek03");
        Address addr = new Address(3, "Jalan Tiram");
        Person p1 = new Person("ali", 1999, 99, 1.99f, addr);
        Person p2 = new Person("Abu", 2000, 66, 1.66f, 23, "Jalan Kilang");
        p1.calcBmi();
        p2.calcBmi();
        System.out.println(p1.toString());
        System.out.println("\n");
        System.out.println(p2.toString());
        System.exit(0);
    }

}
