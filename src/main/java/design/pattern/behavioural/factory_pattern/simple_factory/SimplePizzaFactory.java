package design.pattern.behavioural.factory_pattern.simple_factory;

import design.pattern.behavioural.factory_pattern.simple_factory.pizza.Pizza;
import design.pattern.behavioural.factory_pattern.PizzaType;
import design.pattern.behavioural.factory_pattern.simple_factory.pizza.CheesePizza;
import design.pattern.behavioural.factory_pattern.simple_factory.pizza.PepperoniPizza;
import design.pattern.behavioural.factory_pattern.simple_factory.pizza.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new CheesePizza();
            case PEPPERONI -> new PepperoniPizza();
            case VEGGIE -> new VeggiePizza();
        };
    }
}
