/*
 * Name         : Ammar bin Jamalludin
 * Matric No.   : A21EC0160
 * Question     : 2
 */

public class Person {
    private String name;
    private String ic_no;

    public Person(String name, String ic_no) {
        this.name = name;
        this.ic_no = ic_no;
    }

    void printInfo(){
        System.out.println("   Name: " + name);
        System.out.println(" IC No.: " + ic_no);
    }
}
