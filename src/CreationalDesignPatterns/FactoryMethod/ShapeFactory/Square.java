package CreationalDesignPatterns.FactoryMethod.ShapeFactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + " is drawn");
    }
}
