import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {


    public static void seed(ArrayList<Student> sList, ArrayList<Course> cList) {
        cList.add(new Course("OOP", "SECJ 3303"));
        cList.add(new Course("AI", "SECJ 4483"));
        cList.add(new Course("SE", "SECJ1223"));
        cList.add(new Course("DSA", "SECJ 2013"));


        sList.add(new Student("Ali", "Malaysia"));
        sList.add(new Student("Bob", "Indonesia"));
        sList.add(new Student("Charlie", "Thailand"));
    }

    public static void main(String[] args) throws Exception {

        boolean loop = true;
        int loginChoice = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Student> studentList = new ArrayList<>();
            ArrayList<Course> courseList = new ArrayList<>();
            ArrayList<Lecturer> LecturerList = new ArrayList<>();
            StudentController sController = new StudentController(studentList, courseList);
            LecturerController lController = new LecturerController();
            AcademicOfficerController aoController = new AcademicOfficerController();
            ArrayList<Person> personLoginList = new ArrayList<>();
            seed(studentList, courseList);

            // System.out.println("\nTrace - initial student list");
            // sController.displaystudentList();

            while (loop) {

                System.out.println("Menu\n----\n[1] Student\n[2] Lecturer\n[3] Academic Officer\n[0] Exit");
                System.out.print("=> ");
                loginChoice = scanner.nextInt();

                switch (loginChoice) {
                    case 0:
                        loop = false;
                        break;

                    case 1:
                        sController.login();
                        break;

                    case 2:

                        break;

                    case 3:
                        break;

                    default:
                        break;
                }
            }
        }
    }
}
