public class Person {
    protected String name, ID;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", ID='" + getID() + "'" +
            "}";
    }
}