public class App {
    public static void main(String[] args) throws Exception {

        //3 courses
        Course oops6 = new Course("Object-Oriented Programming", "SECJ2154", 4);
        Course ses1 = new Course("Software Engineering", "SECJ2203", 2);
        Course oss5 = new Course("Operating System", "SECR2043", 3);

        System.out.println(oss5.toString());
        System.out.println(oops6.toString());
        System.out.println(ses1.toString());

        //6 new students
        Student s1 = new Student("Alex", "A21EC0001", 21);
        Student s2 = new Student("Bob", "A21EC0002", 22);
        Student s3 = new Student("Charlie", "A21EC0003", 22);
        Student s4 = new Student("Devin", "A21EC0004", 23);
        Student s5 = new Student("Eddy", "A21EC0005", 20);
        Student s6 = new Student("Fein", "A21EC0006", 19);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
        System.out.println(s6.toString());

        //2 lecturers
        Lecturer lect1 = new Lecturer("Gordon", "A0001", "Faculty of Computing");
        Lecturer lect2 = new Lecturer("Hannah", "A0002", "Department of Social Sciences");

        System.out.println(lect1.toString());
        System.out.println(lect2.toString());


        s1.regCourse(oops6);
        s2.regCourse(oops6);
        s3.regCourse(oops6);

        oops6.displayRegStudents();
        
        return;
    }
}
