import java.util.Scanner;

public class QueueDemo1 {
    public static final int MAX = 5;
    public static int front = -1;
    public static int rear = -1;

    public static void insert(int[] Q) {
        if (isFull()) {
            System.out.println("Cannot insert. Queue is full!");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % MAX;
            Q[rear] = getElement();
            System.out.println("Element inserted.");
        }
    }

    public static void delete(int[] Q) {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            int deletedElement = Q[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % MAX;
            }
            System.out.println("Deleted element: " + deletedElement);
        }
    }

    public static void display(int[] Q) {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: [");
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + ", ");
                i = (i + 1) % MAX;
            }
            System.out.println(Q[rear] + "]");
        }
    }

    public static boolean isFull() {
        return (front == (rear + 1) % MAX);
    }

    public static boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    private static int getElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to insert: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] queue =new int[MAX];

        while (true) {
            System.out.println("\n--------MENU--------");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("--------------------");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> insert(queue);
                case 2 -> delete(queue);
                case 3 -> display(queue);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
