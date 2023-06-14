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

    public static int login(ArrayList<Student> sList, ArrayList<Lecturer> lList, ArrayList<AcademicOfficer> aoList){

        Scanner s = new Scanner(System.in);
        String loginID = s.nextLine();


        for (AcademicOfficer academicOfficer : aoList) {
            if (academicOfficer.getID().equalsIgnoreCase(loginID)) {
                return 1;
            }
        }

        for (Student student : sList) {
            if (student.getID().equalsIgnoreCase(loginID)) {
                return 2;
            }
        }

        for (Lecturer lecturer : lList) {
            if (lecturer.getID().equalsIgnoreCase(loginID)) {
                return 3;
            }
        }

        return 0;
    }

    public static void main(String[] args) throws Exception {

        boolean loop = true;
        int loginChoice = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Student> studentList = new ArrayList<>();
            ArrayList<Course> courseList = new ArrayList<>();
            ArrayList<Lecturer> LecturerList = new ArrayList<>();
            ArrayList<AcademicOfficer> = acadList = new ArrayList<>();
            StudentController sController = new StudentController(studentList, courseList);
            LecturerController lController = new LecturerController();
            AcademicOfficerController aoController = new AcademicOfficerController();
            ArrayList<Person> personLoginList = new ArrayList<>();
            seed(studentList, courseList);

            // System.out.println("\nTrace - initial student list");
            // sController.displaystudentList();

            while (loop) {

                loginChoice = login(studentList, LecturerList, acadList);
                
                switch (loginChoice) {

                    case 0:
                        loop = false;
                        break;

                    case 1:
                        
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
