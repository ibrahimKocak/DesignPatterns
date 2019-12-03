package CreationalDesignPatterns.FactoryMethod.ShapeFactory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + " is drawn");
    }
}
