import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {

        Vector <String> vname = new Vector <String> ();
        vname.add("ali");
        vname.add("abu");
        vname.add("siti");

        vname.add(1, "alice");
        vname.set(2, "bob");

        Boolean result = vname.remove("ali"); //returns removed string/element

        System.out.println(result);
        System.out.println("vname size: " + vname.size()); //print current vector size
        System.out.println(vname); //print all elements
        System.out.println(vname.elementAt(0));
    }
}
