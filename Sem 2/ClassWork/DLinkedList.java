import java.util.Scanner;

class dlink {
    int info;
    dlink next;
    dlink prev;
}

public class DLinkedList {
    static dlink start = null;
    static Scanner sc = new Scanner(System.in);
    public static void create(dlink node) {
        System.out.print("Enter value: ");
        node.info = sc.nextInt();
        node.next = null;
        node.prev = null;
        System.out.print("Press 0 to exit any other key to continue: ");
        int x = sc.nextInt();
        while (x != 0) {
            dlink curr = new dlink();
            System.out.print("Enter value: ");
            curr.info = sc.nextInt();
            node.next = curr;
            curr.prev = node;
            node = curr;
            System.out.print("Press 0 to exit any other key to continue: ");
            x = sc.nextInt();
        }
    }

    public static void display(dlink node) {
        System.out.print("In forward: ");
        dlink temp = new dlink();
        while (node != null) {
            System.out.print(node.info + " <-> ");
            temp = node;
            node = node.next;
        }
        System.out.print("null\nIn reverse: ");
        node = temp;
        while (node != null) {
            System.out.print(node.info + " <-> ");
            node = node.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
       dlink node = new dlink();
       start = node;
       create(start);
       display(start);
    }
}

/*
OUTPUT:
    Enter value: 11
    Press 0 to exit any other key to continue: 1
    Enter value: 12
    Press 0 to exit any other key to continue: 1
    Enter value: 13
    Press 0 to exit any other key to continue: 1
    Enter value: 14
    Press 0 to exit any other key to continue: 1
    Enter value: 15
    Press 0 to exit any other key to continue: 0
    In forward: 11 <-> 12 <-> 13 <-> 14 <-> 15 <-> null
    In reverse: 15 <-> 14 <-> 13 <-> 12 <-> 11 <-> null
 */
