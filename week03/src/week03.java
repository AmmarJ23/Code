public class week03 {
    public static void main(String[] args) {
        System.out.println("Week03");
        Address addr = new Address(3, "Maple St.");
        Person p = new Person("ali", 1999, 99, 1.99f, addr);
        p.calcBmi();
        System.out.println(p.toString());
        System.exit(0);
    }

}
