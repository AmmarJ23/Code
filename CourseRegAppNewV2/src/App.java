import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a list of courses
        ArrayList<Course> courseList = new ArrayList<>();
        ArrayList <Student> studentList = new ArrayList<>();
        Course course1 = new Course("Introduction to Computer Science", "CSC101");
        Course course2 = new Course("Linear Algebra", "MAT202");
        courseList.add(course1);
        courseList.add(course2);

        // Create a student
        Student s1 = new Student("John Doe", "A001");
        Student s2 = new Student("Charlize Ankerton", "A002");
        studentList.add(s1);
        studentList.add(s2);


        //Create lecturers
        Lecturer l1 = new Lecturer("Ambrosia Jones", "S001");
        Lecturer l2 = new Lecturer("Bartholomew Smith", "S002");

        //Create Academic Officers
        AcademicOfficer a1 = new AcademicOfficer("Dorothy Eisenward", "S101");
        

        // Register the course
        s1.registerCourse(courseList);        
        s2.registerCourse(courseList);

        // Teach course
        l1.teachCourse(courseList);
        l2.teachCourse(courseList);


        // Print the registered courses
        System.out.println("\nRegistered courses:");
        s1.displayRegCourses();

        // Print course info
        course1.displayInfo();
        course2.displayInfo();

        // Remove student
        a1.removeStudent(studentList, courseList);

        // Print course info after student removal
        course1.displayInfo();

    }
}
