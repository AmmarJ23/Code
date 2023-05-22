//Name          : Ammar bin Jamalludin
//Matric No.    : A21EC0160
//Course        : SECJ2154 - 06
//Title         : Test1 20172018 Question 2

// a)
public class Burger {
    //i
    static final int SIZE = 15;
    String code;
    int quantity;
    public static int totalItem;
    
    //ii
    public Burger(String code, int quantity) {
        this.code = code;
        this.quantity = quantity;
        totalItem += quantity;
    }


    //iii
    public String getCode() {
        return code;
    }

    public int getQuantity() {
        return quantity;
    }
}
