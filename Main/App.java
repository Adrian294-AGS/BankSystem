package Main;

import studentmanagement.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms = 2; // fixed number of terms
        int subjects = 3; // fixed number of subjects

        // ===== Enum + Constructors + Array of Objects =====
        System.out.println("=== Student Management System ===");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Polymorphism: array of Person references to Student objects
        Person[] students = new Student[n];

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
            
           // Create Student object
            students[i] = new Student(name, id, level, terms, subjects);

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
        for (Person s : students) {
            System.out.println("- " + s.displayInfo());
        }

        // ===== Search with FOR loop =====
        boolean loop = true;
        while (loop) {
            System.out.print("\nEnter ID to search or type 404 to exit: ");
            int targetId = sc.nextInt();
            boolean found = false;

            for (int i = 0; i < students.length; i++) {
                if (students[i].getId() == targetId) {
                    System.out.println("Found: " + students[i].displayInfo());
                    found = true;
                } else if (targetId == 404) {
                    loop = false;
                }
            }
            if (!found) {
                System.out.println("Student not found.");
            }
        }

        // ===== Show averages =====
        System.out.println("\n=== Student Averages ===");

        // Polymorphism in action: computeGrade() behaves differently based on actual object type
        for (Person s : students) {
            System.out.printf("%s's overall average: %.2f%n", s.getName(), s.computeGrade());
        }

        sc.close();
    }
}
