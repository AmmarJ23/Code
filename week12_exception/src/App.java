import java.util.Scanner;

class UI{
    public int getSelection(Scanner sc){
        int selection=0;
        boolean loop = true;

        System.out.println("Enter a number 1 - 4");

    while (loop) {
        try {
            selection = Integer.parseInt(sc.nextLine());

            if (selection >=0 && selection < 5) { 
                System.out.println("Valid Selection");
                loop = false;
            } else{
                System.out.println("invalid range is 1 - 4");
            }

        } catch (NumberFormatException nfe) {
            // nfe.printStackTrace();
            // System.out.println("Invalid input format");
            throw nfe;
        }
        finally{
            System.out.println("Statement inside finally block is executed");
        }
    }

        return selection;
    }
    //Return integer 1 - 4 only, else loop
}

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int selection = 0;
        UI obj = new UI();

        selection = obj.getSelection(sc);
        System.out.println("User selection: " + selection);

    }
}
