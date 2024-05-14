import java.util.Scanner;

public class LinkedList {
    public static class Node {
        protected int regdNo;
        protected float marks;
        protected Node next;
    }

    public static void create(Node start) {
        Scanner sc = new Scanner(System.in);

        Node curr = start;

        do {
            Node newNode = new Node();
            System.out.print("Enter registration number: ");
            newNode.regdNo = sc.nextInt();

            System.out.print("\nEnter marks: ");
            newNode.marks = sc.nextFloat();


            if (start == null) {
                start = newNode;
            } else {
                curr.next = newNode;
            }
            curr = newNode;

            System.out.println("Press 0 to exit or any other key to continue: ");
        } while (sc.nextInt() != 0);

        sc.close();
    }

    // a) i. Insertion at the beginning

    public static Node InsBeg(Node start) {
        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();

        System.out.print("Enter registration number: ");
        newNode.regdNo = sc.nextInt();

        System.out.print("\nEnter marks: ");
        newNode.marks = sc.nextFloat();

        newNode.next = start;
        start = newNode;

        return start;
    }

    // a) ii. Insertion at the end
    public static Node insEnd(Node start) {
        Node curr = start;

        while (curr.next != null) {
            curr = curr.next;
        }

        Scanner sc = new Scanner(System.in);
        Node newNode = new Node();

        System.out.print("Enter registration number: ");
        newNode.regdNo = sc.nextInt();

        System.out.print("\nEnter marks: ");
        newNode.marks = sc.nextFloat();

        curr.next = newNode;

        return start;
    }

    // a) iii. Insertion at any position
    public static Node InsAny(Node start) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the position: ");
        int position = sc.nextInt();

        Node newNode = new Node();

        System.out.print("\nEnter registration number: ");
        newNode.regdNo = sc.nextInt();

        System.out.print("\nEnter marks: ");
        newNode.marks = sc.nextFloat();

        if (position == 1) {
            newNode.next = start;
            return newNode;
        } else {
            Node prev = start;
            for (int i = 1; i < position - 1 && prev != null; i++) {
                prev = prev.next;
            }
            if (prev == null) {
                System.out.println("Invalid position.");
                return start;
            }
            newNode.next = prev.next;
            prev.next = newNode;
            return start;
        }
    }

    // b) i. Deletion from the beginning
    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return null;
        }
        return start.next;
    }

    // b) ii. Deletion from the end
    public static Node DelEnd(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return null;
        }
        if (start.next == null) {
            return null;
        }
        Node curr = start;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return start;
    }

    // b) iii. Deletion from any position
    public static Node DelAny(Node start) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the position: ");
        int position = sc.nextInt();

        if (start == null) {
            System.out.println("List is empty.");
            return null;
        }
        if (position == 1) {
            return start.next;
        } else {
            Node prev = start;
            for (int i = 1; i < position - 1 && prev != null; i++) {
                prev = prev.next;
            }
            if (prev == null || prev.next == null) {
                System.out.println("Invalid position.");
                return start;
            }
            prev.next = prev.next.next;
            return start;
        }
    }

    // b) iii. Deletion by registration number
    public static Node DelByRegdNo(Node start) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter registration number: ");
        int regdNo = sc.nextInt();

        if (start == null) {
            System.out.println("List is empty.");
            return null;
        }

        if (start.regdNo == regdNo) {
            return start.next;
        }

        Node prev = start;
        Node curr = start.next;

        while (curr != null) {
            if (curr.regdNo == regdNo) {
                prev.next = curr.next;
                return start;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Node with registration number " + regdNo + " not found.");
        return start;
    }

}
