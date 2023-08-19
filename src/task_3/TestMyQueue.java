package task_3;

public class TestMyQueue {
    public static void testAddElements() {
        System.out.println("\ntestAddElements");

        MyQueue<String> myList = new MyQueue<>();
        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 100; i++) {
            myList.add("hello");
        }

        System.out.println("list.size() = " + myList.size());
    }

    public static void testPeekElements() {
        System.out.println("\ntestPeekElements");

        MyQueue<String> myList = new MyQueue<>();

        System.out.println("add elements");

        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 10; i++) {
            myList.add("hello - " + i);
            System.out.println("hello - " + i);
        }

        System.out.println("list.size() = " + myList.size());

        System.out.println("peek elements");

        for (int i = 1; i <= 10; i++) {
            System.out.println(myList.peek());
        }

        System.out.println("list.size() = " + myList.size());
    }

    public static void testPollElements() {
        System.out.println("\ntestPollElements");

        MyQueue<String> myList = new MyQueue<>();

        System.out.println("add elements");

        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 10; i++) {
            myList.add("hello - " + i);
            System.out.println("hello - " + i);
        }

        System.out.println("list.size() = " + myList.size());

        System.out.println("poll elements");

        for (int i = 1; i <= 10; i++) {
            System.out.println(myList.poll());
        }

        System.out.println("list.size() = " + myList.size());
    }

    public static void testClearElements() {
        System.out.println("\ntestClearElements");

        MyQueue<String> myList = new MyQueue<>();
        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 100; i++) {
            myList.add("hello");
        }

        System.out.println("list.size() = " + myList.size());

        myList.clear();

        System.out.println("list.size() = " + myList.size());
    }

    public static void testArraySize() {
        System.out.println("\ntestArraySize");

        MyQueue<String> arr = new MyQueue<>();
        System.out.println(arr.size());
        arr.add("hello");
        System.out.println(arr.size());
    }
    
    public static void main(String[] args) {
        testAddElements();
        testPeekElements();
        testPollElements();
        testClearElements();
        testArraySize();
    }
}
