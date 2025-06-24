package design.pattern.behavioural.observer.observers;

import design.pattern.behavioural.observer.subject.Subject;

public interface Observer {
    /**
     * When there are multiple states, each observer needs some of them
     * instead of passing all states, object will be notified on change any one of them
     * then observer fetches the exact state that is needed
     *
     * @param subject
     */
    void update(Subject subject);

    void display();

    /**
     * When there is only one or two states, and all observer needs the same
     * we can pass the state while notifying observer, no need to call back
     * @param state
     */
    /*
    void update(String state);
    */
}
