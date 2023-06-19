import java.util.ArrayList;

public class Course {
    private String name;
    private String code;
    private Lecturer lecturer;
    private ArrayList<Student> studList;
    
    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        studList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public ArrayList<Student> getStudList() {
        return studList;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void addStudent(Student student){
        studList.add(student);
    }

    public void addLecturer(Lecturer lecturer){
        this.lecturer = lecturer;
    }

}
