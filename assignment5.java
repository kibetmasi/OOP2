import java.util.ArrayList;
import java.util.List;

public class SchoolManagementSystem {
    private List<String> grades = new ArrayList<>();

    public void assignGrade(String studentName, int grade) {
        try {
            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Invalid grade: " + grade);
            }
            grades.add(studentName + ": " + grade);
            System.out.println("Grade assigned successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Grade assignment attempted for " + studentName + ".");
        }
    }

    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();

        // Attempt to assign valid and invalid grades
        schoolManagementSystem.assignGrade("John", 85);
        schoolManagementSystem.assignGrade("Alice", 105);
    }
}
