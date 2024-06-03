package Queue;
// Linear Queue implementation
public class ArrayQueue {
    public static final int MAX = 5;
    public static int front = 0;
    public static int rear = -1;
    public static int[] Q = new int[MAX];

    public void insert(int x) {
        if (rear == MAX - 1) {
            System.out.println("Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            Q[++rear] = x;
        }
    }

    public void delete() {
        if (front > rear) {
            System.out.println("Underflow");
        } else {
            front++;
        }
    }

    public void display() {
        if (front > rear) {
            System.out.println("Underflow");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
