
class Student {
	String name;
	long regdNo;
	double cgpa;
	
	void setData(String name, long regdNo, double cgpa) {
		this.name = name;
		this.regdNo = regdNo;
		this.cgpa = cgpa;
	}
	
	void displayData() {
		System.out.println("Name : " + name + "\nRedg No : " + regdNo + "\nCGPA : " + cgpa);
	}
	
	void hallTicket() {
		if (cgpa >= 7.5) {
			System.out.println(name + " is eligible to sit in the campus recruitment process.");
		} else {
			System.out.println("Padhaayi pr dhyaan de");
		}
	}
}

public class CWQ1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setData("Rohit", 2341001145L, 7.8);
		s1.displayData();
		s1.hallTicket();
		
		System.out.println();
		
		Student s2 = new Student();
		s2.setData("Virat", 2341001118L, 7.45);
		s2.displayData();
		s2.hallTicket();
		
	}

}