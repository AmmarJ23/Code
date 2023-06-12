import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = 0;
        boolean menuLoop = true;

        ArrayList<Student> studentList = new ArrayList<>();
        StudentController studControl = new StudentController(studentList);
        CourseController courseControl = new CourseController(courseList);

        //login menu
        while (menuLoop) {
            System.out.println("Login as\n[1] Student\n[2] Lecturer\n[3] Academic Office Staff\n[0] Exit");
            choice = s.nextInt();
            s.nextLine();

            //------------------------STUDENT------------------------//
            if (choice == 1) {

                System.out.println("Enter Matric ID: ");
                String mID = s.nextLine();

                Student loggedInStudent = studControl.loginStudent(mID);

                boolean loop = true;
                while (loop && loggedInStudent != null) {

                    System.out.println("Logged in as " + loggedInStudent.getName() + "\n");

                    System.out.println("[1] Register Course\n[2] Withdraw Course\n[0] Exit Student");

                    int actionChoice = s.nextInt();

                    switch (actionChoice) {
                        case 1:
                            loggedInStudent.registerCourse(null);
                            break;
                        case 2:
                            break;

                        case 3:
                            break;

                        case 0:
                            loop = false;
                            break;
                        default:
                            break;
                    }
                }

                
            } 
            
            //------------------------LECTURER------------------------//
            else if (choice == 2) {
                
            } 
            
            //------------------------ACADEMIC OFFICE STAFF------------------------//
            else if (choice == 3) {
                System.out.println("\n[1] Register Student\n[2] Remove Student\n[3] Edit Student Details\n[4] Add Course");

                int actionChoice = s.nextInt();

                switch (actionChoice) {
                    case 1:
                        studControl.registerStudent();
                        break;
                    case 2:
                        studControl.removeStudent();
                        break;

                    case 3:
                        studControl.editStudentDetails();
                        break;

                    case 4:
                        
                        break;
                    default:
                        break;
                }
                
            }

            //------------------------EXIT------------------------//
            else if (choice == 0){
                menuLoop = false;
            }
            
            //------------------------INVALID------------------------//
            else{
                
            }
        }
    }
}
