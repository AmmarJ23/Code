import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public int login(ArrayList <Student> studList, ArrayList <Lecturer> lecturerList, ArrayList <AcademicOfficer> acadList){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter User ID:");
        String logID = s.nextLine();
        System.out.println("Enter User Password:");
        String logPass = s.nextLine();

        for (Student student : studList) {
            if (student.getID().equalsIgnoreCase(logID)) {
                return 1;
            }
        }

        for (Lecturer lecturer : lecturerList) {
            if (lecturer.getID().equalsIgnoreCase(logID)) {
                return 2;
            }
        }

        for (AcademicOfficer academicOfficer : acadList) {
            if (academicOfficer.getID().equalsIgnoreCase(logID)) {
                return 3;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws Exception {
        // Create a list of courses
        ArrayList<Course> courseList = new ArrayList<>();
        ArrayList <Student> studentList = new ArrayList<>();
        ArrayList <AcademicOfficer> acadList = new ArrayList<>();
        ArrayList <Lecturer> lecturerList = new ArrayList<>();
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
        lecturerList.add(l1);
        lecturerList.add(l2);


        //Create Academic Officers
        AcademicOfficer a1 = new AcademicOfficer("Dorothy Eisenward", "S101");
        acadList.add(a1);
        
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

        // 1. display login - enter id & password(?) - pass all list
        // 2. Menu - according to user type
        // 3. do stuff
        // 4. exit



    }
}
