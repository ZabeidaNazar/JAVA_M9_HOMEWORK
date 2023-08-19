package task_3;

public class MyQueue<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;
    public void add(E value) {
        Node<E> node = new Node<>(value, null);
        if (first == null) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
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
            return null;
        }
        return first.element;
    }
    public E poll() {
        if (size == 0) {
            return null;
        }

        Node<E> nodeToDel = first;

        first = nodeToDel.next;

        if (size == 1) {
            last = null;
        }

        size--;
        return nodeToDel.element;
    }

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }
}
