package CreationalDesignPatterns.Builder.MealBuilder;

import TestDesignPatern.Test;

public class zzTestBuilderMeal extends Test {

    @Override
    public void start() {
        super.start();

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
    }
}
