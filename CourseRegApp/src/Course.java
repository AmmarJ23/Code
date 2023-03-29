public class Course {
    
    //Properties
    private String name, courseCode;
    private int credit;
    private Student[] studentList = new Student[40];
    private int studentNum;

    //Constructors
    public Course() {studentNum = 0;}
    public Course(String name, String courseCode, int credit)
    {
        this.name = name;
        this.courseCode = courseCode;
        this.credit = credit;
    }

    public void setName(String name) {this.name = name;}
    public void setCourseCode(String courseCode) {this.courseCode = courseCode;}
    public void setCredit(int credit) {this.credit = credit;}

    public void addStudent(Student s)
    {
        studentList[studentNum] = s;
        studentNum++;
    }

    @Override
    public String toString()
    {
        return "\nCourseInfo: \n  Name:" + name + "\n  Code:"+ courseCode + "\n  Credit:" + credit;
    }
}

//current student number

