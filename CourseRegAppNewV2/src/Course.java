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

    public void displayInfo(){

        System.out.println("\nCourse Information: " + this.getCode());

        if (lecturer == null) {
            System.out.println("Lecturer: None");
        } else {
            System.out.println("Lecturer Name: " + lecturer.getName());
            System.out.println("Lecturer ID: " + lecturer.getID() + "\n");
        }

        System.out.println("Students Registered to " + this.getCode() + ": " + this.getName());
        int i = 0;
        for (Student student : studList) {
            i++;
            System.out.println(i + ". " + student.getName() + " (" + student.getID() + ")");
        }
    }

    public void removeStudent(Student student){
        studList.remove(student);
    }

}
