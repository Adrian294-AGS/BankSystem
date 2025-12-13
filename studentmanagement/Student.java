package studentmanagement;

// Inheritance: Student Inherits the Person or the superClass
public class Student extends Person  {
    // Encapsulation: private attributes
    private GradeLevel level;
    // 2D array: grades[term][subject]
    private int[][] grades;

    // Parameterized constructor (Constructor overloading)
    public Student(String name, int id, GradeLevel level, int terms, int subjects) {
        super(name, id); // use super() in constructor
        this.level = level;
        super.grades = new int[terms][subjects];
        this.grades = new int[terms][subjects];
    }

    // Methods with parameters
    public void addGrade(int termIndex, int subjectIndex, int grade) {
        if (termIndex >= 0 && termIndex < grades.length &&
            subjectIndex >= 0 && subjectIndex < grades[termIndex].length) {
            grades[termIndex][subjectIndex] = grade;
        }
    }

    // implemeting abstract method
    public String displayInfo() {
        return "Student[name=" + super.getName() + ", id=" + super.getId() + ", level=" + level + "]";
    }

    // Interface method: returns a value
    @Override
    public double computeGrade() {
        int sum = 0;
        int count = 0;
        // Nested FOR loop over 2D array
        for (int term = 0; term < grades.length; term++) {
            for (int subj = 0; subj < grades[term].length; subj++) {
                sum += grades[term][subj];
                count++;
            }
        }
        return count == 0 ? 0.0 : (double) sum / count;
    }

}

