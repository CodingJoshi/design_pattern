package design.pattern.structural.decorator.decorator;

import design.pattern.structural.decorator.wrapee.Order;

public class OrderTaxDecorator extends OrderDecorator {
    float taxRate;

    public OrderTaxDecorator(Order order, float taxRate) {
        super(order);
        this.taxRate = taxRate;
    }

    @Override
    public float calculateAmount() {
        return this.order.calculateAmount() * (1 + taxRate);
    }
}
