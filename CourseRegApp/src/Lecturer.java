public class Lecturer {

    //Properties
    private String name, staffNo, dept;
    
    //Constructors
    public Lecturer(){}
    public Lecturer(String name, String staffNo, String dept)
    {
        this.name = name;
        this.staffNo = staffNo;
        this.dept = dept;
    }

    public void setName(String name) {this.name = name;}
    public void setStaffNo(String staffNo) {this.staffNo = staffNo;}
    public void setDept(String dept) {this.dept = dept;}


    @Override
    public String toString()
    {
        return "\nLecturer Info: \n  Name: " + name + "\n  StaffNo: " + staffNo + "\n  Department: " + dept;
    }
}
