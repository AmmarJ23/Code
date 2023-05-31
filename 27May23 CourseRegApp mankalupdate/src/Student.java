import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {

    private ArrayList<Course> regCourses = new ArrayList<>();

    //constructor
    public Student(){}
    public Student(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    public void newStd(ArrayList<Student> stdList, String name, String ID){
        this.setName(name);
        this.setID(ID);
        stdList.add(this);

        for(Student stdelement : stdList){
            System.out.println(stdelement);
        }
    }

    public void registerCourse(ArrayList<Course> courseList, ArrayList<Student> stdList) {
        String cCode;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter course code: ");
        cCode = s.nextLine();
        boolean found = false;

        for (Course course : courseList) {
            if (course.getCcode().equals(cCode)) {
                regCourses.add(course);
                course.addStudent(this);
                found = true;
                System.out.println(cCode + " added");
                break; // Exit the loop since the course is found yeke mar
            }
        }

        if (!found) {
            System.out.println("Course does not exist");
        }
    }

    public void withdrawCourse() {
        String cCode;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter course code: ");
        cCode = s.nextLine();

        boolean found = false;
        for (Course course : regCourses) {
            if (course.getCcode().equals(cCode)) {
                regCourses.remove(course);
                course.rmStudent(this);
                System.out.println(cCode + " withdrawn");
                found = true;
                break; // Exit the loop since the course is withdrawn
            }
        }

        if (!found) {
            System.out.println("Course is not registered");
        }
    }
}

        // public void newStd(ArrayList<Student> stdList){
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter your name: ");
    //     this.name = s.nextLine();
    //     System.out.println("Enter your ID  : ");
    //     this.ID = s.nextLine();

    //     stdList.add(this);

    //     for(Student std : stdList){
    //         System.out.println(std);
    //     }
    // }

    // public static void registerCourse(ArrayList<Course> courseList) {
    //     String cCode;
    //     Scanner s = new Scanner(System.in);

    //     System.out.println("Enter course code: ");
    //     cCode = s.nextLine();
    //     boolean found = false;

    //     for (Course course : courseList) {
    //         if (course.getCcode().equals(cCode)) {
    //             regCourses.add(course);
    //             found = true;
    //             System.out.println(cCode + " added");
    //             break; // Exit the loop since the course is found
    //         }
    //     }

    //     if (!found) {
    //         System.out.println("Course does not exist");
    //     }
    // }

//     public static void withdrawCourse() {
//         String cCode;
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter course code: ");
//         cCode = s.nextLine();

//         boolean found = false;
//         for (Course course : regCourses) {
//             if (course.getCcode().equals(cCode)) {
//                 regCourses.remove(course);
//                 System.out.println(cCode + " withdrawn");
//                 found = true;
//                 break; // Exit the loop since the course is withdrawn
//             }
//         }

//         if (!found) {
//             System.out.println("Course is not registered");
//         }
//     }
// }