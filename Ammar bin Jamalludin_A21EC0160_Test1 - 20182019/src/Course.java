//Name          : Ammar bin Jamalludin
//Matric No.    : A21EC0160
//Course        : SECJ2154 - 06
//Title         : Test1 20182019 Question 2

// b)
public class Course {

    //i
    enum course{

        //ii
        SCSJ2154("Object Oriented Programming", 4),
        SCSD2623("Database Programming", 3),
        SCSV1223("Web Programming", 3),
        SCSJ2203("Software Engineering", 3),
        SCSR2043("Operating Systems", 3),
        ULAB2122("Advanced Academic English Skills", 2),
        UCSD2762("Fundamentals of Technopreneurship", 2),
        SCSD3761("Technopreneurship Seminar", 1);

        //iii
        private String desc;
        private int credit;
        private String grade;

        //iv
        course(String desc, int credit){
            this.desc = desc;
            this.credit = credit;
        }

        //v
        public String getDesc() {
            return desc;
        }

        public int getCredit() {
            return credit;
        }

        public String getGrade() {
            return grade;
        }

        public void setCredit(int credit) {
            this.credit = credit;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        //vi
        double getGradeValue(String g){
            switch (g) {
                case "A":
                    return 4.0;

                case "B":
                    
                    return 3.0;

                case "C":
                    
                    return 2.0;

                case "D":
                    
                    return 1.0;

                case "E":
                    
                    return 0.0;
            
                default:
                    System.out.println("Invalid Grade Value\n");
                    return 0;
            }
        }
    }

}
