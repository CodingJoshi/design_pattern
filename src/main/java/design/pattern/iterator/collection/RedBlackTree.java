package design.pattern.iterator.collection;

import design.pattern.iterator.iterator.BFSIterator;
import design.pattern.iterator.iterator.DFSIterator;
import design.pattern.iterator.iterator.Iterator;

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