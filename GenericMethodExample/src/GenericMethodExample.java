class Creature {
    // Class implementation
    protected String id;
}


class Human extends Creature {
    private String name;
    // Class implementation
    public void print(){
        System.out.println(id);
    }
}

class UgStudent extends Human{
    public void print(){
        System.out.println(name);
    }
}


class Cat extends Creature {
    // Class implementation
}


class Tiger extends Cat {
    // Class implementation
}


public class GenericMethodExample {
    public static <T> void printDetails(T t) {
        System.out.println("Creature Details:");
        System.out.println("Type: " + t.getClass().getSimpleName());
        //System.out.println("Sound: " + t.makeSound());
        System.out.println("------------------------");
    }


    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Tiger tiger = new Tiger();


        printDetails(human);
        printDetails(cat);
        printDetails(tiger);
    }
}
