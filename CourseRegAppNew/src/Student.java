import java.util.ArrayList;

class Student extends Person{
    private String country;
    private ArrayList<Course> mycList;


    public Student(ArrayList<Course> mycList) {
        this.mycList = mycList;
    }


    public Student(String name, String iD, ArrayList<Course> mycList) {
        super(name, iD);
        this.mycList = mycList;
    }


    public Student() {
        this.mycList = new ArrayList<>();
    }


    public Student(String name, String warga) {
        this();
        this.name = name;
        this.country = warga;
    }

    public void registerCourse(Course c) {
        this.mycList.add(c);
    }


    public ArrayList<Course> getMycList() {
        return mycList;
    }


    public String getCountry() {
        return country;
    }

}

