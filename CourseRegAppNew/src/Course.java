import java.util.ArrayList;

class Course {
    private String name;
    private String code;
    private ArrayList<Student> studList;


    public Course() {
        this.studList = new ArrayList<>();
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
        studList.add(me);
    }


    public ArrayList<Student> getStudList() {
        return studList;
    }


    public String getCode() {
        return code;
    }

}