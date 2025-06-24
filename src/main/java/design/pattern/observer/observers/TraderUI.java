package design.pattern.observer.observers;

import design.pattern.observer.subject.AppleStock;
import design.pattern.observer.subject.Subject;

public class TraderUI implements Observer {
    int price;
    String traderName;

    public TraderUI(String name) {
        this.traderName = name;
    }

    @Override
    public void update(Subject subject) {
        AppleStock stock = (AppleStock) subject;
        price = stock.getPrice();
        display();
    }

    @Override
    public void display() {
        System.out.println(traderName + ": Apple Price = " + price);
    }
}
