//Betty Phipps
import java.util.Scanner;   // Import Scanner class for reading user input

/**
 * StudentGradebookApp is the main application class.
 * It interacts with the user via the console to input student data,
 * creates a Student object, and displays a formatted student report.
 */
public class StudentGradebookApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Ask for details
        System.out.print("Enter student full name: ");
        String name = input.nextLine();

        // 2. Prompt the user for student information
        // Ask for the course name
        System.out.print("Enter course name: ");
        String course = input.nextLine();

        // Ask for the three test scores
        System.out.print("Enter score for Test 1: ");
        double t1 = input.nextDouble();

        System.out.print("Enter score for Test 2: ");
        double t2 = input.nextDouble();

        System.out.print("Enter score for Test 3: ");
        double t3 = input.nextDouble();

        // 2. Create student object
        Student student = new Student();
        student.setFullName(name);
        student.setCourseName(course);
        student.setScores(t1, t2, t3);

        // 3. Print report
        System.out.println();
        System.out.println(student.getStudentReport());

        input.close();
    }
}