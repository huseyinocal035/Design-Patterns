package IteratorPattern;

public class Main {

    public static void main(String[] args) {

        NameRepository repository = new NameRepository();

        for (Iterator iterator = repository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
}
