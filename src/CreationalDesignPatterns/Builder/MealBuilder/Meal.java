package CreationalDesignPatterns.Builder.MealBuilder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private String name;
    private List<Item> items = new ArrayList<>();

    Meal(String name) {
        this.name = name;
    }

    void addItem(Item item) {
        this.items.add(item);
    }

    private float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {

        System.out.println(this.name + ",");

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }

        System.out.println("Cost : " + this.getCost() + "\n");
    }
}
