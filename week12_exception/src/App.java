import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 * This is a class for UI
 */
class UI{
    public int getSelection(){
        int selection=0;
        boolean loop = true;

        System.out.println("Enter a number 1 - 4");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (loop) {
        try {
            selection = Integer.parseInt(br.readLine());

            if (selection >=0 && selection < 5) { 
                System.out.println("Valid Selection");
                loop = false;
            } else{
                System.out.println("invalid range is 1 - 4");
            }

        } catch (NumberFormatException nfe) {
            // nfe.printStackTrace();
            System.out.println("Invalid input format");
            // throw nfe;
        }
        catch(IOException ioE){
            System.out.println("IO exception");
        }
        catch(Exception E){
            System.out.println("Any Exception");
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

        // Scanner sc = new Scanner(System.in);
        
        int selection = 0;
        UI obj = new UI();

        selection = obj.getSelection();
        System.out.println("User selection: " + selection);

    }
}
