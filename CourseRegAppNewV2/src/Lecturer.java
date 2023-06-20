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
        //get course code to be taught by lecturer
        Scanner s = new Scanner(System.in);
        System.out.print("Enter course code: ");
        String regCode = s.next();
        s.nextLine();

        //check if lecturer is teaching course
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
                    c.setLecturer(this);
                    courseTaught.add(c);
                }

            }
        }
    }

    public void stopTeach(ArrayList <Course> courseList){
        //get course code to stop teaching
        Scanner s = new Scanner(System.in);
        System.out.print("Enter course code: ");
        String regCode = s.next();
        s.nextLine();

        //check if lecturer is teaching course
        for (Course c : courseList) {
            if (c.getCode().equalsIgnoreCase(regCode)) {    //find course code entered

                if (c.getLecturer() != null) {
                    if (c.getLecturer() == this) {
                        //remove lecturer from course
                        c.setLecturer(null);

                        //remove course from lecturer
                        courseTaught.remove(c);
                    }
                    else{
                        System.out.println(c.getLecturer().getName() + " is teaching " + c.getName());
                    }

                } else {
                    c.setLecturer(this);
                    courseTaught.add(c);
                }

            }
        }
    }
    
    public void displayTaughtCourses(){
        int i = 0;
        for (Course course : courseTaught) {
            i++;
            System.out.println(i + ". " + course.getCode() + ": " + course.getName());
        }
    }
}
