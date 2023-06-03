import java.util.Vector;

public class PatientSystem {
    public static void main(String[] args) {

        /*
            Define a Vector to dynamically store objects of Patient
        */



        /*
            Initialize the Patient and Address objects based on the information given in the Table
            Then, add the Patient objects into the Vector.
        */





 		/*
            Invoke the displayRecord function to display the list of patients
        */





        /*
            Remove the 2nd patient in the list
        */




 		/*
            Invoke the displayRecord function again to display the list of patients
        */


    }



    /*
        This function display the record of the patient. This function is INCOMPLETE.
        Please complete the function to display the output as shown in Figure 2.
    */
    public static void displayRecord(Vector<Patient> pL) {

        System.out.println("\nPatient Record Management System");
        System.out.println("================================");
        System.out.printf("%-5s%-10s%-25s%-10s%-50s%-10s%-10s%-10s\n", "No", "PatientID", "Name", "Gender", "Address", "Height", "Weight", "BMI");
        System.out.printf("%-5s%-10s%-25s%-10s%-50s%-10s%-10s%-10s\n", "--", "---------", "----", "------", "-------", "------", "------", "---");


		//To display the list of patients based on output given in Figure 2
        for(int i = 0; i < pL.size(); i++) {
            System.out.printf("%-5d%-10s%-25s%-10s%-50s%-10d%-10d%-10.2f\n", (i+1),
                              //_____________________________________
                              //_____________________________________
                              );
        }

        System.out.println("\n-------------------");
        System.out.println("Total Patients: "+ pL.size());
    }
}