public class Car {
    private Chassis chassis;
    private Engine engine;
    private Wheel[] wheel;


    //constructor
    public Car() {
        chassis = new Chassis();
        engine =  new Engine();
        wheel =  new Wheel[4];
    }
    
}
