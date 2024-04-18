class Student {
    String name;
    int mark;

    Student(String name, int mark) throws MarksOutOfBoundException {
        this.name = name;
        setMark(mark);
    }

    void setMark(int mark) throws MarksOutOfBoundException {
        if (mark > 100) {
            throw new MarksOutOfBoundException("Mark must be less than 100.");
        }
        this.mark = mark;
    }
}

class MarksOutOfBoundException extends Exception {
    MarksOutOfBoundException(String message) {
        super(message);
    }
}

public class Q03 {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("John Doe", 85);
            System.out.println("Student Name: " + student1.name);
            System.out.println("Student Mark: " + student1.mark);

            Student student2 = new Student("Jane Doe", 120);
            System.out.println("Student Name: " + student2.name);
            System.out.println("Student Mark: " + student2.mark);
        } catch (MarksOutOfBoundException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
 *  Output:
 *      Student Name: John Doe
 *      Student Mark: 85
 *      Error: MarksOutOfBoundException: Mark must be less than 100.
 */
