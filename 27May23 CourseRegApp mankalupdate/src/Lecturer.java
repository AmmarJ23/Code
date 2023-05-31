import java.util.ArrayList;

public class Lecturer extends Person{

    //constructor
    public Lecturer(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    public void viewCourseList(ArrayList<Course> courseList){
        for (Course course : courseList) {
            System.out.println(course.toString());
        }
    }
    
}
