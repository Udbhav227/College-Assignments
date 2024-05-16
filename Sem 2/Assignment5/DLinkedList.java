import java.util.Scanner;

public class DLinkedList {
    private static Node start = null;
    private static Node end = null;
    static Scanner sc = new Scanner(System.in);

    public static Node create(Node start, Node end) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }
        System.out.print("Enter 0 to exit or any key to continue creation: ");
        int x = sc.nextInt();
        if (x != 0) {
            return create(start, end);
        }
        DLinkedList.start = start;
        return end;
    }

    public static Node insBeg(Node start, Node end) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = newNode;
            end = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
        return start;
    }

    public static Node insEnd(Node start, Node end) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);

        if (start == null) {
            start = newNode;
            end = newNode;
        } else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }
        
        return end;
    }

    public static Node insAny(Node start, Node end) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        if (pos == 1) {
            return insBeg(start, end);
        }

        Node newNode = new Node(regd_no, mark);
        Node curr = start;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null || curr.next == null && pos != 2) {
            System.out.println("Invalid position.");
            return start;
        }

        newNode.next = curr.next;
        if (curr.next != null) {
            curr.next.prev = newNode;
        } else {
            end = newNode;
        }
        curr.next = newNode;
        newNode.prev = curr;
        
        return start;
    }

    public static Node delBeg(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }
        Node temp = start;
        start = start.next;
        if (start != null) {
            start.prev = null;
        } else {
            end = null;
        }
        System.out.println("Deleted node: " + temp.regd_no + " " + temp.mark);
        return start;
    }

    public static Node delEnd(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }
        if (start.next == null) {
            System.out.println("Deleted node: " + start.regd_no + " " + start.mark);
            start = null;
            end = null;
            return start;
        }
        Node temp = end;
        end = end.prev;
        end.next = null;
        System.out.println("Deleted node: " + temp.regd_no + " " + temp.mark);
        return start;
    }

    public static Node delAny(Node start, Node end) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        if (pos == 1) {
            return delBeg(start, end);
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
        if (del == end) {
            end = temp;
        } else {
            temp.next = del.next;
            del.next.prev = temp;
        }
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

    public static void display(Node start, Node end) {
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
            System.out.println("----------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> end = create(start, end);
                case 2 -> display(start, end);
                case 3 -> start = insBeg(start, end);
                case 4 -> end = insEnd(start, end);
                case 5 -> start = insAny(start, end);
                case 6 -> start = delBeg(start, end);
                case 7 -> start = delEnd(start, end);
                case 8 -> start = delAny(start, end);
                case 9 -> search(start);
                default -> System.out.println("Wrong choice!");
            }
        }
    }
}
