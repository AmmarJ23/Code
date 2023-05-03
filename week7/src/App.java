import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {

        Vector <String> vname = new Vector <String> ();
        vname.add("ali");
        vname.add("abu");
        vname.add("siti");

        vname.add(1, "alice");
        vname.set(2, "bob");

        vname.remove(1);


        System.out.println("vname size: " + vname.size()); //print current vector size
        System.out.println(vname); //print all elements
    }
}
