interface InterfaceA {
    public void print();
}

class ClassA implements InterfaceA {
    public ClassA() {
        this("Hello");
        System.out.println("Default constructor for ClassA");
    }

    public ClassA(String str) {
        System.out.println("Constructor with argument for ClassA: " + str);
    }

    public void print() {
        System.out.println("Using print method in ClassA");
    }
}

class ClassB extends ClassA implements InterfaceA {
    public ClassB() {
        super("Hi");
        System.out.println("Default constructor for ClassB");
    }

    public ClassB(String str) {
        System.out.println("Constructor with argument for ClassB: " + str);
    }

    public void print() {
        System.out.println("Using print method in ClassB");
    }
}

class ClassC extends ClassB {
    public ClassC() {
        System.out.println("Default constructor for ClassC");
    }
}

public class App {
    public static void main(String[] args) {
        ClassA obj = new ClassB("Nice");
        obj.print();
    }
}