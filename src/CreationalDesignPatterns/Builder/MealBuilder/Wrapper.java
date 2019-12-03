package CreationalDesignPatterns.Builder.MealBuilder;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
