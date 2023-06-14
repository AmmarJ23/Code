import java.util.Scanner;

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
