package design.pattern.creational.factory_pattern.simple_factory;

import design.pattern.creational.factory_pattern.PizzaType;
import design.pattern.creational.factory_pattern.simple_factory.pizza.Pizza;

public class PizzaStore {
    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    Pizza orderPizza(PizzaType type) {
        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
