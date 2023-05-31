public class TestCustomer {
    public static void main(String[] args) {
        Customer c1 =  new Customer("Alice", "456", "No. 6, KTC UTM, Johor", "011-7123987");

        Material m1 = new Material("Engine Oil", 130.8, "Semi Synthetic 15W/40", 2);
        Service s1 = new Service("Engine Oil Service", 15, 0.5);
        Service s2 = new Service("Major Service", 15, 2.8);

        c1.addItem(m1);
        c1.addItem(s1);
        c1.addItem(s2);

        System.out.println("Test 'Customer' class:");
        System.out.println("----------------------");

        c1.printInfo();
        System.out.println("");

    }


}
