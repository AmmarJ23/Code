import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Course> courseList = new ArrayList<>();
        ArrayList<Student> stdList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String choice = null;
        acadStaff as1 = new acadStaff("Ammar", "AS01");

        while (true) {
            // Menu
            System.out.println("[1] Student \n[2] Lecturer \n[3] Academic Office Staff\n[4] Exit");
            choice = s.nextLine();

            //------------------------STUDENT------------------------//
            if (choice.equals("1")) {
                String tempName, tempId;

                Student tempStudent = new Student();
                System.out.println("Enter name: ");
                tempName = s.nextLine();
                System.out.println("Enter matric number: ");
                tempId = s.nextLine();
                tempStudent.newStd(stdList, tempName, tempId);

                while(true){
                    System.out.println("[1] Register Course\n[2] Withdraw Course\n[3] Exit Student");
                    choice = s.nextLine();
    
                    if (choice.equals("1")) {
                        tempStudent.registerCourse(courseList, stdList);
                    } else if (choice.equals("2")) {
                        tempStudent.withdrawCourse();
                    } else if (choice.equals("3")) {
                        break;
                    } else {
                        System.out.println("Invalid Input");
                    }
                }
            } 

            //------------------------LECTURER------------------------//
            else if (choice.equals("2")) {
                Lecturer tempLect = new Lecturer("AAAA", "A21");

                System.out.println("[1] View course list");
                choice = s.nextLine();
                

                if (choice.equals("1")) {
                    tempLect.viewCourseList(courseList);
                } else {
                    System.out.println("Invalid Input");
                }
            } 
            
            //------------------------STAFF------------------------//
            else if (choice.equals("3")) {
                System.out.println("[1] Add Course");
                choice = s.nextLine();

                if (choice.equals("1")) {
                    as1.createCourse(courseList);
                } else {
                    System.out.println("Invalid Input");
                }
            } 

            //------------------------EXIT------------------------//
            else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }

        s.close();
    }
}