package studentmanagement;

public abstract class Person {
    // Encapsulation: private attributes
    private String name;
    private int id;

    // Parameterized constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // simple validation example
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    // Object method using object data
    public abstract String displayInfo();
}
