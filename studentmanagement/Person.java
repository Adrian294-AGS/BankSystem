package studentmanagement;

public abstract class Person implements Evaluatable{
    // Encapsulation: private attributes
    private String name;
    private int id;
    public int[][] grades;

    // Parameterized constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and setters (Encapsulation)
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Methods with parameters
    public void addGrade(int termIndex, int subjectIndex, int grade) {
        if (termIndex >= 0 && termIndex < grades.length &&
            subjectIndex >= 0 && subjectIndex < grades[termIndex].length) {
            grades[termIndex][subjectIndex] = grade;
        }
    }

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
    // Object method using object data
    public abstract String displayInfo();
}
