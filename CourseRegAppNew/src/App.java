import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


//-----------------entity class - Student-------------------//
class Student {
    private String name;
    private String country;
    private ArrayList<Course> mycList;


    public Student() {
        this.mycList = new ArrayList<>();
    }


    public Student(String name, String warga) {
        this();
        this.name = name;
        this.country = warga;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void registerCourse(Course c) {
        this.mycList.add(c);
    }


    public ArrayList<Course> getMycList() {
        return mycList;
    }


    public String getCountry() {
        return country;
    }


}


////////////////// entity class - Course /////////////////////
class Course {
    private String name;
    private String code;
    private ArrayList<Student> srList;


    public Course() {
        this.srList = new ArrayList<>();
    }


    public Course(String name, String kod) {
        this();
        this.name = name;
        this.code = kod;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void addStudent(Student me) {
        srList.add(me);
    }


    public ArrayList<Student> getSrList() {
        return srList;
    }


    public String getCode() {
        return code;
    }


}


////////////////// view/boundary class - StudentView /////////////////////
class StudentView {
    Scanner sc;


    public StudentView() {
        sc = new Scanner(System.in);
    }


    public void displayDetail(Student s) {
        System.out.println("name :" + s.getName());
        System.out.println("country :" + s.getCountry());
        for (Course course : s.getMycList()) {
            System.out.println(course.getName());
            System.out.println(course.getCode());
        }
    }


    public Student readStudentDetail() {
        System.out.println("enter student name");
        String name = sc.nextLine();
        System.out.println("from");
        String country = sc.nextLine();
        Student student = new Student(name, country);
        return student;
    }


    public String readName(String message) {
        System.out.println(message);
        String name = sc.nextLine();
        return name;
    }


    public String readCourse(String message) {
        System.out.println(message);
        String name = sc.nextLine();
        return name;
    }


    public void loginResult(String message) {
        System.out.println(message);
    }
}


////////////////// controller class - StudentController //////////////////////
class StudentController {
    ArrayList<Student> studentList;
    ArrayList<Course> courseList;
    Student me;
    StudentView studentView;


    public StudentController(ArrayList<Student> studentList, ArrayList<Course> courseList) {
        this.studentList = studentList;
        this.courseList = courseList;
        this.me = null;
        this.studentView = new StudentView();
    }


    public void login() {
        if (findStudent("Login name : ") == null) {
            studentView.loginResult("Login failed. No student with such name found...");
        } else {
            studentView.loginResult("Login success. You are :" + me.getName());
        }
    }


    public Student findStudent(String message) {
        String name = studentView.readName(message);
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                this.me = student;
                break;
            }
        }
        return me;
    }


    public Course findCourse() {
        Course c = null;
        String namakrsus = studentView.readCourse("Enter course name: ");
        for (Course course : courseList) {
            if (course.getName().equalsIgnoreCase(namakrsus)) {
                c = course;
                break;
            }
        }
        return c;
    }


    public void addStudent() {
        Student student = studentView.readStudentDetail();
        this.studentList.add(student);


    }


    public void displaystudentList() {
        for (Student student : studentList) {
            studentView.displayDetail(student);
        }
    }


    /* delete me from the studentlist */
    // public void deleteStudent() {
    // Iterator<Student> iterator = studentList.iterator();
    // while (iterator.hasNext()) {
    // Student student = iterator.next();
    // if (student.equals(this.me)) {
    // iterator.remove();
    // break;
    // }
    // }
    // }


    public void deleteStudent1() {
        String name = studentView.readName("Student name to delete: ");
        Iterator<Student> iterator = studentList.iterator();


        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                break;
            }
        }
    }


    /* display me/my detail info */
    // public void displayStudent() {
    // studentView.displayDetail(me);
    // }


    public void displayStudent1() {
        String name = studentView.readName("Student name to display: ");
        Student temp = null;
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                temp = student;
                studentView.displayDetail(temp);
            }
        }
    }


    public void addCourse() {
        findStudent("Add course - Student name");
        Course c = findCourse();
        if ((this.me != null) && (c != null)) {
            this.me.registerCourse(c);
            c.addStudent(me);
        }
    }


}


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
