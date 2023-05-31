/*
 * Name         : Ammar bin Jamalludin
 * Matric No.   : A21EC0160
 * Question     : 2
 */

import java.util.ArrayList;

public class TestItem {
    public static void main(String[] args) {
        Material m1 = new Material("Engine Oil", 130.8, "Semi Synthetic 15W/40", 2);
        Service s1 = new Service("Engine Oil Service", 15, 0.5);
        Service s2 = new Service("Major Service", 15, 2.8);

        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(m1);
        itemList.add(s1);
        itemList.add(s2);

        for (Item item : itemList) {
            item.printInfo();
        }
    }
}
