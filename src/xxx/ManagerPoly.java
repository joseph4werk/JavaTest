package xxx;

public class ManagerPoly extends FullTimeEmployeePoly {
	private double bonus; // 獎金; 額外津貼; 特別補助

	public void display() {
		super.display();
		System.out.println("額外津貼=" + bonus);
	}

	public ManagerPoly(int empno, String ename, double monthlySalary, double bonus) {
		super(empno, ename, monthlySalary);
		this.bonus = bonus;
	}

	// add
	public double getSalary() {
		double monthlySalary = super.getSalary();
		return monthlySalary + bonus;
	}
}
