import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a list of courses
        ArrayList<Course> courseList = new ArrayList<>();
        Course course1 = new Course("Introduction to Computer Science", "CSC101");
        Course course2 = new Course("Linear Algebra", "MAT202");
        courseList.add(course1);
        courseList.add(course2);

        // Create a student
        Student student = new Student("John Doe", "A001");

        //Create lecturers
        Lecturer l1 = new Lecturer("Ambrosia Jones", "S001");
        Lecturer l2 = new Lecturer("Bartholomew Smith", "S002");

        // Register the course
        student.registerCourse(courseList);        
        student.registerCourse(courseList);

        // Teach course
        l1.teachCourse(courseList);
        l2.teachCourse(courseList);


        // Print the registered courses
        System.out.println("\nRegistered courses:");
        student.displayRegCourses();

        // Print course info
        course1.displayInfo();
        course2.displayInfo();

    }
}
