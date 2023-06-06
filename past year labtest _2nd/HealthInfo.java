public class HealthInfo {
    private int height;
    private int weight;
    private double bmi;

    public HealthInfo(int height, int weight) {
        this.height = height;
        this.weight = weight;
        calcBMI();
    }

    public void calcBMI() {
        double tempH = height / 100.0;
        bmi = weight / (tempH * tempH);
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }
}
