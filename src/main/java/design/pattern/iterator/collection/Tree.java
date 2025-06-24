package design.pattern.iterator.collection;

import design.pattern.iterator.iterator.Iterator;

public interface Tree<T> {
    Iterator<T> createBFSIterator();
    Iterator<T> createDFSIterator();
}
