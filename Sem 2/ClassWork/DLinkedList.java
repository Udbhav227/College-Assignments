public class dLink {
    int info;
    dLink next;
    dLink prev;

    public dLink() {
    }

    public dLink(int x) {
        info = x;
        next = null;
        prev = null;
    }
}

public class DLinkedList {
    static dLink start = new dLink();
    static Scanner sc = new Scanner(System.in);

    public static void create(dLink node) {
        System.out.print("Enter value: ");
        node.info = sc.nextInt();
        System.out.print("Enter 0 to stop enter any other key to continue: ");
        int x = sc.nextInt();
        while (x != 0) {
            System.out.print("Enter value: ");
            dLink temp = new dLink(sc.nextInt());
            node.next = temp;
            temp.prev = node;
            node = temp;
            System.out.print("Enter 0 to stop enter any other key to continue: ");
            x = sc.nextInt();
        }
        System.out.println();
    }

    public static void insertBeg(dLink node) {
        System.out.print("Enter value: ");
        dLink temp = new dLink(sc.nextInt());
        temp.next = node;
        node.prev = temp;
        start = temp;
    }

    public static void insertEnd(dLink node) {
        System.out.print("Enter value: ");
        dLink temp = new dLink(sc.nextInt());
        while (node.next != null) {
            node = node.next;
        }
        node.next = temp;
        temp.prev = node;
    }

    public static void insertAt(dLink node) {
        System.out.print("Enter value: ");
        dLink temp = new dLink(sc.nextInt());
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        if (pos == 1) {
            temp.next = node;
            node.prev = temp;
            start = temp;
        } else {
            for (int i = 1; i < pos - 1; i++) {
                node = node.next;
            }
            node.next.prev = temp;
            temp.next = node.next;
            node.next = temp;
            temp.prev = node;
        }
    }

    public static void display(dLink node) {
        while (node != null) {
            System.out.print(node.info + " <-> ");
            node = node.next;
        }
        System.out.println("null\n");
    }

    public static void deleteBeg(dLink node) {
        start = node.next;
        node.prev = null;
    }

    public static void deleteEnd(dLink node) {
        while(node.next.next != null) {
            node = node.next;
        }
        node.next = null;
    }

    public static void deleteAt(dLink node) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        for (int i = 1; i < pos - 1; i++) {
            node = node.next;
        }
    }

    public static void main(String[] args) {
        start = new dLink();
        create(start);
        display(start);
        deleteBeg(start);
        display(start);
    }
}
