package design.pattern.factory_pattern.factory_method;

import design.pattern.factory_pattern.PizzaType;
import design.pattern.factory_pattern.factory_method.factories.DliPizzaStore;
import design.pattern.factory_pattern.factory_method.factories.HydPizzaStore;
import design.pattern.factory_pattern.factory_method.products.Pizza;

public class Client {
    public static void main(String[] args) {
        DliPizzaStore delhiPizzaStore = new DliPizzaStore();
        Pizza dliPizza = delhiPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println(dliPizza);

        HydPizzaStore hyderabadPizzaStore = new HydPizzaStore();
        Pizza hydPizza = hyderabadPizzaStore.orderPizza(PizzaType.VEGGIE);
        System.out.println(hydPizza);
    }
}
