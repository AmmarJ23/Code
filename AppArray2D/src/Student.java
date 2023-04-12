public class Student {
    private String name, matricNo;
    private char gender;

    Student(){};

    Student(String n, String mN, char g)
    {
        name = n;
        matricNo = mN;
        gender = g;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getMatricNo() {
        return matricNo;
    }

    @Override  
    public String toString() {

        return "Name: " + name + "\nMatric No: " + matricNo + "\nGender: " + gender;
    }
}
