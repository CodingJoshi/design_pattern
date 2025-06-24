package design.pattern.behavioural.iterator.collection;

import design.pattern.behavioural.iterator.iterator.Iterator;

public interface Tree<T> {
    Iterator<T> createBFSIterator();

    Iterator<T> createDFSIterator();
}
