public class Patient extends Person{
    private String patientID;
    private HealthInfo pHealth;

    public Patient(String firstName, String lastName, String gender, String patientID, Address address, int height, int weight) {
        super(firstName, lastName, gender, address);
        this.patientID = patientID;
        pHealth = new HealthInfo(height, weight);
    }

    public String getPatientID() {
        return patientID;
    }

    public int getWeight(){
        return pHealth.getWeight();
    }

    public int getHeight(){
        return pHealth.getHeight();
    }

    public double getBMI(){
        return pHealth.getBmi();
    }

}
