package design.pattern.factory_pattern.simple_factory;

import design.pattern.factory_pattern.PizzaType;
import design.pattern.factory_pattern.simple_factory.pizza.Pizza;

public class PizzaStore {
    SimplePizzaFactory pizzaFactory;
    public PizzaStore(SimplePizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    Pizza orderPizza(PizzaType type){
       Pizza pizza = pizzaFactory.createPizza(type);

       pizza.prepare();
       pizza.bake();
       pizza.cut();
       pizza.box();
       return pizza;
    }
}
