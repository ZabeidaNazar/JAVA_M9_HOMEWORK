package task_4;

public class TestMyStack {
    public static void testPushElements() {
        System.out.println("\ntestPushElements");

        MyStack<String> myList = new MyStack<>();
        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 100; i++) {
            myList.push("hello");
        }

        System.out.println("list.size() = " + myList.size());
    }

    public static void testPeekElements() {
        System.out.println("\ntestPeekElements");

        MyStack<String> myList = new MyStack<>();

        System.out.println("push elements");

        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 10; i++) {
            myList.push("hello - " + i);
            System.out.println("hello - " + i);
        }

        System.out.println("list.size() = " + myList.size());

        System.out.println("peek elements");

        for (int i = 1; i <= 10; i++) {
            System.out.println(myList.peek());
        }

        System.out.println("list.size() = " + myList.size());
    }

    public static void testPopElements() {
        System.out.println("\ntestPopElements");

        MyStack<String> myList = new MyStack<>();

        System.out.println("push elements");

        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 10; i++) {
            myList.push("hello - " + i);
            System.out.println("hello - " + i);
        }

        System.out.println("list.size() = " + myList.size());

        System.out.println("pop elements");

        for (int i = 1; i <= 10; i++) {
            System.out.println(myList.pop());
        }

        System.out.println("list.size() = " + myList.size());
    }

    public static void testClearElements() {
        System.out.println("\ntestClearElements");

        MyStack<String> myList = new MyStack<>();
        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 100; i++) {
            myList.push("hello");
        }

        System.out.println("list.size() = " + myList.size());

        myList.clear();

        System.out.println("list.size() = " + myList.size());
    }

    public static void testRemoveElements() {
        System.out.println("\ntestRemoveElements");

        MyStack<String> myList = new MyStack<>();
        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 100; i++) {
            myList.push("hello");
        }

        System.out.println("list.size() = " + myList.size());

        for (int i = 1; i <= 100; i++) {
            myList.remove(myList.size() - 1);
        }

        System.out.println("list.size() = " + myList.size());
    }

    public static void testArraySize() {
        System.out.println("\ntestArraySize");

        MyStack<String> arr = new MyStack<>();
        System.out.println(arr.size());
        arr.push("hello");
        System.out.println(arr.size());
    }
    
    public static void main(String[] args) {
        testPushElements();
        testPeekElements();
        testPopElements();
        testRemoveElements();
        testClearElements();
        testArraySize();

        MyStack<String> stack = new MyStack<>();
        stack.push("hello");
        stack.remove(1);
    }
}
