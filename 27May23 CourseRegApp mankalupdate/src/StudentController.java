import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> studentList;

    public StudentController(ArrayList<Student> studentList){
        this.studentList = studentList;
    }

    public void registerStudent(){
        Scanner s = new Scanner(System.in);
        String name, ID;
        System.out.println("Enter Student Name: ");
        name = s.nextLine();
        System.out.println("Enter Student ID: ");
        ID = s.nextLine();

        studentList.add(new Student(name, ID));
    }

    public void removeStudent(){

    }

    public void editStudentDetails(){

    }

    public Student loginStudent(String matricID){
        for (Student student : studentList) {
            if (student.getID().equals(matricID)) {
                return student;
            }
        }
        return null;
    }

}
