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
        //display all available courses
        int i = 0;

        System.out.println();
        System.out.println("Available Courses");
        System.out.println("------------------");
        for (Course course : courseList) {
            i++;
            System.out.println(i + ". " + course.getCode() + ": " + course.getName());
        }
       
        //get course code to be taught by lecturer
        Scanner s = new Scanner(System.in);
        System.out.print("Enter course code: ");
        String regCode = s.next();
        s.nextLine();

        //check if lecturer is teaching course
        boolean courseFound = false;
        for (Course c : courseList) {
            if (c.getCode().equalsIgnoreCase(regCode)) {    //find course code entered

                if (c.getLecturer() != null) {
                    if (c.getLecturer() == this) {
                        courseFound = true;
                        System.out.println();
                        System.out.println(this.getName() + " is already teaching " + c.getName());
                    }
                    else{
                        courseFound = true;
                        System.out.println();
                        System.out.println(c.getLecturer().getName() + " is teaching " + c.getName());
                    }

                } else {
                    courseFound = true;
                    c.setLecturer(this);
                    courseTaught.add(c);
                    System.out.println();
                    System.out.println(this.getName() + " is now teaching " + c.getName());
                }

            }
        }

        if (!courseFound) {
            System.out.println();
            System.out.println("Course with code " + regCode + " was not found.");
        }
    }

    public void stopTeach(ArrayList <Course> courseList){
        //get course code to stop teaching
        Scanner s = new Scanner(System.in);

        displayTaughtCourses();

        if(courseTaught.isEmpty()){
            return;
        }

        System.out.println();
        System.out.print("Enter course code: ");
        String regCode = s.next();
        s.nextLine();

        //check if lecturer is teaching course
        boolean courseFound = false;
        for (Course c : courseList) {
            if (c.getCode().equalsIgnoreCase(regCode)) {    //find course code entered

                if (c.getLecturer() != null) {
                    if (c.getLecturer() == this) {
                        courseFound = true;
                        //remove lecturer from course
                        c.setLecturer(null);

                        //remove course from lecturer
                        courseTaught.remove(c);
                        System.out.println();
                        System.out.println(c.getName() + " is removed");
                    }
                    else{
                        courseFound = true;
                        System.out.println();
                        System.out.println(c.getLecturer().getName() + " is teaching " + c.getName());
                    }

                } else {
                    courseFound = true;
                    c.setLecturer(this);
                    courseTaught.add(c);
                    System.out.println();
                    System.out.println(this.getName() + " has stopped teaching " + c.getName());
                }

            }
        }

        if (!courseFound) {
            System.out.println();
            System.out.println("Course with code " + regCode + " was not found.");
        }
    }
    
    public void displayTaughtCourses(){
        int i = 0;

        if(courseTaught.isEmpty()){
            System.out.println();
            System.out.println("No course assigned yet");
        }
        else{
            System.out.println();
            System.out.println("Assigned Courses");
            System.out.println("------------------");

            for (Course course : courseTaught) {
                i++;
                System.out.println(i + ". " + course.getCode() + ": " + course.getName());
            }
        }
    }
}
