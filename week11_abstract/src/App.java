import java.util.ArrayList;

abstract class Animal {


    private String name;
   
    public Animal(){}


    public Animal(String name) {
        this.name = name;
    }
   
    public void sleep() {
        System.out.println("Zzz...");
    }


    public abstract void makeSound();
    public abstract void move();
}

//+ Create classes: Fish, Squid, Snake, Human
//implement all abstract class methods
//in main, create/instantiate object (c1, f1, sq1, sn1, h1) and call the methods


class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }


    @Override
    public void move() {
        System.out.println("4 legs");
    }
}

class Fish extends Animal{
    public Fish(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Blub");
    }


    @Override
    public void move() {
        System.out.println("Swims");
    }
}

class Squid extends Animal{
    public Squid(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Blub?");
    }


    @Override
    public void move() {
        System.out.println("Swims");
    }
}

class Snake extends Animal{
    public Snake(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Sssss");
    }


    @Override
    public void move() {
        System.out.println("Slithers");
    }
}

class Human extends Animal{
    public Human(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("hello");
    }


    @Override
    public void move() {
        System.out.println("2 Legs");
    }
}


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
            animal.move();
            System.out.println("");
        }
    }
}
