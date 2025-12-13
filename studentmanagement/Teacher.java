package studentmanagement;

// Inheritance: Teacher extends Person
public class Teacher extends Person {
    private String department;

    // Parameterized constructor
    public Teacher(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String dep) {
        if (dep != null && !dep.isBlank()) {
            this.department = dep;
        }
    }

    // implementing abstract method
    @Override
    public String displayInfo() {
        return "Teacher[name=" + getName() + ", id=" + getId() + ", dept=" + department + "]";
    }

    // Object method using object data
    public String evaluateStudent(Evaluatable e) {
        double grade = e.computeGrade();
        return grade >= 75.0 ? "Passed" : "Failed";
    }
}

