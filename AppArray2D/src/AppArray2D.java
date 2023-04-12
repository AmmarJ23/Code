import java.util.Scanner;

public class AppArray2D {

    public static void main(String[] args) {
        // coursemark ==> quiz1(5m) quiz2(5m) test1(20m) labtest(20m) assg(10m) :
        // total(60m)
        // double[] courseMark = new double[5];
        double[] courseMark = { 4.5, 4.0, 16.5, 15.0, 7.5 };


        double[][] courseMarkAllStud = new double [3][5];

        System.out.println("CourseMarkAllStud: " + courseMarkAllStud);


        for (double cm : courseMark) {
            System.out.println(cm);
        }

        // double[][] cmas = new double [3][5];
        // cmas[0][0] = 4.5;
        // cmas[0][1] = 4.0;
        // cmas[0][2] = 13.5;
        // cmas[0][3] = 9.3;
        // cmas[0][4] = 3.7;

        // cmas[1][0] = 8.2;
        // cmas[1][1] = 14.1;
        // cmas[1][2] = 2.5;
        // cmas[1][3] = 18.9;
        // cmas[1][4] = 6.7;

        // cmas[2][0] = 5.6;
        // cmas[2][1] = 11.8;
        // cmas[2][2] = 19.4;
        // cmas[2][3] = 1.9;
        // cmas[2][4] = 13.2;

        //Task 2: assign value to 2D array using shorthand notation
        double[][] cmas = {
            {4.5, 4.0, 13.5, 9.3, 3.7},
            {8.2, 14.1, 2.5, 18.9, 6.7},
            {5.6, 11.8, 19.4, 1.9, 13.2}
        };

        //Task3: for loop to output array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("["+i+"]["+j+"]: " + cmas[i][j]);
            }
        }

        //Task 4: for loop to ask for user input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter double values:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                cmas[i][j] = s.nextDouble();
            }
        }

        //for loop to output array
        System.out.println("Content of cmas 2D array");
        for (int i = 0; i < cmas.length; i++) {
            for (int j = 0; cmas[i].length < 5; j++) {
                System.out.println("["+i+"]["+j+"]: " + cmas[i][j]);
            }
        }

        //Task 3: Enhanced for loop to show content of cmas
        System.out.println("Content of cmas 2D array");
        for (double[] row : cmas) {
            for (double elem : row) {
                System.out.println(elem);
            }
        }
        s.close();

    }
}
