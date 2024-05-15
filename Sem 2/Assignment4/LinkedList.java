import java.util.Scanner;

public class LinkedList {
    static Node start = null;
    static Scanner sc = new Scanner(System.in);

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

    public static Node InsBeg(Node start) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        newNode.next = start;
        start = newNode;
        return start;
    }

    public static Node InsEnd(Node start) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = newNode;
            return start;
        }
        Node temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return start;
    }

    public static Node InsAny(Node start) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        Node newNode = new Node(regd_no, mark);
        if (pos == 1) {
            newNode.next = start;
            start = newNode;
            return start;
        }
        Node temp = start;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position.");
            return start;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return start;
    }

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

    public static Node DelEnd(Node start) {
        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }
        if (start.next == null) {
            System.out.println("Deleted node: " + start.regd_no + " " + start.mark);
            start = null;
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

    public static void sort(Node start) {
        // TO-DO
    }

    public static int count(Node start) {
        int count = 0;
        Node temp = start;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

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
        return start;
    }

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

        sc.close();
    }

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
            System.out.println("9: Search and update mark");
            System.out.println("10: Sort");
            System.out.println("11: Count nodes");
            System.out.println("12: Reverse");
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
                case 9 -> search(start);
                case 10 -> sort(start);
                case 11 -> System.out.println("Number of nodes: " + count(start));
                case 12 -> start = reverse(start);
                default -> System.out.println("Wrong choice");
            }
        }
    }
}

// Coding this assignment was fun~
// Also write your own code `if you want to` publish it on online platforms!
// (Or at least give credits writing 250+ lines of code is no joke (T-T))
// Stop plagiarism! Bye! :D
