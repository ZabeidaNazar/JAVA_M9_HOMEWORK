package task_5;

public class TestMyHashMap {
    public static void testPutElements() {
        System.out.println("\ntestPutElements");

        MyHashMap<String, Integer> myMap = new MyHashMap<>();
        System.out.println("list.size() = " + myMap.size());

        for (int i = 1; i <= 100; i++) {
            myMap.put("hello number - " + i, i);
        }

        System.out.println("list.size() = " + myMap.size());
    }

    public static void testRemoveElements() {
        System.out.println("\ntestRemoveElements");

        MyHashMap<String, Integer> myMap = new MyHashMap<>();
        System.out.println("list.size() = " + myMap.size());

        for (int i = 1; i <= 100; i++) {
            myMap.put("hello number - " + i, i);
        }

        System.out.println("list.size() = " + myMap.size());

        for (int i = 1; i <= 100; i++) {
            myMap.remove("hello number - " + i);
        }

        System.out.println("list.size() = " + myMap.size());
    }

    public static void testClearElements() {
        System.out.println("\ntestClearElements");

        MyHashMap<String, Integer> myMap = new MyHashMap<>();
        System.out.println("list.size() = " + myMap.size());

        for (int i = 1; i <= 100; i++) {
            myMap.put("hello number - " + i, i);
        }

        System.out.println("list.size() = " + myMap.size());

        myMap.clear();

        System.out.println("list.size() = " + myMap.size());
    }

    public static void testGetElements() {
        System.out.println("\ntestGetElements");

        MyHashMap<String, Integer> myMap = new MyHashMap<>();

        System.out.println("put elements");

        System.out.println("list.size() = " + myMap.size());

        for (int i = 1; i <= 10; i++) {
            myMap.put("hello - " + i, i);
            System.out.println("KEY: hello - " + i + "  VALUE: " + i);
        }

        System.out.println("list.size() = " + myMap.size());

        System.out.println("get elements");

        for (int i = 1; i <= 10; i++) {
            System.out.println("KEY: hello - " + i + "  VALUE: " + myMap.get("hello - " + i));
        }

        System.out.println("list.size() = " + myMap.size());
    }

    public static void testArraySize() {
        System.out.println("\ntestArraySize");

        MyHashMap<String, Integer> arr = new MyHashMap<>();
        System.out.println(arr.size());
        arr.put("hello", 23);
        System.out.println(arr.size());
    }

    public static void testPutGetWithKeyNull() {
        System.out.println("\ntestPutGetWithKeyNull");

        MyHashMap<Integer, Integer> hashMap = new MyHashMap<>();
        System.out.println("1. put 100 with key null");
        hashMap.put(null, 100);
        System.out.println("2. get with key null: ");
        System.out.println(hashMap.get(null));
    }

    public static void testSaveWithSameKey() {
        System.out.println("\ntestSaveWithSameKey");

        MyHashMap<String, Integer> myMap = new MyHashMap<>();

        System.out.println("put 10 elements with key 'test'");

        System.out.println("list.size() = " + myMap.size());

        for (int i = 1; i <= 10; i++) {
            myMap.put("test", i);
            System.out.println("KEY: test" + "  VALUE: " + i);
        }

        System.out.println("list.size() = " + myMap.size());

        System.out.println("get element with key 'test'");

        System.out.println("KEY: test" + "  VALUE: " + myMap.get("test"));

        System.out.println("list.size() = " + myMap.size());
    }

    public static void main(String[] args) {
        testPutElements();
        testRemoveElements();
        testClearElements();
        testGetElements();
        testArraySize();
        testPutGetWithKeyNull();
        testSaveWithSameKey();
    }
}