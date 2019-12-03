package CreationalDesignPatterns.Builder.MealBuilder;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
