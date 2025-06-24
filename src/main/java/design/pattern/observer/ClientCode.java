package design.pattern.observer;

import design.pattern.observer.observers.TraderUI;
import design.pattern.observer.subject.AppleStock;

public class ClientCode {
    public static void main(String[] args) {
        TraderUI saurbh = new TraderUI("saurabh");
        TraderUI pankaj = new TraderUI("pankaj");

        AppleStock stock = new AppleStock(10);
        stock.subscribe(saurbh);
        stock.subscribe(pankaj);

        stock.updatePrice(20);
        stock.updatePrice(25);
        stock.updatePrice(23);
        stock.updatePrice(18);
    }
}
