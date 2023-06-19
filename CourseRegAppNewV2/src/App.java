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
        ArrayList<Course> regCourseList = new ArrayList<>();
        Student student = new Student("John Doe", "123456");

        // Register the course
        student.registerCourse(courseList);        
        student.registerCourse(courseList);


        // Print the registered courses
        System.out.println("Registered courses:");
        student.displayRegCourses();
    }
}
