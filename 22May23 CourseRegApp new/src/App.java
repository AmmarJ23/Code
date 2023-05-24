import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Course> courseList = new ArrayList<>();
        ArrayList<Student> stdList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String choice = null;

        //menu
        System.out.println("[1] Student \n[2] Lecturer \n[3] Academic Office Staff");
        choice = s.nextLine();

        if(choice == "1"){
            Student tempStudent = new Student();
            tempStudent.newStd(stdList);


        }

        if (choice == "2") {
            System.out.println("test");
        }


        acadStaff as1 = new acadStaff("Ammar", "AS01");
        as1.createCourse(courseList);

        System.out.println(courseList.get(0).toString());



        s.close();
        
    }
}
