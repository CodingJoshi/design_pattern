package design.pattern.behavioural.iterator;

import design.pattern.behavioural.iterator.collection.BinaryTree;
import design.pattern.behavioural.iterator.iterator.Iterator;

public class ClientCode {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree<Integer>();
        Integer[] levelOrder = {1, 2, 3, null, 4, null, 9, 5, null, null, 10, null, 6, null, null, 7, 8};
        binaryTree.buildTree(levelOrder);
        Iterator<Integer> iterator = binaryTree.createBFSIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.getNext() + " ");
        }
    }
}
