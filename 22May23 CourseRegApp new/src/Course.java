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
