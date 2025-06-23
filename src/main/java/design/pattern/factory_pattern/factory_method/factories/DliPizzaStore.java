package design.pattern.factory_pattern.factory_method.factories;

import design.pattern.factory_pattern.PizzaType;
import design.pattern.factory_pattern.factory_method.products.DliStyleCheesePizza;
import design.pattern.factory_pattern.factory_method.products.DliStylePepperoniPizza;
import design.pattern.factory_pattern.factory_method.products.Pizza;
import design.pattern.factory_pattern.factory_method.products.DliStyleVeggiePizza;

public class DliPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
       return switch (type){
           case VEGGIE -> new DliStyleVeggiePizza();
           case PEPPERONI -> new DliStylePepperoniPizza();
           case CHEESE -> new DliStyleCheesePizza();
       };
    }
}
