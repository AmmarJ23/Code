public class Lecturer extends Person{

    //Properties
    private String dept;
    
    //Constructors
    public Lecturer(){}
    public Lecturer(String name, String ID, String dept)
    {
        this.name = name;
        this.ID = ID;
        this.dept = dept;
    }

    public void setName(String name) {this.name = name;}
    public void setStaffNo(String ID) {this.ID = ID;}
    public void setDept(String dept) {this.dept = dept;}


    @Override
    public String toString()
    {
        return "\nLecturer Info: \n  Name: " + name + "\n  StaffNo: " + ID + "\n  Department: " + dept;
    }
}
