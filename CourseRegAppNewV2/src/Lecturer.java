import java.util.ArrayList;
import java.util.Scanner;

public class Lecturer extends Person{

    private ArrayList <Course> courseTaught;

    public Lecturer() {
        courseTaught = new ArrayList<>();

    }

    public Lecturer(String name, String iD) {
        super(name, iD);
        courseTaught = new ArrayList<>();
    }

    public ArrayList<Course> getCourseTaught() {
        return courseTaught;
    }

    public void teachCourse(ArrayList <Course> courseList){
        //get course code to be registered to student
        Scanner s = new Scanner(System.in);
        System.out.print("Enter course code: ");
        String regCode = s.next();
        s.nextLine();

        //check if student is already registered to course
        for (Course c : courseList) {
            if (c.getCode().equalsIgnoreCase(regCode)) {    //find course code entered

                if (c.getLecturer() != null) {
                    if (c.getLecturer() == this) {
                        System.out.println(this.getName() + " is already teaching " + c.getName());
                    }
                    else{
                        System.out.println(c.getLecturer().getName() + " is teaching " + c.getName());
                    }

                } else {
                    c.addLecturer(this);
                    courseTaught.add(c);
                }

            }
        }
    }
    
}
