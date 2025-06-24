package design.pattern.behavioural.observer.subject;

import design.pattern.behavioural.observer.observers.Observer;

public interface Subject {
    void notifyObservers();

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);
}
