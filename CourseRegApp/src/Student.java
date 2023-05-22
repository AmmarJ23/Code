public class Student extends Person {
    
    //Properties
    private Course[] courseList = new Course[6];
    private int courseNum;
    
    //Constructors
    public Student(){courseNum = 0;};
    public Student(String name, String ID, int age)
    {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public void setName(String name) {this.name = name;}
    public void setID(String ID) {this.ID = ID;}
    public void setAge(int age) {this.age = age;}

    public void regCourse(Course c)
    {
        courseList[courseNum] = c;
        courseNum++;
        c.addStudent(this);
    }

    public void displayInfo()
    {
        System.out.println(" -Name: " + name + "\n  MatricNo: " + ID + "\n  Age: " + age);
    }

    @Override
    public String toString()
    {
        return "\nStudent Info: \n  Name: " + name + "\n  MatricNo: " + ID + "\n  Age: " + age;
    }

}
