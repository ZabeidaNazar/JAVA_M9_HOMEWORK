package task_4;

import java.util.EmptyStackException;

public class MyStack<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;
    public void push(E value) {
        Node<E> node = new Node<>(value, last);
        if (first == null) {
            first = node;
        }
        last = node;
        size++;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Некоректний індекс - " + index + " для масиву розміром " + size);
        }

        if (index == size - 1) {
            last = last.prev;
            if (size == 1) {
                first = null;
            }
            size--;
            return;
        }

        Node<E> nodeToDelPrev = last;
        // size - 1 => last index
        // (size - 1) - index => get index from other list side
        // ( (size - 1) - index ) - 1 => get previous element before element that user want delete
        for (int i = 0; i < size - index - 2; i++) {
            nodeToDelPrev = nodeToDelPrev.prev;
        }
        Node<E> nodeToDel = nodeToDelPrev.prev;
        nodeToDelPrev.prev = nodeToDel.prev;

        if (nodeToDel == first) {
            first = nodeToDelPrev;
        }

        size--;
    }
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }
    public int size() {
        return size;
    }
    public E peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return last.element;
    }
    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        Node<E> nodeToDel = last;

        last = nodeToDel.prev;

        if (size == 1) {
            first = null;
        }

        size--;
        return nodeToDel.element;
    }

    private static class Node<E> {
        private E element;
        private Node<E> prev;

        public Node(E element, Node<E> prev) {
            this.element = element;
            this.prev = prev;
        }
    }
}
