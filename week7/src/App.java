import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {

        Vector vname = new Vector();
        vname.add("abu");
        vname.add("ali");
        vname.add("siti");

        vname.add(1, "alice");

        System.out.println("vname size: " + vname.size()); //print current vector size
        System.out.println(vname); //print all elements
    }
}
