import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AcademicOfficer extends Person{
    public AcademicOfficer(String name, String iD){
        super(name, iD);
    }

    public void addStudent(ArrayList <Student> studList){
        Scanner s = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter student name: ");
        String studName = s.nextLine();
        System.out.println("Enter student ID: ");
        String studID = s.nextLine();

        boolean studReg = false;
        for (Student student : studList) {
            if (student.getID().equalsIgnoreCase(studID)) {
                studReg = true;
                System.out.println();
                System.out.println("Another student already registered with inserted student ID");
            }
        }

        if (!studReg) {
            studList.add(new Student(studName, studID));
            System.out.println();
            System.out.println(studName + " is successfully added");
        }
    }

    public void removeStudent(ArrayList<Student> studList, ArrayList<Course> courseList) {
        Student toBeRemoved = null;
        Scanner s = new Scanner(System.in);

        displayStudentList(studList);
        
        System.out.println();
        System.out.println("Enter student ID: ");
        String studID = s.nextLine();

        boolean studFound = false;
        for (Student student : studList) {
            if (student.getID().equalsIgnoreCase(studID)) {
                studFound = true;
                toBeRemoved = student;
                break;
            }
        }

        // Remove student to be removed from all courses
        if (studFound) {
            for (Course course : courseList) {
                ArrayList<Student> studentsToRemove = new ArrayList<>();
                for (Student student : course.getStudList()) {
                    if (student == toBeRemoved) {
                        studentsToRemove.add(student);
                    }
                }
                course.getStudList().removeAll(studentsToRemove);
            }
            studList.remove(toBeRemoved);
            System.out.println();
            System.out.println(toBeRemoved.getName() + " is removed");
        }
        else{
            System.out.println();
            System.out.println("Student " + studID + " was not found");
        }
    }

    public void displayStudentList(ArrayList <Student> studList){
        System.out.println("\n------------------------------------\nStudent List\n------------------------------------");
        System.out.printf("%-25s %-10s\n", "Name", "Matric No.");
        for (Student student : studList) {
            System.out.printf("%-25s %-10s\n", student.getName(), student.getID().toUpperCase());
        }
    }


    public void addLecturer(ArrayList <Lecturer> lecturerList){
        Scanner s = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter lecturer name: ");
        String lecturerName = s.nextLine();
        System.out.println("Enter staff number: ");
        String staffNumber = s.nextLine();

        boolean lecturerAdded = false;
        for (Lecturer lecturer : lecturerList) {
            if (lecturer.getID().equalsIgnoreCase(staffNumber)) {
                System.out.println();
                System.out.println("Another lecturer already registered with the inserted staff number");
                lecturerAdded = true;
                break;
            }
        }

        if (!lecturerAdded) {
            lecturerList.add(new Lecturer(lecturerName, staffNumber));
            System.out.println();
            System.out.println(lecturerName + " is successfully added");
        }
    }

    public void removeLecturer(ArrayList <Lecturer> lecturerList){
        Lecturer toBeRemoved = null;
        Scanner s = new Scanner(System.in);

        displayLecturerList(lecturerList);

        System.out.println();
        System.out.println("Enter staff number: ");
        String staffNumber = s.nextLine();

        boolean lecturerFound = false;
        for (Lecturer lecturer : lecturerList) {
            if (lecturer.getID().equalsIgnoreCase(staffNumber)) {
                lecturerFound = true;
                toBeRemoved = lecturer;
                break;
            }
        }

        if (lecturerFound) {
            lecturerList.remove(toBeRemoved);
            System.out.println();
            System.out.println(toBeRemoved.getName() + " is removed");
        } else {
            System.out.println();
            System.out.println("Lecturer not found with the inserted staff number");
        }
    }

    public void displayLecturerList(ArrayList <Lecturer> lecturerList){
        System.out.println("\n------------------------------------\nLecturer List\n------------------------------------");
        System.out.printf("%-25s %-10s\n", "Name", "Staff No.");
        for (Lecturer lecturer : lecturerList) {
            System.out.printf("%-25s %-10s\n", lecturer.getName(), lecturer.getID().toUpperCase());
        }
    }

    public void addCourse(ArrayList <Course> courseList){
        Scanner s = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter course name: ");
        String courseName = s.nextLine();
        System.out.println("Enter course code: ");
        String courseCode = s.nextLine();

        boolean courseReg = false;
        for (Course course : courseList) {
            if (course.getCode().equalsIgnoreCase(courseCode)) {
                System.out.println();
                System.out.println("Another course already registered with the given course code");
                courseReg = true;
                break;
            }
        }

        if (!courseReg) {
            courseList.add(new Course(courseName, courseCode));
            System.out.println();
            System.out.println(courseName + " is successfully added");
        }
    }

    public void removeCourse(ArrayList <Course> courseList, ArrayList <Student> studList){
        Course toBeRemoved = null;
        Scanner s = new Scanner(System.in);

        displayCourseList(courseList);

        System.out.println();
        System.out.println("Enter course code: ");
        String courseCode = s.nextLine();

        boolean courseFound = false;
        for (Course course : courseList) {
            if (course.getCode().equalsIgnoreCase(courseCode)) {
                courseFound = true;
                toBeRemoved = course;
                break;
            }
        }

        if (courseFound) {
            courseList.remove(toBeRemoved);
            System.out.println();
            System.out.println(toBeRemoved.getName() + " is removed");
            for (Student student : studList) {
                for (Course courseReg : student.getRegCourseList()) {
                    if (courseReg == toBeRemoved) {
                        student.getRegCourseList().remove(courseReg);
                    }
                }
            }
        } else {
            System.out.println();
            System.out.println("Course not found with the inserted course code");
        }
    }

    public void displayCourseList(ArrayList <Course> courseList){
        System.out.println("\n------------------------------------\nCourse List\n------------------------------------");
        System.out.printf("%-40s %-11s\n", "Name", "Course Code");
        for (Course course : courseList) {
            System.out.printf("%-40s %-11s\n", course.getName(), course.getCode().toUpperCase());
        }
    }
}
