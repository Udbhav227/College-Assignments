import java.util.Scanner;

class Complex {
	int real;
	int imag;
	
	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real and imaginary value: ");
		real = sc.nextInt();
		imag = sc.nextInt();
	}
	
	void displayData() {
		System.out.println(real + " + " + imag + "i");
	}
	
}

public class CWQ2 {
	public static void main(String[] args) {
		Complex z1 = new Complex();
		z1.setData();
		
		Complex z2 = new Complex();
		z2.setData();
		
		Complex sum = new Complex();
		sum.real = z1.real + z2.real;
		sum.imag = z1.imag + z2.imag;
		
		System.out.print("First number: ");
		z1.displayData();
		System.out.print("Second number: ");
		z2.displayData();
	}
}