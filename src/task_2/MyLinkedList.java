package task_2;

public class MyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;
    public void add(E value) {
        Node<E> node = new Node<>(value, last, null);
        if (first == null) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
    }
    public void remove(int index) {
        Node<E> nodeToDel = findNode(index);

        if (index != 0) {
            nodeToDel.prev.next = nodeToDel.next;
        } else {
            first = nodeToDel.next;
        }

        if (index != size - 1) {
            nodeToDel.next.prev = nodeToDel.prev;
        } else {
            last = nodeToDel.prev;
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
    public E get(int index) {
        return findNode(index).element;
    }

    private Node<E> findNode(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Некоректний індекс - " + index + " для масиву розміром " + size);
        }

        Node<E> currentNode;
        if (index <= size / 2) {
            currentNode = first;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = last;
            for (int i = 0; i < size - 1 - index; i++) {
                currentNode = currentNode.prev;
            }
        }
        return currentNode;
    }

    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}
