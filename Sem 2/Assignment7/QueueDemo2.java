import java.util.Scanner;

class Node {
    int info;
    Node next;

    Node(int x) {
        info = x;
        next = null;
    }
}

public class QueueDemo2 {
    public static Node rear, front;

    public static Node insert(Node rear, Node front) {
        Node newNode = new Node(getElement());
        System.out.println("Element inserted.");
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        QueueDemo2.rear = rear;
        QueueDemo2.front = front;
        return rear;
    }

    public static Node delete(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue is empty!");
            return rear;
        }
        Node temp = front;
        front = front.next;
        if (front == null)
            rear = null;
        System.out.println("Deleted element: " + temp.info);
        QueueDemo2.rear = rear;
        QueueDemo2.front = front;
        return rear;
    }

    public static void display(Node rear, Node front) {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = front;
        System.out.print("Queue elements: [");
        while (temp.next != null) {
            System.out.print(temp.info + ", ");
            temp = temp.next;
        }
        System.out.println(temp.info + "]");
    }

    private static int getElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to insert: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rear = front = null;

        while (true) {
            System.out.println("--------MENU--------");
            System.out.println("0: Exit");
            System.out.println("1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Display");
            System.out.println("--------------------");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> rear = insert(rear, front);
                case 2 -> rear = delete(rear, front);
                case 3 -> display(rear, front);
                default -> System.out.println("Wrong choice");
            }
        }
    }
}