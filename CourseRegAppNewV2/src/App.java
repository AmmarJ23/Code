import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static Person login(ArrayList <Student> studList, ArrayList <Lecturer> lecturerList, ArrayList <AcademicOfficer> acadList){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter User ID:");
        String logID = s.nextLine();
        // System.out.println("Enter User Password:");
        // String logPass = s.nextLine();

        for (Student student : studList) {
            if (student.getID().equalsIgnoreCase(logID)) {
                return student;
            }
        }

        for (Lecturer lecturer : lecturerList) {
            if (lecturer.getID().equalsIgnoreCase(logID)) {
                return lecturer;
            }
        }

        for (AcademicOfficer academicOfficer : acadList) {
            if (academicOfficer.getID().equalsIgnoreCase(logID)) {
                return academicOfficer;
            }
        }

        return null;
    }

    public static int displayMenu(Person menuChoice) {
        if (menuChoice == null) {
            System.out.println("User not found");
        } else {
            System.out.println("-----------------\nLogged in as " + menuChoice.getName() + "\n-----------------");
            if (menuChoice instanceof Student) {
                System.out.println("[1] Register Course\n[2] Drop Course\n[3] Display Registered Courses\n[0] Exit");
            } else if (menuChoice instanceof Lecturer) {
                System.out.println("[1] Choose Course To Teach\n[2] Stop Teaching Course\n[3] Display Taught Courses\n[0] Exit");
            } else {
                System.out.println("[1] Add Student\n[2] Remove Student\n[3] Display All Students\n[4] Add Lecturer\n[5] Remove Lecturer\n[6] Display All Lecturers\n[7] Add Course\n[8] Remove Course\n[9] Display All Courses\n[0] Exit");
            }

            Scanner s =  new Scanner(System.in);
            System.out.print("=> ");
            return s.nextInt();
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        // Create a list of all classes
        ArrayList<Course> courseList = new ArrayList<>();
        ArrayList <Student> studentList = new ArrayList<>();
        ArrayList <AcademicOfficer> acadList = new ArrayList<>();
        ArrayList <Lecturer> lecturerList = new ArrayList<>();
        Course course1 = new Course("Introduction to Computer Science", "CSC101");
        Course course2 = new Course("Linear Algebra", "MAT202");
        courseList.add(course1);
        courseList.add(course2);

        // Create a student
        Student s1 = new Student("John Doe", "A001");
        Student s2 = new Student("Charlize Ankerton", "A002");
        studentList.add(s1);
        studentList.add(s2);

        //Create lecturers
        Lecturer l1 = new Lecturer("Ambrosia Jones", "S001");
        Lecturer l2 = new Lecturer("Bartholomew Smith", "S002");
        lecturerList.add(l1);
        lecturerList.add(l2);

        //Create Academic Officers
        AcademicOfficer a1 = new AcademicOfficer("Dorothy Eisenhoward", "S101");
        acadList.add(a1);

        //Create boolean for looping
        boolean loop = true;
        
        // // Register the course
        // s1.registerCourse(courseList);        
        // s2.registerCourse(courseList);

        // // Teach course
        // l1.teachCourse(courseList);
        // l2.teachCourse(courseList);


        // // Print the registered courses
        // System.out.println("\nRegistered courses:");
        // s1.displayRegCourses();

        // // Print course info
        // course1.displayInfo();
        // course2.displayInfo();

        // // Remove student
        // a1.removeStudent(studentList, courseList);

        // // Print course info after student removal
        // course1.displayInfo();

        // 1. display login - enter id pass all list
        // 2. Menu - according to user type
        // 3. do stuff
        // 4. exit

        while (loop) {

            Person menuChoice = login(studentList, lecturerList, acadList);

            int actionChoice = displayMenu(menuChoice);

            if (actionChoice >=0) {

                if (menuChoice instanceof Student) {

                    Student studTemp = (Student) menuChoice;

                    if (actionChoice <= 3) {
                        switch (actionChoice) {
                            case 0:
                                loop = false;
                                break;

                            case 1:
                                studTemp.registerCourse(courseList);
                                break;

                            case 2:
                                studTemp.dropCourse(courseList);
                                break;

                            case 3:
                                studTemp.displayRegCourses();
                                break;
                        
                            default:
                                break;
                        }
                    }
            
                } else  if (menuChoice instanceof Lecturer){

                    Lecturer lectTemp = (Lecturer) menuChoice;

                    if (actionChoice <= 3) {
                        switch (actionChoice) {
                            case 0:
                                loop = false;
                                break;

                            case 1:
                                lectTemp.teachCourse(courseList);
                                break;

                            case 2:
                                lectTemp.stopTeach(courseList);
                                break;

                            case 3:
                                lectTemp.displayTaughtCourses();
                                break;

                            default:
                                break;
                        }
                    }
                    
                } else {
                    AcademicOfficer acadTemp = (AcademicOfficer) menuChoice;

                    if (actionChoice <= 9) {
                        switch (actionChoice) {
                            case 0:
                                loop = false;
                                break;

                            //Student
                            case 1: 
                                acadTemp.addStudent(studentList);
                                break;

                            case 2:
                                acadTemp.removeStudent(studentList, courseList);
                                break;

                            case 3:
                                acadTemp.displayStudentList(studentList);
                                break;

                            //Lecturer
                            case 4:
                                acadTemp.addLecturer(lecturerList);
                                break;

                            case 5:
                                acadTemp.removeCourse(courseList);
                                break;

                            case 6:
                                acadTemp.displayLecturerList(lecturerList);
                                break;

                            //Course
                            case 7:
                                acadTemp.addCourse(courseList);
                                break;

                            case 8:
                                acadTemp.removeCourse(courseList);
                                break;

                            case 9:
                                acadTemp.displayCourseList(courseList);
                                break;
                        
                            default:
                                break;
                        }
                    }
                }
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
