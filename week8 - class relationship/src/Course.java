import java.util.ArrayList;

public class Course {
    private String code;
    private ArrayList<Student> studentList = new ArrayList<>();
    private int studNum;

    //Constructors
    public Course(){}
    public Course(String code)
    {
        this.code = code;
        studNum = 0;
    }

    //add student to student list
    public void addStudent(Student s)
    {
        if (studNum < 30) {
            studentList.add(s);
            System.out.println("Student " + s.getName() + " added to " + this.code);
            studNum++;
        }else{
            System.out.println("Can't add more than 30 students");
        }
    }

    //remove student from student list
    public void removeStudent(Student s)
    {
        studentList.remove(s);
        studNum--;
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
