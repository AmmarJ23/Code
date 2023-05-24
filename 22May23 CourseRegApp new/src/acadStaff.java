import java.util.ArrayList;
import java.util.Scanner;

public class acadStaff extends Person{
    
    //constructor
    public acadStaff(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    public void createCourse(ArrayList<Course> courseList){
        String name, code, credit;
        Scanner s = new Scanner(System.in);

        System.out.println("Course Name: ");
        name = s.nextLine();
        System.out.println("Course Code: ");
        code = s.nextLine();
        System.out.println("Course Credit: ");
        credit = s.nextLine();

        courseList.add(new Course(name, code, credit));
    }


}
