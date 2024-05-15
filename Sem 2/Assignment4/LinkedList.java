import java.util.Scanner;

public class LinkedList {
    private static Node start = null;
    static Scanner sc = new Scanner(System.in);

    // Creation
    public static void create(Node start) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        start = new Node(regd_no, mark);
        Node temp = start;
        System.out.print("Enter 0 to exit or any key to continue creation: ");
        int x = sc.nextInt();
        while (x != 0) {
            System.out.print("Enter registration number: ");
            regd_no = sc.nextInt();
            System.out.print("Enter mark: ");
            mark = sc.nextFloat();
            Node newNode = new Node(regd_no, mark);
            temp.next = newNode;
            temp = newNode;
            System.out.print("Enter 0 to exit or any key to continue creation: ");
            x = sc.nextInt();
        }
        LinkedList.start = start;
    }

    // a) i. Insertion at the beginning of the list
    public static Node InsBeg(Node start) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        newNode.next = start;
        start = newNode;
        LinkedList.start = start;
        return start;
    }

    // a) ii. Insertion at the end of the list
    public static Node InsEnd(Node start) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = newNode;
            LinkedList.start = start;
            return start;
        }
        Node temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return start;
    }

    // a) iii. Insertion at any point in the list
    public static Node InsAny(Node start) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        Node newNode = new Node(regd_no, mark);
        Node curr = start;

        if (pos == 1) {
            return InsBeg(start);
        } else {
            for (int i = 1; i < pos - 1 && curr != null; i++) {
                curr = curr.next;
            }
            if (curr == null) {
                System.out.println("Invalid position.");
                return start;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
        return start;
    }

    // b) i. Deletion from the beginning of the list
    public static Node DelBeg(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }
        Node temp = start;
        start = start.next;
        System.out.println("Deleted node: " + temp.regd_no + " " + temp.mark);
        return start;
    }

    // b) ii. Deletion from the end of the list
    public static Node DelEnd(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }
        if (start.next == null) {
            System.out.println("Deleted node: " + start.regd_no + " " + start.mark);
            start = null;
            LinkedList.start = start;
            return start;
        }
        Node temp = start;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node last = temp.next;
        temp.next = null;
        System.out.println("Deleted node: " + last.regd_no + " " + last.mark);
        return start;
    }

    // b) iii. Deletion from any position in the list
    public static Node DelAny(Node start) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        if (pos == 1) {
            if (start == null) {
                System.out.println("List is empty.");
                return start;
            }
            Node temp = start;
            start = start.next;
            System.out.println("Deleted node: " + temp.regd_no + " " + temp.mark);
            return start;
        }
        Node temp = start;
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid position");
                return start;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Invalid position");
            return start;
        }
        Node del = temp.next;
        temp.next = temp.next.next;
        System.out.println("Deleted node: " + del.regd_no + " " + del.mark);
        return start;
    }

    // b) iv. Deletion based on student registration number
    public static Node DelByRegdNo(Node start) {
        System.out.print("Enter registration number to delete: ");
        int regd_no = sc.nextInt();
        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }
        if (start.regd_no == regd_no) {
            start = start.next;
            System.out.println("Deleted node with regd_no: " + regd_no);
            LinkedList.start = start;
            return start;
        }
        Node temp = start;
        while (temp.next != null && temp.next.regd_no != regd_no) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Registration number not found.");
            return start;
        }
        temp.next = temp.next.next;
        System.out.println("Deleted node with regd_no: " + regd_no);
        return start;
    }

    // c) Search and update marks based on student registration number
    public static void search(Node start) {
        System.out.print("Enter registration number to search: ");
        int regd_no = sc.nextInt();
        Node temp = start;
        while (temp != null) {
            if (temp.regd_no == regd_no) {
                System.out.print("Enter new mark: ");
                temp.mark = sc.nextFloat();
                System.out.println("Mark updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Error: Registration number not found.");
    }

    // d) Sort nodes according to marks (Higher to lower)
    public static void sort(Node start) {
        // TO-DO
    }

    // e) Count number of nodes present in the list
    public static int count(Node start) {
        int count = 0;
        Node temp = start;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // f) Reverse the linked list
    public static Node reverse(Node start) {
        Node prev = null;
        Node curr = start;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        start = prev;
        LinkedList.start = start;
        return start;
    }

    // h) Display all the nodes in the list
    public static void display(Node start) {
        Node temp = start;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("Regd no. \tMark");
        while (temp != null) {
            System.out.println(temp.regd_no + "\t\t" + temp.mark);
            temp = temp.next;
        }

    }

    // main method
    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("------------MENU------------");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at beginning");
            System.out.println("4: Insert at end");
            System.out.println("5: Insert at any position");
            System.out.println("6: Delete from beginning");
            System.out.println("7: Delete from end");
            System.out.println("8: Delete from any position");
            System.out.println("9: Delete by registration number");
            System.out.println("10: Search and update mark");
            System.out.println("11: Sort");
            System.out.println("12: Count nodes");
            System.out.println("13: Reverse");
            System.out.println("----------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> create(start);
                case 2 -> display(start);
                case 3 -> start = InsBeg(start);
                case 4 -> start = InsEnd(start);
                case 5 -> start = InsAny(start);
                case 6 -> start = DelBeg(start);
                case 7 -> start = DelEnd(start);
                case 8 -> start = DelAny(start);
                case 9 -> start = DelByRegdNo(start);
                case 10 -> search(start);
                case 11 -> sort(start);
                case 12 -> System.out.println("Number of nodes: " + count(start));
                case 13 -> start = reverse(start);
                default -> System.out.println("Wrong choice");
            }
        }
    }
}

// Coding this assignment was fun (and pain at same time)~
// Also write your own code 'if you want to' publish it on online platforms!
// (Or at least give credits writing 300+ lines of code is no joke (T-T))
// Stop plagiarism! Bye! :D
