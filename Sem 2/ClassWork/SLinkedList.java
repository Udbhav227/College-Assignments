import java.util.Scanner;

class link {
    int info;
    link next;
}

public class SLinkedList {
    static link start = null;
    static Scanner sc = new Scanner(System.in);
    public static void create(link node) {
        System.out.print("Enter value: ");
        node.info = sc.nextInt();
        node.next = null;
        System.out.print("Press 0 to exit any other key to continue: ");
        int x = sc.nextInt();
        while (x != 0) {
            link curr = new link();
            System.out.print("Enter value: ");
            curr.info = sc.nextInt();
            curr.next = null;
            node.next = curr;
            node = curr;
            System.out.print("Press 0 to exit any other key to continue: ");
            x = sc.nextInt();
        }
        System.out.println();
    }

    public static void display(link node) {
        while (node != null) {
            System.out.print(node.info + " --> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        link node = new link();
        start = node;
        create(start);
        display(start);
    }
}
