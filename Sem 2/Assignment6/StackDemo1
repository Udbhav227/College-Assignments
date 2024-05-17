import java.util.Scanner;

public class StackDemo1 {
    public static final int MAX = 10;

    public static int push(int[] S, int top) {
        if (isFull(top)) {
            System.out.println("Cannot push. Stack is full!");
            return top;
        }
        S[++top] = getElement();
        System.out.println("Pushed element: " +S[top]);
        return top;
    }

    public static int pop(int[] S, int top) {
        if (isEmpty(top)) {
            System.out.println("Cannot pop. Stack is empty!");
            return top;
        }
        int poppedElement = S[top--];
        System.out.println("Popped element: " + poppedElement);
        return top;
    }

    public static void display(int[] S, int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: [");
        for (int i = top; i > 0; i--) {
            System.out.print(S[i] + ", ");
        }
        System.out.println(S[0] + "]");
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static boolean isFull(int top) {
        return top == MAX - 1;
    }

    private static int getElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an element to push: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[MAX];
        int top = -1;

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
                case 1 -> top = push(stack, top);
                case 2 -> top = pop(stack, top);
                case 3 -> display(stack, top);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
