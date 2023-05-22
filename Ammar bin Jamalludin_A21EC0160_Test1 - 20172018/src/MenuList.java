//Name          : Ammar bin Jamalludin
//Matric No.    : A21EC0160
//Course        : SECJ2154 - 06
//Title         : Test1 20172018 Question 2

// b)
public class MenuList {

    //i
    enum menuList{

        //ii
        B101("McChicken", 8.90),
        B102("Fillet-O-Fish", 8.90),
        B103("Cheeseburger", 5.50),
        B201("Chicken McNuggets", 11.50),
        B202("GCB", 12.50),
        B203("Spicy Chicken McDeluxe", 11.50),
        B204("Big Mac", 10.90),
        B301("Double GCB", 18.20),
        B302("Double Fillet-O-Fish", 11.95),
        B303("Double Cheeseburger", 9.50),
        B304("Double Spicy Chicken McDeluxe", 17.25);

        private double price;
        private String desc;

        //iii
        menuList(String desc, double price){
            this.desc = desc;
            this.price = price;
        }

        //iv
        public String getDesc() {
            return desc;
        }

        public double getPrice() {
            return price;
        }

    } 
}
