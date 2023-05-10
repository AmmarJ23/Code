public class Ownership {

    private Car c;
    private Person p;
    
    public Ownership(Car c, Person p) {
        this.c = c;
        this.p = p;
    }

    public Car getC() {
        return c;
    }

    public void setC(Car c) {
        this.c = c;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }
    
}
