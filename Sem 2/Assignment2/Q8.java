// Package Structure:

// Package1
//    ├── Student.java (Super class)
//    └── Test.java (Inherited class)
//
// Package2
//    └── Sports.java (Interface)
//    └── Result.java

package Package1;

import java.util.Scanner;

public class Student {
    protected String name;
    protected int roll;

     public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
    }

    public void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + roll);
    }
}

package Package1;

import java.util.Scanner;

public class Test extends Student {
    public double mark1;
    public double mark2;

    public void inputDetails() {
        super.inputDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        mark1 = scanner.nextInt();
        System.out.print("Enter mark 2: ");
        mark2 = scanner.nextInt();
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}

package Package2;
import Package1.*;

interface Sports {
    double score1 = 67.20;
    double score2 = 98.99;
}

public class Result extends Test implements Sports {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.inputDetails();
        t1.showDetails();
        double grandTotal = t1.mark1 + t1.mark2 + Sports.score1 + Sports.score2;
        System.out.println("Grand Total Mark: " + grandTotal);
    }
}
