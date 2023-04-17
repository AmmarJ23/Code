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

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override  
    public String toString() {
        return "Name: " + getName() + "\nMatric No: " + getMatricNo() + "\nGender: " + getGender();
    }
}
