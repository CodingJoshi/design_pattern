package design.pattern.iterator.iterator;

import design.pattern.iterator.collection.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BFSIterator<T> implements Iterator<T> {
    Queue<Node<T>> queue;

    public BFSIterator(Node<T> root) {
        queue = new LinkedList<>();
        if (root != null)
            queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public T getNext() {
        if (!hasNext())
            throw new RuntimeException("No Elements to get next");
        Node<T> n = queue.poll();
        if (n.getLeft() != null)
            queue.add(n.getLeft());
        if (n.getRight() != null)
            queue.add(n.getRight());
        return n.getData();
    }
}
