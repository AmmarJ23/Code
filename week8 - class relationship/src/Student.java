import java.util.ArrayList;

public class Student {
    private String name;
    //Course courseList[] = new Course[6];
    private ArrayList<Course> courseList = new ArrayList<>();
    private int numSubject;

    //Constructors
    public Student(){}
    public Student(String name)
    {
        this.name = name;
        numSubject = 0;
    }

    //add course to courseList
    public void regCourse(Course c)
    {
        if (numSubject < 6) {
            courseList.add(c);
            c.addStudent(this); //add student to course
        }else {
            System.out.println("Can't register more than 6 courses");
        }
    }

    //remove course from courseList
    public void deleteCourse(Course c)
    {
        courseList.remove(c);
        c.removeStudent(this);
    }

    //return student name
    public String getName() {
        return name;
    }

    //set student name
    public void setName(String name) {
        this.name = name;
    }

}
