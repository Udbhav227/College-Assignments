import java.util.Scanner;

class Node {
    int info;
    Node next;

    Node(int x) {
        info = x;
        next = null;
    }
}

public class StackDemo2 {
    public static Node push(Node top) {
        int x = getElement();
        Node newNode = new Node(x);
        newNode.next = top;
        System.out.println("Pushed element: " + x);
        return newNode;
    }

    public static Node pop(Node top) {
        if (top == null) {
            System.out.println("Cannot pop. Stack is empty!");
            return top;
        }
        int poppedElement = top.info;
        top = top.next;
        System.out.println("Popped element: " + poppedElement);
        return top;
    }

    public static void display(Node top) {
        if (top == null) {
            System.out.println("Cannot push. Stack is empty!");
            return;
        }
        System.out.print("Stack elements: [");
        while (top.next != null) {
            System.out.print(top.info + ", ");
            top = top.next;
        }
        System.out.println(top.info + "]");
    }

    private static int getElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an element to push: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;

        while (true) {
            System.out.println("\n--------MENU--------");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("--------------------");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> top = push(top);
                case 2 -> top = pop(top);
                case 3 -> display(top);
                default -> System.out.println("Wrong choice");
            }
        }
    }
}
