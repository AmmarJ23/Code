import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int selection;
        System.out.println("Hello, World");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1 - 4");

        try {
            selection = Integer.parseInt(sc.nextLine());
            System.out.println("Your selection is "  + selection);
            
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            System.out.println("Invalid input format");
        }
        finally{
            System.out.println("Statement inside finnaly block is executed");
        }

    }
}
