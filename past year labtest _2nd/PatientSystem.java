import java.util.Vector;

public class PatientSystem {
    public static void main(String[] args) {

        /*
            Define a Vector to dynamically store objects of Patient
        */
        Vector<Patient> patientList = new Vector<>();

        /*
            Initialize the Patient and Address objects based on the information given in the Table
            Then, add the Patient objects into the Vector.
        */

        Address a0001 = new Address("Jalan Pahlawan", "Skudai", 81300, "Johor");
        Address a0002 = new Address("Jalan Flora", "Skudai", 81300, "Johor");
        Address a0003 = new Address("Jalan Bakti", "Skudai", 81300, "Johor");


        Patient p0001 = new Patient("Akmal", "Adnan", "Male", "P0001", a0001, 180, 82);
        Patient p0002 = new Patient("Syafiq", "Yusof", "Male", "P0002", a0002, 186, 80);
        Patient p0003 = new Patient("Mei Ling", "Koh", "Female", "P0003", a0003, 168, 45);

        patientList.add(p0001);
        patientList.add(p0002);
        patientList.add(p0003);

 		/*
            Invoke the displayRecord function to display the list of patients
        */
        displayRecord(patientList);




        /*
            Remove the 2nd patient in the list
        */
        patientList.remove(1);



 		/*
            Invoke the displayRecord function again to display the list of patients
        */

        displayRecord(patientList);
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
                              pL.get(i).getPatientID(),
                              pL.get(i).getFullName(),
                              pL.get(i).getGender(),
                              pL.get(i).getAddress().getAddress(),
                              pL.get(i).getHeight(),
                              pL.get(i).getWeight(),
                              pL.get(i).getBMI()
                              );
        }

        System.out.println("\n-------------------");
        System.out.println("Total Patients: "+ pL.size());
    }
}