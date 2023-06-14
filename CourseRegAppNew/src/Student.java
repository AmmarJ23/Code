import java.util.ArrayList;

class Student extends Person{
    private String country;
    private ArrayList<Course> courseList;


    public Student(ArrayList<Course> mycList) {
        this.courseList = mycList;
    }


    public Student(String name, String iD, ArrayList<Course> courseList) {
        super(name, iD);
        this.courseList = courseList;
    }


    public Student() {
        this.courseList = new ArrayList<>();
    }


    public Student(String name, String warga) {
        this();
        this.name = name;
        this.country = warga;
    }

    public void registerCourse(Course c) {
        this.courseList.add(c);
    }


    public ArrayList<Course> getCourseList() {
        return courseList;
    }


    public String getCountry() {
        return country;
    }

}

