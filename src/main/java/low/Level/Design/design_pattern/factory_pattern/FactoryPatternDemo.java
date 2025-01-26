package low.Level.Design.design_pattern.factory_pattern;

import java.awt.*;
import java.awt.Rectangle;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        shape shape2 = shapeFactory.getShape("CIRCLE");
        shape2.draw();

        shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
