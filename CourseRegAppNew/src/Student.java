import java.util.ArrayList;

class Student {
    private String name;
    private String country;
    private ArrayList<Course> mycList;


    public Student() {
        this.mycList = new ArrayList<>();
    }


    public Student(String name, String warga) {
        this();
        this.name = name;
        this.country = warga;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
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

