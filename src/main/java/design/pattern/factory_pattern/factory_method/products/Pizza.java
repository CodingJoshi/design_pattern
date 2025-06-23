package design.pattern.factory_pattern.factory_method.products;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();
    public void prepare(){
        System.out.println("Preparing: " + name);
        System.out.println("Tossing dough .." + dough);
        System.out.println("Adding sauce .." + sauce);
        System.out.println("Adding toppings: " + String.join(",",toppings));
    }
    public void bake() {
        System.out.println("Baking for 25min @ 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Placing in offical PizzaStore box");
    }
}
