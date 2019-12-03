package CreationalDesignPatterns.AbstractFactory.ColorShapeFactory;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
