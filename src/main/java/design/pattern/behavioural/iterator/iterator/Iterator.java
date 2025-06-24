package design.pattern.behavioural.iterator.iterator;

public interface Iterator<T> {
    boolean hasNext();

    T getNext();
}
