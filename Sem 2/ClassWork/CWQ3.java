interface EmpInterface {
	void displayEmp();
	void giveBonus(double amount);
}

abstract class Employee {
	int empID;
	String fName;
	String lName;
	double salary;
	
	Employee(int empID, String fName, String lName, double salary) {
		this.empID = empID;
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
	}
}

class Manager extends Employee implements EmpInterface {
	double bonus;
	Manager(int empID, String fName, String lName, double salary, double bonus) {
		super(empID, fName, lName, salary);
		if (bonus <= 0) {
			throw new IllegalArgumentException("Bonus should be greater than 0");
		}
		this.bonus = bonus;
	}
	@Override
	void displayEmp() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void giveBonus(double amount) {
		// TODO Auto-generated method stub
		
	}
}

class Test {
	public static void main(String[] args) {
		EmpInterface[] arr = new EmpInterface[3];
		
		arr[0] = new Manager(420, "Walter ", "White ", 68000, 1000);
		// And so on..
	}
}
