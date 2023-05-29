abstract class GeometricObject {

    protected double volume;
    protected double surfaceArea;

    public double getVolume(){
        return this.volume;
    }
    public double getSurfaceArea(){
        return this.surfaceArea;
    }

    public abstract void calculateVolume();
    public abstract void calculateSurfaceArea();
}

