package xxx;

public class FullTimeEmployeePoly extends EmployeePoly {
	private double monthlySalary; // 月薪

	public void display() {
		super.display();
		System.out.println("月薪=" + monthlySalary);
	}

	public FullTimeEmployeePoly(int empno, String ename, double monthlySalary) {
		super(empno, ename);
		this.monthlySalary = monthlySalary;
	}

	// add
	public double getSalary() {
		return monthlySalary;
	}
}
