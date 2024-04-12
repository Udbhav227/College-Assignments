interface DetailInfo {
    void display();
    void count();
}

class Person implements DetailInfo {
    static int maxCount;
    private String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        count();
        System.out.println("Name: " + name);
        System.out.println("Number of characters: " + maxCount);
    }

    @Override
    public void count() {
        maxCount = name.length();
    }
}

class Q7 {
    public static void main(String[] args) {
        Person p1 = new Person("Saitama");
        p1.display();
    }
}

/*
 *  Output:
 *      Name: Saitama
 *      Number of characters: 7
 */