public class Cuboid extends GeometricObject {

    private double length, width, height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateVolume() {
        volume = length * width * height;
    }

    @Override
    public void calculateSurfaceArea() {
        double lw, wh, lh;
        lw = length * width;
        wh = width * height;
        lh = length * height;
        surfaceArea = lw + wh + lh;
        surfaceArea = surfaceArea * 2;
    }
    
}
