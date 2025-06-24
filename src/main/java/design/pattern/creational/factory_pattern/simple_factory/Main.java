package design.pattern.creational.factory_pattern.simple_factory;

import design.pattern.creational.factory_pattern.PizzaType;
import design.pattern.creational.factory_pattern.simple_factory.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        Pizza pizza = pizzaStore.orderPizza(PizzaType.VEGGIE);
        System.out.println(pizza);
    }
}
