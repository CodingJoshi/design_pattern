package design.pattern.observer.subject;

import design.pattern.observer.observers.Observer;

public interface Subject {
    void notifyObservers();

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);
}
