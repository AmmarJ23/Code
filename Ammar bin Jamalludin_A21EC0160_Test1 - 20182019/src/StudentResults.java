//Name          : Ammar bin Jamalludin
//Matric No.    : A21EC0160
//Course        : SECJ2154 - 06
//Title         : Test1 20182019 Question 2

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentResults {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);


        //i
        System.out.println("Enter Student Matric No.: ");
        String matricNo = s.next();
        s.close();

        //ii
        String studentFile = matricNo + ".txt";
        File file = new File(studentFile); // Create a File object
        Scanner fileRead = new Scanner(file); // Pass the File object to the Scanner constructor

        //iii
        Student student = new Student();

        String studentName = fileRead.nextLine();

        student.setName(studentName);
        student.setMatricsNo(matricNo);

        String grade = null;
        String courseCode = null;
        double gradePointTotal = 0;

        Course.course courseVar = null;

        //vii
        FileWriter outputFile = new FileWriter("Slip" + matricNo + ".txt");

        outputFile.write("EXAMINATION RESULTS FOR SEM 2, 2018/2019\n");
        outputFile.write("NAME       : " + student.getName() + "\n");
        outputFile.write("MATRICS NO : " + student.getMatricsNo() + "\n\n");
        outputFile.write("CODE        COURSE                             CREDIT    GRADE\n");
        outputFile.write("==============================================================\n");

        while (fileRead.hasNext()) {
            grade = fileRead.next();
            courseCode = fileRead.next();

            //iv
            courseVar = Course.course.valueOf(courseCode);

            //vi.1
            Student.addTotalCredit(courseVar.getCredit());
            gradePointTotal += courseVar.getGradeValue(grade);

            String tempString = String.format("%-12s%-35s    %d        %s", courseCode, courseVar.getDesc(), courseVar.getCredit(), grade);
            outputFile.write(tempString + "\n");
        }

        fileRead.close();

        //vi.2
        double gpa = gradePointTotal / Student.totalCredit;
        student.setGPA(gpa);

        //vii

        outputFile.write("==============================================================\n");
        outputFile.write("CREDIT EARNED : " + Student.totalCredit + "\n");
        outputFile.write("GPA           : " + student.getGPA() + "\n\n");
        outputFile.close();

        System.out.println("Examination Slip is generated...\n");
    }
}
