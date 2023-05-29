public class Cylinder extends GeometricObject {

    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void calculateVolume() {
        volume = Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public void calculateSurfaceArea() {
        double interCalc1, interCalc2;
        interCalc1 = 2 * Math.PI * radius * height;
        interCalc2 = 2 * Math.PI * Math.pow(radius, 2);
        surfaceArea = interCalc1 + interCalc2;
    }
    
}
