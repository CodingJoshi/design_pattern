package design.pattern.structural.decorator.wrapee;

public class RetailOrder extends Order {
    int price;

    public RetailOrder(int price) {
        this.price = price;
    }

    @Override
    public float calculateAmount() {
        return this.price;
    }
}
