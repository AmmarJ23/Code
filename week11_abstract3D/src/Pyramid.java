public class Pyramid extends GeometricObject{

    private double length, width, height;

    public Pyramid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateVolume() {
        volume = length * width * height;
        volume = volume / 3;
    }

    @Override
    public void calculateSurfaceArea() {
        double baseArea = width * length;  // Area of the base
        double sideArea = width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2))
                        + length * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2));
        surfaceArea = baseArea + sideArea;  // Surface area of the pyramid
    }
    
}
