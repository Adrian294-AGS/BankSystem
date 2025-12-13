package Main;
import studentmanagement.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Enum + Constructors + Array of Objects =====
        System.out.println("=== Student Management System ===");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        // ===== FOR loop with Scanner input =====
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Grade Level (FIRST_YEAR, SECOND_YEAR, THIRD_YEAR, FOURTH_YEAR): ");
            String levelStr = sc.nextLine();
            GradeLevel level = GradeLevel.valueOf(levelStr.toUpperCase());

            students[i] = new Student(name, id, level, 2, 3);

            // Fill grades interactively
            for (int term = 0; term < 2; term++) {
                for (int subj = 0; subj < 3; subj++) {
                    System.out.print("Enter grade for Term " + (term + 1) + ", Subject " + (subj + 1) + ": ");
                    int grade = sc.nextInt();
                    students[i].addGrade(term, subj, grade);
                }
            }
            sc.nextLine(); // consume newline
        }

        // ===== FOR-EACH loop: display items in an array =====
        System.out.println("\n=== Student List (FOR-EACH) ===");
        for (Student s : students) {
            System.out.println("- " + s.displayInfo());
        }

        // ===== Search with FOR loop + break =====
        System.out.print("\nEnter ID to search: ");
        int targetId = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == targetId) {
                System.out.println("Found: " + students[i].displayInfo());
                found = true;
                break; // stopping when condition is met
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }

        // ===== Show averages =====
        System.out.println("\n=== Student Averages ===");
        for (Student s : students) {
            System.out.printf("%s's overall average: %.2f%n", s.getName(), s.computeGrade());
        }

        sc.close();
    }
}

