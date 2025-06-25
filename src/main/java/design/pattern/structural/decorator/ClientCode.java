package design.pattern.structural.decorator;

import design.pattern.structural.decorator.decorator.OrderDiscountDecorator;
import design.pattern.structural.decorator.decorator.OrderFeesDecorator;
import design.pattern.structural.decorator.decorator.OrderTaxDecorator;
import design.pattern.structural.decorator.wrapee.Order;
import design.pattern.structural.decorator.wrapee.RetailOrder;

public class ClientCode {
    public static void main(String[] args) {
        Order retailOrder = new RetailOrder(100);
        Order decoratedOrder = new OrderTaxDecorator(
                new OrderFeesDecorator(
                        new OrderDiscountDecorator(retailOrder, 0.05f), 10
                ), 0.15f
        );
        System.out.println(decoratedOrder.calculateAmount());
    }
}
