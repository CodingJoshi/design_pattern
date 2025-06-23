package design.pattern.factory_pattern.factory_method.factories;

import design_patterns.factory_pattern.PizzaType;
import design_patterns.factory_pattern.factory_method.products.Pizza;

public abstract class PizzaStore {
   public Pizza orderPizza(PizzaType type){
       Pizza pizza = createPizza(type);
       pizza.prepare();
       pizza.bake();
       pizza.cut();
       pizza.box();
       return pizza;
   }

   protected abstract Pizza createPizza(PizzaType type);
}
