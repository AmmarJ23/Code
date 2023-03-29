public class Course {
    
    //Properties
    private String name, courseCode;
    private int credit;
    private final int MAX = 30;
    private Student[] studentList = new Student[MAX];
    private int studentNum;

    //Constructors
    public Course() {studentNum = 0;}
    public Course(String name, String courseCode, int credit)
    {
        this.name = name;
        this.courseCode = courseCode;
        this.credit = credit;
    }

    //Methods
    public void setName(String name) {this.name = name;}   
    public void setCourseCode(String courseCode) {this.courseCode = courseCode;} 
    public void setCredit(int credit) {this.credit = credit;}

    public void addStudent(Student s)
    {
        //if at max capacity, display msg to inform user
        if (studentNum >= MAX) 
        {
            System.out.println("Course is full, unable to add student\n");
        } else 
        {
            studentList[studentNum] = s;
            studentNum++;
        }
    }

    public void displayRegStudents()
    {
        for (int i = 0; i < studentNum; i++) {
            studentList[i].displayInfo();
        }
    }

    @Override
    public String toString()
    {
        return "\nCourseInfo: \n  Name:" + name + "\n  Code:"+ courseCode + "\n  Credit:" + credit;
        
    }
}

//current student number

