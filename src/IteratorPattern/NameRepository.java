package IteratorPattern;

public class NameRepository {

    private String[] names = { "Hüseyin" , "Okan", "Mustafa", "Yelda"};

    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
