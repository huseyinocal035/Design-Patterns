package CompositePattern;

// Leaf
public class Developer implements Employee {

    private String name;

    private int id;

    public Developer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println(name + " is a developer with this id: " + id);
    }

}
