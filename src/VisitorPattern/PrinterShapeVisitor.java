package VisitorPattern;

public class PrinterShapeVisitor implements ShapeVisitor{

    @Override
    public void visit(Circle circle) {
        System.out.printf("Circle Center = (%d, %d) and Radius = %d\n",
            circle.getCenterX(), circle.getCenterY(), circle.getRadius());
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.printf("Rectangle TopLeftCorner = (%d, %d), Width = %d and Height = %d\n",
            rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
    }

    @Override
    public void visit(Square square) {
        System.out.printf("Square TopLeftCorner = (%d, %d) and SideLength = %d\n",
            square.getX(), square.getY(), square.getWidth());
    }
}
