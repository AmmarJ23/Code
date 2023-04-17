//Name          : Ammar bin Jamalludin
//Matric No.    : A21EC0160
//Course        : SECJ2154 - 06
//Title         : Enum Assignment

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int choice;
        double parkingFee, parkingHours;

        //vehicle type
        System.out.println("1. MOTORCYCLE");
        System.out.println("2. SEDAN_CAR");
        System.out.println("3. MPV_CAR");
        System.out.println("4. VAN");
        System.out.println("Enter the choice: ");

        Scanner s = new Scanner(System.in);
        choice = s.nextInt();

        Vehicle v;

        switch (choice) {
            case 1:
                v = Vehicle.MOTORCYCLE;
                break;
            
            case 2:
                v = Vehicle.SEDAN_CAR;
                break;

            case 3:
                v = Vehicle.MPV_CAR;
                break;

            case 4:
                v = Vehicle.VAN;
                break;


            default:
                System.out.println("Invalid choice");
                v = null;
                break;
        }

        //only print if a valid choice was chosen
        if (v == null) 
        {
            System.exit(0);
        } 
        else 
        {  
        System.out.println(v + "   RM" + v.getRatePerHour() + " per hour\n");
        }

        //Get parking hours
        System.out.println("Enter parking hours:");
        parkingHours = s.nextDouble();

        //Calculate and print parking fee
        parkingFee = parkingHours * v.getRatePerHour();
        System.out.println("Total Payment for Parking Fee: RM" + parkingFee);

        s.close();
    }


    enum Vehicle{
        MOTORCYCLE(1.00), 
        SEDAN_CAR(2.00), 
        MPV_CAR(3.00), 
        VAN(3.00);

        private double ratePerHour;

        Vehicle(double n){
            this.ratePerHour = n;
        }

        public double getRatePerHour(){
            return ratePerHour;
        }

    }
}
