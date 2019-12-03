package CreationalDesignPatterns.Builder.MealBuilder;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal("Veg Meal");
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal("Non Veg Meal");
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegNoDrinkMeal() {
        Meal meal = new Meal("Non Veg Meal No Drink");
        meal.addItem(new ChickenBurger());
        return meal;
    }
}
