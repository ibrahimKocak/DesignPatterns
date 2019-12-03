package CreationalDesignPatterns.AbstractFactory.ColorShapeFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {

        if (shape == null)
            return null;

        if (shape.equalsIgnoreCase("Circle"))
            return new Circle();

        else if (shape.equalsIgnoreCase("Rectangle"))
            return new Circle();

        else if (shape.equalsIgnoreCase("Square"))
            return new Circle();

        return null;
    }
}
