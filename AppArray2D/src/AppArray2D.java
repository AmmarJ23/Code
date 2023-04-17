
public class AppArray2D {

    public static void main(String[] args) {
     
        Student sList[] = new Student[10];

        Student s1 = new Student("John Doe", "A1234", 'M');
        Student s2 = new Student("Jane Smith", "B5678", 'F');
        Student s3 = new Student("Bob Johnson", "C9101", 'M');
        Student s4 = new Student("Sally Lee", "D1112", 'F');
        Student s5 = new Student("Tom Brown", "E1314", 'M');
        Student s6 = new Student("Emily Davis", "F1516", 'F');
        Student s7 = new Student("Alex Nguyen", "G1718", 'M');
        Student s8 = new Student("Grace Kim", "H1920", 'F');
        Student s9 = new Student("David Chen", "I2122", 'M');
        Student s10 = new Student("Olivia Wilson", "J2324", 'F');

        s1.toString();

        sList[0] = s1;
        sList[1] = s2;
        sList[2] = s3;
        sList[3] = s4;
        sList[4] = s5;
        sList[5] = s6;
        sList[6] = s7;
        sList[7] = s8;
        sList[8] = s9;
        sList[9] = s10;

        int i=1;
        for (Student student : sList) {
            
            System.out.println("\nStudent " + i +": ");
            System.out.println(student.toString());
            i++;
            
        }
    }
}
