import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {

    private ArrayList <Course> regCourseList;

    public Student() {
        regCourseList = new ArrayList<>();
    }

    public Student(String name, String iD) {
        super(name, iD);
        regCourseList = new ArrayList<>();

    }

    public ArrayList <Course> getRegCourseList(){
        return regCourseList;
    }

    public void registerCourse(ArrayList <Course> courseList){
        //display all available courses
        int i = 0;

        System.out.println();
        System.out.println("Available Courses");
        System.out.println("------------------");
        for (Course course : courseList) {
            i++;
            System.out.println(i + ". " + course.getCode() + ": " + course.getName());
        }

        //get course code to be registered to student
        Scanner s = new Scanner(System.in);
        System.out.print("Enter course code: ");
        String regCode = s.next();
        s.nextLine();

        //check if student is already registered to course
        boolean studReg = false;
        boolean courseFound = false;
        

        for (Course c : courseList) {
            if (c.getCode().equalsIgnoreCase(regCode)) {    //find course code entered

                for (Student st : c.getStudList()) {        //check if student is already registered in course
                    if (st.getID().equalsIgnoreCase(this.getID())) {
                        studReg = true;
                        courseFound = true;
                        System.out.println();
                        System.out.println(this.getName() + " is already registered to " + c.getName());
                    }
                }
                
                if (studReg == false) { //if student is not registered, add student to course, add course to course registered
                    courseFound = true;
                    c.addStudent(this);
                    regCourseList.add(c);
                    System.out.println();
                    System.out.println("Successfully registered " + c.getName());
                }
            }

        }

        if (!courseFound) {
            System.out.println();
            System.out.println("Course with code " + regCode + " was not found.");
        }
    }

    public void dropCourse(ArrayList<Course> courseList) {
        // Get course code to be dropped
        Scanner s = new Scanner(System.in);

        displayRegCourses();

        if(regCourseList.isEmpty()){
            return;
        }

        System.out.println();
        System.out.print("Enter course code: ");
        String regCode = s.next();
        s.nextLine();

        // Check if student is already registered to the course
        boolean studReg = false;
        boolean courseFound = false;
        for (Course c : courseList) {
            if (c.getCode().equalsIgnoreCase(regCode)) {    // Find course with matching code
                if (c.getStudList().contains(this)) {       // Check if student is registered in the course
                    // Remove the course from the student's registered courses
                    regCourseList.remove(c);
                    // Remove the student from the course's student list
                    c.removeStudent(this);
                    System.out.println();
                    System.out.println(c.getName() + " is removed");
                    courseFound = true;
                    studReg = true;
                }
                else {
                    courseFound = true;
                    System.out.println();
                    System.out.println("Student is not registered to " + c.getName());
                }
            } 
        }

        if (!courseFound) {
            System.out.println();
            System.out.println("Course with code " + regCode + " was not found.");
        }
    }


    public void displayRegCourses(){
        int i = 0;

        if(regCourseList.isEmpty()){
            System.out.println();
            System.out.println("No course registered yet");
        }
        else{
            System.out.println();
            System.out.println("Registered Courses");
            System.out.println("------------------");

            for (Course course : regCourseList) {
                i++;
                System.out.println(i + ". " + course.getCode() + ": " + course.getName());
            }
        }
    }


}
