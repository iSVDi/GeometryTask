package org.example;
public class ShapeComparator {

    static boolean isShapeAreaEqual (Shape shape1, Shape shape2) {
           return shape2.getArea().equals(shape1.getPerimeter());
    }

    static boolean isShapePerimeterEqual (Shape shape1, Shape shape2) {
        return shape2.getPerimeter().equals(shape1.getPerimeter());

    }

    static int compareAreas(Shape shape, Shape with) {
        if (shape.getArea() > with.getArea())
            return 1;
        else if (shape.getArea() < with.getArea())
            return -1;
        return 0;
    }

    static int comparePerimeter(Shape shape, Shape with) {
        if (shape.getPerimeter() > with.getPerimeter())
            return 1;
        else if (shape.getPerimeter() < with.getPerimeter())
            return -1;
        return 0;
    }

}