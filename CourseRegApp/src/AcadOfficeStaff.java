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
        String courseName, courseCode, courseCredit;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Course Name: ");
        courseName = s.nextLine();
        System.out.println("Course Code: ");
        courseCode = s.nextLine();
        System.out.println("Course Credit: ");
        courseCredit = s.nextLine();

        int parseCredit = Integer.parseInt(courseCredit);

        Course tempCourse = new Course(courseName, courseCode, parseCredit);
        
        s.close();
        return tempCourse;
    }


}
