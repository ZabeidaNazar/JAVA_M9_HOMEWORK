package task_5;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> {
    private Node[] values;
    public static final int DEFAULT_SIZE = 16;
    public static final float DEFAULT_THRESHOLD = 1.75f;
    private int size = 0;

    private float threshold;

    public MyHashMap() {
        this(DEFAULT_SIZE);
    }

    public MyHashMap(int initialCapacity) {
        this(initialCapacity, DEFAULT_THRESHOLD);
    }

    public MyHashMap(int initialCapacity, float threshold) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal initial capacity: " + initialCapacity);
        if (threshold <= 0)
            throw new IllegalArgumentException("Illegal threshold: " + threshold);
        values = new Node[initialCapacity];
        this.threshold = threshold;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> current = values[index];
        while (current != null) {
            if (Objects.equals(current.key, key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node<K, V> node = new Node<>(key, value, values[index]);

        values[index] = node;
        if (++size > values.length * threshold) {
            resize();
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> node = values[index];
        while (node != null && !Objects.equals(node.key, key)) {
            node = node.next;
        }
        return node == null ? null : node.value;
    }

    public void remove(K key) {
        int index = getIndex(key);
        Node<K, V> node = values[index];
        if (node == null) {
            return;
        }
        if (Objects.equals(node.key, key)) {
            values[index] = node.next;
            size--;
            return;
        }
        Node<K, V> nodePrev = node;
        node = node.next;
        while (node != null) {
            if (Objects.equals(node.key, key)) {
                nodePrev.next = node.next;
                size--;
                return;
            }
            nodePrev = node;
            node = node.next;
        }
    }
    public void clear() {
        Arrays.fill(values, null);
        size = 0;
    }
    public int size() {
        return size;
    }

    private void resize() {
        Node[] oldValues = values;
        values = new Node[values.length + 10];
        int index;
        Node<K, V> oldNodeNext;
        for (Node<K, V> node : oldValues) {
            while (node != null) {
                index = getIndex(node.key);

                oldNodeNext = node.next;

                node.next = values[index];
                values[index] = node;

                node = oldNodeNext;
            }
        }
    }

    private int getIndex(K key) {
        return Math.abs(Objects.hashCode(key)) % values.length;
    }

    private static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
