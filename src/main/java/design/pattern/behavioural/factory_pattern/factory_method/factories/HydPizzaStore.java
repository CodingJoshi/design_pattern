package design.pattern.behavioural.factory_pattern.factory_method.factories;

import design.pattern.behavioural.factory_pattern.PizzaType;
import design.pattern.behavioural.factory_pattern.factory_method.products.HydStyleCheesePizza;
import design.pattern.behavioural.factory_pattern.factory_method.products.HydStylePepperoniPizza;
import design.pattern.behavioural.factory_pattern.factory_method.products.HydStyleVeggiePizza;
import design.pattern.behavioural.factory_pattern.factory_method.products.Pizza;

public class HydPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        return switch (type) {
            case VEGGIE -> new HydStyleVeggiePizza();
            case PEPPERONI -> new HydStylePepperoniPizza();
            case CHEESE -> new HydStyleCheesePizza();
        };
    }
}
