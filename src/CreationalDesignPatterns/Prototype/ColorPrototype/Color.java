package CreationalDesignPatterns.Prototype.ColorPrototype;

public abstract class Color implements Cloneable {

    String colorName;

    public abstract void addColor();

    public Object clone() {

        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
