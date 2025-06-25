package design.pattern.structural.decorator.decorator;

import design.pattern.structural.decorator.wrapee.Order;

public abstract class OrderDecorator extends Order {
    Order order;

    protected OrderDecorator(Order order) {
        this.order = order;
    }

    @Override
    public abstract float calculateAmount();
}
