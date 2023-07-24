public class Person {
    protected String name;
    protected String ID;
    
    public Person() {
    }

    public Person(String name, String iD) {
        this.name = name;
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String iD) {
        ID = iD;
    }
    
}
