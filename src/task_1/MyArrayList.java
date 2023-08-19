package task_1;


import java.util.Arrays;

public class MyArrayList<E> {

    private static final int DEFAULT_SIZE = 10;

    private Object[] elements;
    private int size = 0;

    public MyArrayList() {
        this(DEFAULT_SIZE);
    }

    public MyArrayList(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Некоректний розмір - " + size + " для масиву");
        }
        elements = new Object[size];
    }

    public void add(E value) {
        checkResize();
        elements[size] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Некоректний індекс - " + index + " для масиву розміром " + size);
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IllegalArgumentException("Некоректний індекс - " + index + " для масиву розміром " + size);
        }
        return (E) elements[index];
    }

    private void checkResize() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size + 5);
        }
    }
}
