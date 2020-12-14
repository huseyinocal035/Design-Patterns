package CompositePattern;

// Leaf
public class Manager implements Employee {

    private String name;

    private int id;

    public Manager(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println(name + " is a manager with this id: " + id);
    }

}
