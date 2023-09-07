package xxx;

public class Manager extends FullTimeEmployee {
	private double bonus; // 獎金; 額外津貼; 特別補助

	public void display() {
		super.display();
		System.out.println("額外津貼 = " + bonus);
	}

	public Manager(int empno, String ename, double monthlySalary, double bonus) {
		super(empno, ename, monthlySalary);
		this.bonus = bonus;
	}
	
	public double getManagerSalary() {
		return getFullTimeSalary() + bonus;
	}
}
