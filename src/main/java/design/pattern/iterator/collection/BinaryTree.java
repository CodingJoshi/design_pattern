package design.pattern.iterator.collection;

import design.pattern.iterator.iterator.BFSIterator;
import design.pattern.iterator.iterator.DFSIterator;
import design.pattern.iterator.iterator.Iterator;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> implements Tree<T> {
    Node<T> root;

    public BinaryTree() {
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

    public Node<T> buildTree(T[] levelOrder) {
        Queue<Node<T>> queue = new LinkedList<>();
        root = new Node<>(levelOrder[0]);
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty()) {
            Node<T> n = queue.poll();
            if (i < levelOrder.length && levelOrder[i] != null) {
                n.setLeft(new Node<>(levelOrder[i]));
                queue.add(n.getLeft());
            }
            i++;
            if (i < levelOrder.length && levelOrder[i] != null) {
                n.setRight(new Node<>(levelOrder[i]));
                queue.add(n.getRight());
            }
            i++;
        }
        return root;
    }
}
