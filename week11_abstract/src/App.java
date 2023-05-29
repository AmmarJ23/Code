import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Cat c1 = new Cat("gemoi");
        // c1.makeSound();
        // c1.move();

        Animal c1 = new Cat("Haru");
        Animal f1 = new Fish("Fina");
        Animal sq1 =  new Squid("Bal");
        Animal sn1 = new Snake("Snek");
        Animal h1 = new Human("Dave");

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(c1);
        animalList.add(f1);
        animalList.add(sq1);
        animalList.add(sn1);
        animalList.add(h1);

        for (Animal animal : animalList) {
            System.out.println(animal.getClass());
            animal.makeSound();
            animal.normalMove();
            animal.panicMove();
            animal.alternativeMove();
            System.out.println("");
        }
    }
}

interface Move{
    void normalMove();
    void panicMove();
    void alternativeMove();
}

//+ Create classes: Fish, Squid, Snake, Human
//implement all abstract class methods
//in main, create/instantiate object (c1, f1, sq1, sn1, h1) and call the methods


abstract class Animal implements Move{


    protected String name;
   
    public Animal(){}


    public Animal(String name) {
        this.name = name;
    }
   
    public void sleep() {
        System.out.println("Zzz...");
    }


    public abstract void makeSound();
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void normalMove() {
        System.out.println(this.name + ": Walk on 4 legs normally");
    }

    @Override
    public void panicMove() {
        System.out.println(this.name + ": jump in panic mode");
    }

    @Override
    public void alternativeMove() {
        System.out.println("Alternatively, " + this.name + " welk");
    }
}

class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Blub");
    }

    @Override
    public void normalMove() {
        System.out.println(this.name + ": Swim normally");
    }

    @Override
    public void panicMove() {
        System.out.println(this.name + ": Swim frantically");
    }

    @Override
    public void alternativeMove() {
        System.out.println(this.name + ": Swim in a different pattern");
    }
}

class Squid extends Animal {
    public Squid(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Blub?");
    }

    @Override
    public void normalMove() {
        System.out.println(this.name + ": Swim with tentacles");
    }

    @Override
    public void panicMove() {
        System.out.println(this.name + ": Squirt ink and swim away");
    }

    @Override
    public void alternativeMove() {
        System.out.println(this.name + ": Change swimming direction rapidly");
    }
}

class Snake extends Animal {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Sssss");
    }

    @Override
    public void normalMove() {
        System.out.println(this.name + ": Slither normally");
    }

    @Override
    public void panicMove() {
        System.out.println(this.name + ": Slither quickly in panic");
    }

    @Override
    public void alternativeMove() {
        System.out.println(this.name + ": Slither in a different pattern");
    }
}

class Human extends Animal {
    public Human(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Hello");
    }

    @Override
    public void normalMove() {
        System.out.println(this.name + ": Walk normally");
    }

    @Override
    public void panicMove() {
        System.out.println(this.name + ": Run in panic mode");
    }

    @Override
    public void alternativeMove() {
        System.out.println(this.name + ": Walk in a different style");
    }
}