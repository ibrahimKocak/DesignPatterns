package CreationalDesignPatterns.FactoryMethod.ShapeFactory;

public class ShapeFactory {

    public Shape getShape(ShapeType shape) {

        switch (shape) {

            case Rectangle:
                return new Rectangle();
            case Square:
                return new Square();
            case Circle:
                return new Circle();
        }

        return null;
    }
}
