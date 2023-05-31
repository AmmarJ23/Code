import java.util.ArrayList;

public class Course {
    private String cname;
    private String ccode;
    private String ccred;
    private ArrayList<Student> stdList = new ArrayList<>();

    public Course(){}

    public Course(String cname, String ccode, String ccred){
        this.cname = cname;
        this.ccode = ccode;
        this.ccred = ccred;
    }

    public void addStudent(Student std){
        this.stdList.add(std);
    }

    public void rmStudent(Student std){
        this.stdList.remove(std);
    }

    public void displayStudent(){
        for (Student student : stdList) {
            System.out.println("Name: " + student.name);
            System.out.println("ID: " + student.ID);
        }
    }
    
    //setters and getters
    public String getCname() {
        return this.cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCcode() {
        return this.ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public String getCcred() {
        return this.ccred;
    }

    public void setCcred(String ccred) {
        this.ccred = ccred;
    }

    @Override
    public String toString() {
        return "{" +
            " cname='" + getCname() + "'" +
            ", ccode='" + getCcode() + "'" +
            ", ccred='" + getCcred() + "'" +
            "}";
    }
    
}
