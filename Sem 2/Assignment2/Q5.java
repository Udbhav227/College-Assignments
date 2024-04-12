class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int Eid;
    private int salary;

    Employee(String name, int age, int Eid, int salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    void empDisplay() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Eid: " + Eid);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

// Optional
class Q5 {
    public static void main(String[] args) {
        Employee e1 = new Employee("John Doe", 30, 123456, 50000);
        Employee e2 = new Employee("Jane Doe", 29, 214365, 33000);

        e1.empDisplay();
        e2.empDisplay();
    }
}

/*
 * Output:
 *      Name: John Doe
 *      Age: 30
 *      Eid: 123456
 *      Salary: 50000
 *
 *      Name: Jane Doe
 *      Age: 29
 *      Eid: 214365
 *      Salary: 33000
 */