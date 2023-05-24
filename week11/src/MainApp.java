class Creature {
    public void makeSound() {
        System.out.println("Creature is making a sound.");
    }


    public void move() {
        System.out.println("Creature is moving.");
    }


    public void eat() {
        System.out.println("Creature is eating.");
    }
}


class HumanBeing extends Creature {
    @Override
    public void makeSound() {
        System.out.println("Human is talking.");
    }


    @Override
    public void move() {
        System.out.println("Human is walking.");
    }


    @Override
    public void eat() {
        System.out.println("Human is eating food.");
    }
}


class Snake extends Creature {
    @Override
    public void makeSound() {
        System.out.println("Snake is hissing.");
    }


    @Override
    public void move() {
        System.out.println("Snake is slithering.");
    }


    @Override
    public void eat() {
        System.out.println("Snake is swallowing its prey.");
    }
}


class Squid extends Creature {
    @Override
    public void makeSound() {
        System.out.println("Squid is making a squelching sound.");
    }


    @Override
    public void move() {
        System.out.println("Squid is swimming using its tentacles.");
    }


    @Override
    public void eat() {
        System.out.println("Squid is capturing and eating small fish.");
    }
}


//MainApp
public class MainApp {
    public static void main(String[] args) {
        HumanBeing john = new HumanBeing();
        john.makeSound();
        john.move();
        john.eat();


        Snake cobra = new Snake();
        cobra.makeSound();
        cobra.move();
        cobra.eat();


        Squid giantSquid = new Squid();
        giantSquid.makeSound();
        giantSquid.move();
        giantSquid.eat();
    }
}
