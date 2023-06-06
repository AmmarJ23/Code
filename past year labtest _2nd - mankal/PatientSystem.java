import java.util.Vector;

class Person{
    private String firstName;
    private String lastName;
    private String gender;
    private Address address;

    public Person(String firstName, String lastName, String gender, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }
}

class Address{
    private String street;
    private String city;
    private int postcode;
    private String state;

    public Address(String street, String city, int postcode, String state){
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.state = state;
    }

    public String getAddress(){
        return (street + " " + city + " " + postcode + " " + state);
    }
}

class Patient extends Person{
    private String patientID;
    private HealthInfo phealth;

    public Patient(String firstName, String lastName, String gender, String patientID, Address address, int height, int weight) {
        super(firstName, lastName, gender, address);
        this.patientID = patientID;
        phealth = new HealthInfo(height, weight);
    }

    public String getPatientID() {
        return patientID;
    }

    public int getWeight(){
        return this.phealth.getWeight();
    }

    public int getHeight(){
        return this.phealth.getHeight();
    }

    public double getBMI(){
        return this.phealth.getBMI();
    }
}

class HealthInfo{
    private int height;
    private int weight;
    private double bmi;

    public HealthInfo(int height, int weight) {
        this.height = height;
        this.weight = weight;
        calcBMI();
    }

    public void calcBMI() {
        double tempH = height / 100.0;
        bmi = weight / (tempH * tempH);
    }

    public int getHeight() {
        return height;
    }
    
    public int getWeight() {
        return weight;
    }

    public double getBMI() {
        return bmi;
    }
}

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
        Patient p1  = new Patient("Akmal", "Adnan", "Male", "P0001", new Address("Jalan Pahlawan", "Skudai", 81300, "Johor"), 180, 82);
        Patient p2 = new Patient("Syafiq", "Yusof", "Male", "P0002", new Address("Jalan Flora", "Skudai", 81300, "Johor"), 186, 80);
        Patient p3 = new Patient("Mei", "Ling Koh", "Female", "P0003", new Address("Jalan Bakti", "Skudai", 81300, "Johor"), 168, 45);

        patientList.add(p1);
        patientList.add(p2);
        patientList.add(p3);




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
            System.out.printf("%-5d%-10s%-25s%-10s%-50s%-10d%-10d%-10.2f\n", (i+1), pL.elementAt(i).getPatientID(), pL.elementAt(i).getFullName(),
                                pL.elementAt(i).getGender(), pL.elementAt(i).getAddress().getAddress(), pL.elementAt(i).getHeight(), pL.elementAt(i).getWeight(), pL.elementAt(i).getBMI());
        }

        System.out.println("\n-------------------");
        System.out.println("Total Patients: "+ pL.size());
    }
}