public class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;

    Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        next = null;
        prev = null;
    }
}