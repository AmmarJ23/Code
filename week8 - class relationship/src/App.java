public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("SECJ2203");
        Course c2 = new Course("SECR2113");
        Course c3 = new Course("SECV2203");
        Course c4 = new Course("SECP2113");
        Course c5 = new Course("SECJ2203");
        Course c6 = new Course("SECR2113");
        Course c7 = new Course("SECJ2203");
        Course c8 = new Course("SECR2113");
        Course c9 = new Course("SECJ2203");

        s1.regCourse(c1);
        s1.regCourse(c2);
        s1.regCourse(c3);

        s1.deleteCourse(c2);

        return;
    }
}
