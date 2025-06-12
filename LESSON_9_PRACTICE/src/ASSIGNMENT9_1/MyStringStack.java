package prog9_1_startup;

public class MyStringStack {
    private MyStringLinkedList list;

    public MyStringStack() {
        list = new MyStringLinkedList();
    }

    public void push(String s) {
        list.add(s);
    }

    public String pop() {
        if (isEmpty()) return null;
        String top = list.get(0);
        list.remove(0);
        return top;
    }

    public String peek() {
        if (isEmpty()) return null;
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        MyStringStack stack = new MyStringStack();
        stack.push("Bob");
        stack.push("Harry");
        stack.push("Alice");
        System.out.println("Popping… " + stack.pop());   // Alice
        System.out.println("Peeking…. " + stack.peek()); // Harry
        System.out.println("Popping… " + stack.pop());   // Harry
        System.out.println("Stack now: " + stack);       // Should show [Bob ]
    }
}
