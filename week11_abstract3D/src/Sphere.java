public class Sphere extends GeometricObject {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateVolume() {
        volume = 4/3;
        volume = volume * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public void calculateSurfaceArea() {
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
    }
    
}
