package design.pattern.factory_pattern.factory_method.factories;

import design_patterns.factory_pattern.PizzaType;
import design_patterns.factory_pattern.factory_method.products.DliStyleCheesePizza;
import design_patterns.factory_pattern.factory_method.products.DliStylePepperoniPizza;
import design_patterns.factory_pattern.factory_method.products.Pizza;
import design_patterns.factory_pattern.factory_method.products.DliStyleVeggiePizza;

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
