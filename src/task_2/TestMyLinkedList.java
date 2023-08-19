package task_2;

public class TestMyLinkedList {
    public static void testAddElements() {
        System.out.println("\ntestAddElements");

        MyLinkedList<String> myList = new MyLinkedList<>();
        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 100; i++) {
            myList.add("hello");
        }

        System.out.println("list.size() = " + myList.size());
    }

    public static void testRemoveElements() {
        System.out.println("\ntestRemoveElements");

        MyLinkedList<String> myList = new MyLinkedList<>();
        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 100; i++) {
            myList.add("hello");
        }

        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 100; i++) {
            myList.remove(myList.size() - 1);
            // Index 51 out of bounds for length 50
            // Некоректний індекс - 51 для масиву розміром 50
        }

        System.out.println("list.size() = " + myList.size());
    }

    public static void testClearElements() {
        System.out.println("\ntestClearElements");

        MyLinkedList<String> myList = new MyLinkedList<>();
        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 100; i++) {
            myList.add("hello");
        }

        System.out.println("list.size() = " + myList.size());

        myList.clear();

        System.out.println("list.size() = " + myList.size());
    }

    public static void testGetElements() {
        System.out.println("\ntestGetElements");

        MyLinkedList<String> myList = new MyLinkedList<>();

        System.out.println("add elements");

        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 10; i++) {
            myList.add("hello - " + i);
            System.out.println("hello - " + i);
        }

        System.out.println("list.size() = " + myList.size());

        System.out.println("get elements");

        for (int i = 1; i <= 10; i++) {
            System.out.println(myList.get(i - 1));
        }

        System.out.println("list.size() = " + myList.size());
    }

    public static void testArraySize() {
        System.out.println("\ntestArraySize");

        MyLinkedList<String> arr = new MyLinkedList<>();
        System.out.println(arr.size());
        arr.add("hello");
        System.out.println(arr.size());
    }
    
    public static void main(String[] args) {
        testAddElements();
        testRemoveElements();
        testClearElements();
        testGetElements();
        testArraySize();
    }
}
