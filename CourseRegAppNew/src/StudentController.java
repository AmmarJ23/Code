import java.util.ArrayList;
import java.util.Iterator;

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