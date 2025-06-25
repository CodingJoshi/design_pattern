package design.pattern.structural.decorator.decorator;

import design.pattern.structural.decorator.wrapee.Order;

public class OrderFeesDecorator extends OrderDecorator {
    int fees;

    public OrderFeesDecorator(Order order, int fees) {
        super(order);
        this.fees = fees;
    }

    @Override
    public float calculateAmount() {
        return this.order.calculateAmount() + fees;
    }
}
