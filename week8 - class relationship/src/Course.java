import java.util.ArrayList;

public class Course {
    private String code;
    private ArrayList<Student> studentList = new ArrayList<>();

    //Constructors
    public Course(){}
    public Course(String code)
    {
        this.code = code;

    }

    //add student to student list
    public void addStudent(Student s)
    {
        if (studentList.size() < 30) {
            studentList.add(s);
        }else{
            System.out.println("Can't add more than 30 students");
        }
    }

    //remove student from student list
    public void removeStudent(Student s)
    {
        studentList.remove(s);
    }

    //return course code
    public String getCode() {
        return code;
    }

    //set course code
    public void setCode(String code) {
        this.code = code;
    }    
}
