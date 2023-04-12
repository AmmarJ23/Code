public class AppArray2D {

    public static void main(String[] args) {
        // coursemark ==> quiz1(5m) quiz2(5m) test1(20m) labtest(20m) assg(10m) :
        // total(60m)
        // double[] courseMark = new double[5];
        double[] courseMark = { 4.5, 4.0, 16.5, 15.0, 7.5 };


        double[][] courseMarkAllStud = new double [3][5];

        System.out.println("CourseMarkAllStud: " + courseMarkAllStud);


        for (double cm : courseMark) {
            System.out.println(cm);
        }
    }
}
