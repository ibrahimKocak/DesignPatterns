package CreationalDesignPatterns.AbstractFactory.ColorShapeFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {

        if (color == null)
            return null;

        if (color.equalsIgnoreCase("Red"))
            return new Red();

        else if (color.equalsIgnoreCase("Green"))
            return new Green();

        else if (color.equalsIgnoreCase("Blue"))
            return new Blue();

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
