import java.util.ArrayList;
//Array_List -> ArrayList

/*
 * Name         : Ammar bin Jamalludin
 * Matric No.   : A21EC0160
 * Question     : 1
 */

public class Medic {
    public static void main(String[] args) {
        Hospital hosp = new Hospital();
        hosp.setHospitalName("HSA");

        Doctors doc1 = new Doctors(1980,12,1);
        doc1.setDoctorName("Dr.Abu Ali");

        Doctors doc2 = new Doctors(1981,1,1);
        doc2.setDoctorName("Dr.Kim Lee");

        Doctors doc3 = new Doctors(1985,12,12);
        doc3.setDoctorName("Dr.Nadela A/P Ram");

        //remove _
        ArrayList<Doctors> doctorList = new ArrayList<>();
        doctorList.add(doc1);
        doctorList.add(doc2);
        doctorList.add(doc3);
        //A -> a

        hosp.setDoctor(doctorList);
        //add doctorList

        System.out.println("Size of list: " + doctorList.size());
        System.out.println(hosp.getDoctors() +"are Doctors of"+ hosp.getHospName()); //add hosp. and ()

        doctorList.remove(1); //remove s

        System.out.println("Display list:" + doctorList.toString()); //use toString

        Doctors newDoc1= new Doctors(1984,5,8);
        newDoc1.setDoctorName("Dr.Badariah");
        //A -> a
        doctorList.add(0,newDoc1);

        Doctors newDoc2= new Doctors(1982,22,5);
        newDoc2.setDoctorName("Dr.Zang Yu");
        //A -> a
        doctorList.add(3,newDoc2);

        System.out.println("Display list: "+ doctorList.toString());

        System.out.println("Doctor list and their birthday: ");

        System.out.println("First doctor: "+ doctorList.get(0).getDoctorName() + " " + doctorList.get(0).getBday()); //add doctorList.get()

        System.out.println("Second doctor: "+ doctorList.get(1).getDoctorName()  + " " + doctorList.get(1).getBday());

        System.out.println("Third doctor : "+ doctorList.get(2).getDoctorName() + " " +  doctorList.get(2).getBday());

        System.out.println("Forth doctor :"+ doctorList.get(3).getDoctorName()  + " " + doctorList.get(3).getBday());
    }
} //Medic

class Hospital {
    private String hospitalName;
    ArrayList<Doctors> doctors;
    //add Doctors

    public String getHospName() {
        return hospitalName;
    }

    public void setHospitalName(String hospName) {
        hospitalName = hospName;
    }

    //Doctor -> Doctors
    public ArrayList<Doctors> getDoctors() {
        return doctors;
    }

    //Doctor -> Doctors
    public void setDoctor(ArrayList<Doctors> doc) {
        doctors = doc;
    }
} //Hospital

class Doctors {
    private String doctorName;
    private Birthday bday; //add Birthday class

    Doctors(int y,int m,int d){
        bday=new Birthday(y, m, d);
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String docName) {
        doctorName = docName;
    }

    public String toString() {
        return doctorName;
    }

    public Birthday getBday() {
        return bday;
        //return bday
    }
} //Doctors

class Birthday{
    int year,month,day;

    Birthday(int y,int m,int d){
        year=y;
        month=m;
        day=d;
    }

    public String toString(){
        return String.format("%s-%s-%s", year,month,day);
    }
} //Birthday
