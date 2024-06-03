package Stack;

public class ArrayStack {
    public static int MAX = 5;
    public static int TOP = -1;
    public static int[] S =  new int[MAX];

    public static void push(int x) {
        if (TOP == MAX - 1) {
            System.out.println("Overflow");
        } else {
            S[++TOP] = x;
        }
    }

    public static void pop() {
        if (TOP == -1) {
            System.out.println("Underflow");
        } else {
            TOP--;
        }
    }

    public static void display() {
        if (TOP == -1) {
            System.out.println("Underflow");
        } else {
            for (int i = TOP; i >= 0; i--) {
                System.out.println(S[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
      ArrayStack stack = new ArrayStack();
      // TO-DO
    }
}
