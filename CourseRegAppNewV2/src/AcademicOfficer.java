import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AcademicOfficer extends Person{
    public AcademicOfficer(String name, String iD){
        super(name, iD);
    }

    public void addStudent(ArrayList <Student> studList){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String studName = s.nextLine();
        System.out.println("Enter student ID: ");
        String studID = s.nextLine();

        boolean studReg = false;
        for (Student student : studList) {
            if (student.getID().equalsIgnoreCase(studID)) {
                System.out.println("Another student already registered with given student ID");
            }
        }

        if (!studReg) {
            studList.add(new Student(studName, studID));
        }
    }

    public void removeStudent(ArrayList<Student> studList, ArrayList<Course> courseList) {
        Student tbRemoved = null;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student ID: ");
        String studID = s.nextLine();

        boolean studFound = false;
        for (Student student : studList) {
            if (student.getID().equalsIgnoreCase(studID)) {
                studFound = true;
                tbRemoved = student;
                break;
            }
        }

        // Remove student to be removed from all courses
        if (studFound) {
            for (Course course : courseList) {
                ArrayList<Student> studentsToRemove = new ArrayList<>();
                for (Student student : course.getStudList()) {
                    if (student == tbRemoved) {
                        studentsToRemove.add(student);
                    }
                }
                course.getStudList().removeAll(studentsToRemove);
            }
            studList.remove(tbRemoved);
        }
    }



    public void addCourse(ArrayList <Course> courseList){

    }

    public void removeCourse(ArrayList <Course> courseList){
         
    }
}
