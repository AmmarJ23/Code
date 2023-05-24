import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    //constructor
    public Student(){}
    public Student(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    public void newStd(ArrayList<Student> stdList){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = s.nextLine();
        System.out.println("Enter your ID  : ");
        this.ID = s.nextLine();

        stdList.add(this);
        s.close();
    }

}
