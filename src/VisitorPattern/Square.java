package VisitorPattern;

public class Square extends Rectangle {

    public Square(int x, int y, int height, int width) {
        super(x, y, height, width);
    }

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}
