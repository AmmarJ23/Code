public class Car {
    private Chassis chassis;
    private Engine engine;
    private Wheel[] wheels;


    private String make;
    private String model;


    //constructor
    public Car(String make, String model, Chassis c, Engine e, Wheel w[]) {
        // chassis = new Chassis();
        // engine =  new Engine();
        // wheels =  new Wheel[5];

        chassis = c;
        engine = e;
        wheels = w;

        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
 
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
