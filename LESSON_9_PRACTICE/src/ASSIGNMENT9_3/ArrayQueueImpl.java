package prog9_3_startup;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int size = 0;
    private int front = -1;
    private int rear = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(int value) {
        if (rear == arr.length) {
            resize();
        }
        arr[rear++] = value;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot dequeue because Queue is empty");
        }
        size--;
        if (size == 0) {
            front = -1;
            rear = 0;
        }
    }

    public int peek() {
        if (isEmpty()) throw new IllegalStateException("Cannot peek because Queue is empty");
        return arr[front];
    }

    private void resize() {
        int[] newArr = new int[arr.length * 2];
        int j = 0;
        for (int i = 0; i < rear; i++) {
            newArr[j++] = arr[i];
        }
        arr = newArr;
        front = 0;
        rear = j;
    }

    public static void main(String[] args) {
        ArrayQueueImpl q = new ArrayQueueImpl();

        //uncomment when ready
        for (int i = 0; i < 15; i++)
            q.enqueue(i);
        for (int i = 0; i < 14; i++)
            q.dequeue();
        System.out.println(q.size());//1
        System.out.println(q.peek());//14
    }
}
