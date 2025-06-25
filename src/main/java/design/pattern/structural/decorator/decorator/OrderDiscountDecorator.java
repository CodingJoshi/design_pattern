package design.pattern.structural.decorator.decorator;

import design.pattern.structural.decorator.wrapee.Order;

public class OrderDiscountDecorator extends OrderDecorator {
    float discount;

    public OrderDiscountDecorator(Order order, float discount) {
        super(order);
        this.discount = discount;
    }

    @Override
    public float calculateAmount() {
        return this.order.calculateAmount() * (1 - discount);
    }
}
