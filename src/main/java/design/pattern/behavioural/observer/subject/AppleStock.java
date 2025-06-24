package design.pattern.behavioural.observer.subject;

import design.pattern.behavioural.observer.observers.Observer;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class AppleStock implements Subject {
    int price;
    List<Observer> observers;

    public AppleStock(int p) {
        this.price = p;
        observers = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(this);
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void updatePrice(int newPrice) {
        this.price = newPrice;
        notifyObservers();
    }
}
