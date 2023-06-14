import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {


    public static void seed(ArrayList<Student> sList, ArrayList<Course> cList) {
        cList.add(new Course("OOP", "SECJ 3303"));
        cList.add(new Course("AI", "SECJ 4483"));
        cList.add(new Course("SE", "SECJ1223"));
        cList.add(new Course("DSA", "SECJ 2013"));


        sList.add(new Student("ali", "Malaysia"));
        sList.add(new Student("abu", "Indonesia"));
        sList.add(new Student("din", "Thailand"));
    }


    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Student> studentList = new ArrayList<>();
            ArrayList<Course> courseList = new ArrayList<>();
            StudentController sController = new StudentController(studentList, courseList);


            seed(studentList, courseList);


            System.out.println("\nTrace - initial student list");
            sController.displaystudentList();


            sController.login();


            System.out.println("\nTrace - add 2 students then print list");
            sController.addStudent();
            sController.addStudent();
            sController.displaystudentList();


            System.out.println("\nTrace - add course"); // ie abu add 3 courses oop, se & dsa
            sController.addCourse();
            sController.addCourse();
            sController.addCourse();


            System.out.println("\nTrace - print list after add courses");
            sController.displaystudentList();


            System.out.println("\nTrace - delete student");
            sController.deleteStudent1();  //ie delete din


            System.out.println("\nTrace - print list after delete student");
            sController.displaystudentList();


            System.out.println("\nTrace - print 1 student - search by name");
            sController.displayStudent1();  //ie print sbu


            System.out.println("\nTrace - print list - finale");
            sController.displaystudentList();
        }
    }
}
