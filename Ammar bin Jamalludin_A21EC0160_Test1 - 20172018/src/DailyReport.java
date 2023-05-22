//Name          : Ammar bin Jamalludin
//Matric No.    : A21EC0160
//Course        : SECJ2154 - 06
//Title         : Test1 20172018 Question 2

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// c)
public class DailyReport {
    public static void main(String[] args) throws FileNotFoundException {

        //i
        File inputFile = new File("../input.txt");
        Scanner inputReader = new Scanner(inputFile);

        //ii
        ArrayList<Burger> burgerList = new ArrayList<>();
        double totalIncome = 0;

        System.out.printf("%n                             ABC BURGER DAILY SALES REPORT%n%n");
        System.out.printf("NUM  CODE   DESCRIPTION                       PRICE(RM)  QUANTITY    TOTAL PRICE(RM)  %n");

        for (int i = 0; i < 11; i++) {
            String code = inputReader.next();
            int quantity = inputReader.nextInt();
            burgerList.add(new Burger(code, quantity));

            //iii
            MenuList.menuList burgerVar = MenuList.menuList.valueOf(code);
            String burgerDesc = burgerVar.getDesc();
            double burgerPrice = burgerVar.getPrice();

            //iv
            double totalPrice = burgerPrice * quantity;

            totalIncome += totalPrice;

            System.out.printf("%2d   %-6s %-35s %5.2f    %5d       %10.2f  %n", i+1, code, burgerDesc, burgerPrice, quantity, totalPrice);
        }

        System.out.println();

        //v
        System.out.printf("                        TOTAL ITEMS SOLD = %d burger(s) %n", Burger.totalItem);
        System.out.printf("                        TOTAL INCOME     = RM %.2f %n", totalIncome);

        inputReader.close();

        System.out.println();
    }
}
