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

        //get course code to be registered to student
        Scanner s = new Scanner(System.in);
        System.out.print("Enter course code: ");
        String regCode = s.next();
        s.nextLine();

        //check if student is already registered to course
        boolean studReg = false;
        for (Course c : courseList) {
            if (c.getCode().equalsIgnoreCase(regCode)) {    //find course code entered

                for (Student st : c.getStudList()) {        //check if student is already registered in course
                    if (st.getID().equalsIgnoreCase(this.getID())) {
                        studReg = true;
                        System.out.println(this.getName() + " is already registered to " + c.getName());
                    }
                }
                
                if (studReg == false) { //if student is not registered, add student to course, add course to course registered
                    c.addStudent(this);
                    regCourseList.add(c);
                }
            }
        }
    }

    public void dropCourse(ArrayList<Course> courseList) {
        // Get course code to be dropped
        Scanner s = new Scanner(System.in);
        System.out.print("Enter course code: ");
        String regCode = s.next();
        s.nextLine();

        // Check if student is already registered to the course
        boolean studReg = false;
        for (Course c : courseList) {
            if (c.getCode().equalsIgnoreCase(regCode)) {    // Find course with matching code
                if (c.getStudList().contains(this)) {       // Check if student is registered in the course
                    // Remove the course from the student's registered courses
                    regCourseList.remove(c);
                    // Remove the student from the course's student list
                    c.removeStudent(this);
                    studReg = true;
                }
            }

            if (!studReg) {
            System.out.println("Student is not registered to " + c.getName());
        }
        }

        
    }


    public void displayRegCourses(){
        int i = 0;
        for (Course course : regCourseList) {
            i++;
            System.out.println(i + ". " + course.getCode() + ": " + course.getName());
        }
    }


}
