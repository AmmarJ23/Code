public class Engine {
    private int horsepower;
    private String engineNumber;

    public Engine(){}
    public Engine(int horsepower, String engineNumber) {
        this.horsepower = horsepower;
        this.engineNumber = engineNumber;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getEngineNumber() {
        return this.engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

}
