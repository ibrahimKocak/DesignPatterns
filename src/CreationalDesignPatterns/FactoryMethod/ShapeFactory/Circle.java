package CreationalDesignPatterns.FactoryMethod.ShapeFactory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + " is drawn");
    }
}
