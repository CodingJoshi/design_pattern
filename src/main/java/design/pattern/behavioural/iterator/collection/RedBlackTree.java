package design.pattern.behavioural.iterator.collection;

import design.pattern.behavioural.iterator.iterator.BFSIterator;
import design.pattern.behavioural.iterator.iterator.DFSIterator;
import design.pattern.behavioural.iterator.iterator.Iterator;

public class RedBlackTree<T> implements Tree<T> {
    Node<T> root;

    public RedBlackTree() {
        root = null;
    }

    @Override
    public Iterator<T> createBFSIterator() {
        return new BFSIterator<>(root);
    }

    @Override
    public Iterator<T> createDFSIterator() {
        return new DFSIterator<>(root);
    }

    public Node<T> buildTree() {
        return root;
    }
}