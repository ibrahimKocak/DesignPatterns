package CreationalDesignPatterns.AbstractFactory.ColorShapeFactory;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red filled");
    }
}
