package CreationalDesignPatterns.AbstractFactory.ColorShapeFactory;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green filled");
    }
}
