public class Student {
    
    //Properties
    private String name, matricNo;
    private int age;
    private Course[] courseList = new Course[6];
    private int courseNum;
    
    //Constructors
    public Student(){courseNum = 0;};
    public Student(String name, String matricNo, int age)
    {
        this.name = name;
        this.matricNo = matricNo;
        this.age = age;
    }

    public void setName(String name) {this.name = name;}
    public void setMatricNo(String matricNo) {this.matricNo = matricNo;}
    public void setAge(int age) {this.age = age;}

    public void regCourse(Course c)
    {
        courseList[courseNum] = c;
        courseNum++;
        c.addStudent(this);
    }

    public void displayInfo()
    {
        System.out.println("Name: " + name + "\n  MatricNo: " + matricNo + "\n  Age: " + age);
    }

    @Override
    public String toString()
    {
        return "\nStudent Info: \n  Name: " + name + "\n  MatricNo: " + matricNo + "\n  Age: " + age;
    }

}
