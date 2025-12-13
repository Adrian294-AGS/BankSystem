package studentmanagement;

public class Student extends Person implements Evaluatable {
    // Encapsulation: private attributes
    private GradeLevel level;
    // 2D array: grades[term][subject]
    private int[][] grades;

    // Parameterized constructor (Constructor overloading #2)
    public Student(String name, int id, GradeLevel level, int terms, int subjects) {
        super(name, id); // use super() in constructor
        this.level = level;
        this.grades = new int[terms][subjects];
    }

    // Getters and setters (Encapsulation)
    public GradeLevel getLevel() {
        return level;
    }

    public void setLevel(GradeLevel level) {
        this.level = level;
    }

    public int[][] getGrades() {
        return grades;
    }

    // Methods with parameters
    public void addGrade(int termIndex, int subjectIndex, int grade) {
        if (termIndex >= 0 && termIndex < grades.length &&
            subjectIndex >= 0 && subjectIndex < grades[termIndex].length) {
            grades[termIndex][subjectIndex] = grade;
        }
    }

    public int getSubjectCount() {
        return grades.length > 0 ? grades[0].length : 0;
    }

    // implemeting abstract method
    public String displayInfo() {
        return "Student[name=" + getName() + ", id=" + getId() + ", level=" + level + "]";
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

    // Another method with parameters and return
    public double computeTermAverage(int termIndex) {
        if (termIndex < 0 || termIndex >= grades.length) return 0.0;
        int sum = 0;
        int count = 0;
        for (int subj = 0; subj < grades[termIndex].length; subj++) {
            sum += grades[termIndex][subj];
            count++;
        }
        return count == 0 ? 0.0 : (double) sum / count;
    }
}

