import java.util.Scanner;

class Person {
    String name;
    int age;

    void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p1 = new Person();
        p1.name = "Rohan";
        p1.age = 20;

        Person p2 = new Person();
        System.out.print("Enter your name: ");
        String yourName = sc.nextLine();
        System.out.print("Enter your age: ");
        int yourAge = sc.nextInt();
        p2.setData(yourName, yourAge);

        p1.displayData();
        p2.displayData();

        if (p1.age < p2.age) {
            System.out.println(p1.name + " is younger than " + p2.name);
        } else if (p1.age > p2.age) {
            System.out.println(p1.name + " is younger than " + p1.name);
        } else {
            System.out.println("Both persons are of the same age.");
        }

        sc.close();
    }
}

/*
 *  Output:
 *      Enter your name: Akaay
 *      Enter your age: 19
 *      Name: Rohan
 *      Age: 20
 *      Name: Akaay
 *      Age: 19
 *      Rohan is younger than Rohan
 */
