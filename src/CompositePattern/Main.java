package CompositePattern;

public class Main {

    public static void main(String[] args) {
        Developer developer = new Developer("Hüseyin Öcal", 123);
        Developer developer2 = new Developer("Okan Öcal", 456);
        Developer developer3 = new Developer("Mustafa Öcal", 789);

        Directory softwareDirectory = new Directory();
        softwareDirectory.addEmployee(developer);
        softwareDirectory.addEmployee(developer2);
        softwareDirectory.addEmployee(developer3);

        Manager manager = new Manager("Ali Öcal", 101112);
        Manager manager2 = new Manager("Figen Öcal", 131415);

        Directory otherDirectory = new Directory();
        otherDirectory.addEmployee(manager);
        otherDirectory.addEmployee(manager2);

        Directory directory = new Directory();
        directory.addEmployee(softwareDirectory);
        directory.addEmployee(otherDirectory);
        directory.displayEmployeeDetails();
    }

}
