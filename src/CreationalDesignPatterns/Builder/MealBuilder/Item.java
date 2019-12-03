package CreationalDesignPatterns.Builder.MealBuilder;

public interface Item {
    String name();

    Packing packing();

    float price();
}
