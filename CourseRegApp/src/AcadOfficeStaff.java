import java.util.Scanner;

public class AcadOfficeStaff extends Person {

    
    //Constructor
    public AcadOfficeStaff(String name, String ID, int age){
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    //Methods
    public Course createCourse(){
        String courseName, courseCode;
        int courseCredit;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Course Name: ");
        courseName = s.nextLine();
        System.out.println("Course Code: ");
        courseCode = s.nextLine();
        System.out.println("Course Credit: ");
        courseCredit = s.nextInt();

        Course tempCourse = new Course(courseName, courseCode, courseCredit);
        
        s.close();
        return tempCourse;
    }


}
