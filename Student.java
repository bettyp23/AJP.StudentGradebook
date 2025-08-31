/**
 * Betty Phipps
 * 
 * Student class models a student with a name, course, and three test scores.
 * It provides methods to set/get data, calculate average, determine letter grade,
 * and generate a formatted student report.
 */
public class Student {
    // Fields (student information)
    private String fullName;
    private String courseName;
    private double test1, test2, test3;

    // Setters
    public void setFullName(String name) {
        this.fullName = name.trim();
    }

    public void setCourseName(String course) {
        this.courseName = course.trim();
    }

    public void setScores(double t1, double t2, double t3) {
        this.test1 = t1;
        this.test2 = t2;
        this.test3 = t3;
    }

    // Calculate average
    public double getAverage() {
        return (test1 + test2 + test3) / 3.0;
    }

    // Get letter grade
    public String getLetterGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

/**
 * Generates a formatted report for the student.
 * Includes name, course, individual scores, average, and letter grade.
 * @return A string containing the student report
 */
    public String getStudentReport() {
        return String.format(
            "--- Student Report ---%n" +
            "Name: %s%n" +
            "Course: %s%n" +
            "Scores: %.2f, %.2f, %.2f%n" +
            "Average: %.2f%n" +
            "Grade: %s",
            fullName, courseName, test1, test2, test3, getAverage(), getLetterGrade()
        );
    }
}