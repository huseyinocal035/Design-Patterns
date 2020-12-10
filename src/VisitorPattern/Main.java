package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(5, 6,10));
        shapeList.add(new Rectangle(4, 6,3,8));
        shapeList.add(new Square(5,5,5,5));

        PrinterShapeVisitor visitor = new PrinterShapeVisitor();
        shapeList.forEach(shape -> shape.accept(visitor));
    }

}
