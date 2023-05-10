// Name       : Ammar bin Jamalludin
// Matric No. : A21EC0160
// Title      : 2D Array of Objects

public class App {
    public static void main(String[] args) throws Exception {

        //answer 1a
        char [][] table  = new char [3][];
        table[0] = new char[] {'A', 'B', 'C', 'D'};
        table[1] = new char[] {'M', 'M'};
        table[2] = new char[] {'Z', 'Y', 'X'};

        // for (int row = 0; row < table.length; row++){
        //     System.out.println("Row" + (row+1));
        //     System.out.println( table[row][0]);
        //     System.out.println();
        // }

        //answer 1b
        /*
            Row1
            A

            Row2
            M

            Row3
            Z
        */


        //answer 2: 
        //number array only has 3 rows but the code tries to access a 4th row which does not exist

        //Question 4a

        Invoice [] purchase = {new Invoice("Hammer", 14.9), 
                               new Invoice("Paint Brush", 15.23),
                               new Invoice("Mini Broom", 10.00)};

        //Question 4b
        for (Invoice item : purchase) {
            System.out.println(item.getDesc() + " - RM " + item.getPrice());
        }
    }
}
