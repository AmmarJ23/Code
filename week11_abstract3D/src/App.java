import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        GeometricObject cu1 = new Cuboid(10, 10, 10);
        GeometricObject cy1 = new Cylinder(5, 10);
        GeometricObject py1 = new Pyramid(5, 7, 10);
        GeometricObject sp1 = new Sphere(6);

        ArrayList<GeometricObject> geoObjList = new ArrayList<>();

        geoObjList.add(cu1);
        geoObjList.add(cy1);
        geoObjList.add(py1);
        geoObjList.add(sp1);

        for (GeometricObject obj : geoObjList) {
            System.out.println(obj.getClass());
            obj.calculateSurfaceArea();
            obj.calculateVolume();

            System.out.println("Surface Area: " + obj.getSurfaceArea());
            System.out.println("Volume: " + obj.getVolume());
            System.out.println("");
        }
    }
}
