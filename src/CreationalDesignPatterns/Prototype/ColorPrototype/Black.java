package CreationalDesignPatterns.Prototype.ColorPrototype;

public class Black extends Color {

    Black() {
        this.colorName = "Black";
    }

    @Override
    public void addColor() {
        System.out.println("Black color added");
    }
}
