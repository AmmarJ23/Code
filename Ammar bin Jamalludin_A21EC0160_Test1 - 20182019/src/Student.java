//Name          : Ammar bin Jamalludin
//Matric No.    : A21EC0160
//Course        : SECJ2154 - 06
//Title         : Test1 20182019 Question 2

// a)
public class Student {

    //i
    private String name;
    private String matricsNo;
    private double GPA;

    //ii
    static int totalCredit;

    //iii
    Student(){
        totalCredit = 0;
    }

    //iv
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatricsNo() {
        return matricsNo;
    }

    public void setMatricsNo(String matricsNo) {
        this.matricsNo = matricsNo;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double gPA) {
        GPA = gPA;
    }

    public static void addTotalCredit(int Credit) {
        Student.totalCredit += Credit;
    }
}
