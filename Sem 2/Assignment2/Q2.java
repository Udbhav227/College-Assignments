public class Complex {
    int real;
    int imag;

    void setData(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public Complex add(Complex z1, Complex z2) {
        Complex sum = new Complex();
        sum.real = z1.real + z2.real;
        sum.imag = z1.imag + z2.imag;
        return sum;
    }
}


public class Q2 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.setData(3, 5);

        Complex c2 = new Complex();
        c2.setData(6, 2);

        System.out.print("First number: ");
        c1.display();
        System.out.print("Second number: ");
        c2.display();

        Complex sum = c1.add(c1, c2);
        System.out.print("Sum : ");
        sum.display();
    }
}

/*
 * Output:
 *      First number: 3 + 5i
 *      Second number: 6 + 2i
 *      Sum = 9 + 7i
 */
