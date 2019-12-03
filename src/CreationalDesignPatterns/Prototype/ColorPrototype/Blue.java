package CreationalDesignPatterns.Prototype.ColorPrototype;

public class Blue extends Color {

    Blue() {
        this.colorName = "Blue";
    }

    @Override
    public void addColor() {
        System.out.println("Blue color added");
    }
}
