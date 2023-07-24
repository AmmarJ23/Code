import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Vehicle
 */
class Vehicle {

    public Vehicle(){

    }

    public void accelerate(){
        System.out.println("Vroom");
    }
    
}

class Car extends Vehicle{
    public Car(){

    }

    public void accelerate(){
        System.out.println("viou");
    }
}

class Van extends Vehicle{
    public Van(){

    }

    public void accelerate(){
        System.out.println("vooooo");
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Yahoo");
        stringList.add("Yahood");

        System.out.println(stringList.size());


        Vector<String> stringVector = new Vector<>();

        stringVector.add("null");

        Car car = new Car();
        Van van =  new Van();

        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(van);
        vehicleList.add(car);

        for (Vehicle vehicle : vehicleList) {
            vehicle.accelerate();
        }


        Scanner scanner = new Scanner(System.in);
        

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
            
        } catch (InputMismatchException e) {
            System.out.println("Please enter an integer value");
        }
    }
}
