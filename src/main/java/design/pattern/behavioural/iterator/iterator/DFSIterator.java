package design.pattern.behavioural.iterator.iterator;

import design.pattern.behavioural.iterator.collection.Node;

import java.util.Stack;

public class DFSIterator<T> implements Iterator<T> {
    Stack<Node<T>> stack;

    public DFSIterator(Node<T> root) {
        stack = new Stack<>();
        if (root != null)
            stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T getNext() {
        if (!hasNext())
            throw new RuntimeException("No Elements to get next");
        Node<T> n = stack.pop();
        if (n.getLeft() != null)
            stack.add(n.getLeft());
        if (n.getRight() != null)
            stack.add(n.getRight());
        return n.getData();
    }
}
