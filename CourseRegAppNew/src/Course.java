import java.util.ArrayList;

class Course {
    private String name;
    private String code;
    private ArrayList<Student> srList;


    public Course() {
        this.srList = new ArrayList<>();
    }


    public Course(String name, String code) {
        this();
        this.name = name;
        this.code = code;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void addStudent(Student me) {
        srList.add(me);
    }


    public ArrayList<Student> getSrList() {
        return srList;
    }


    public String getCode() {
        return code;
    }

}