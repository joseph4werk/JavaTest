package xxx;

public class SalaryTest {

	public static void main(String[] args) {
		FullTimeEmployee tin = new FullTimeEmployee(2001, "Tin", 100000);
		Manager lawrence = new Manager(101, "Lawrence", 200000, 50000);
		FullTimeEmployee joseph = new FullTimeEmployee(2002, "Joseph", 60000);
		
		System.out.println(tin.getFullTimeSalary());
		System.out.println(lawrence.getManagerSalary());
		System.out.println(joseph.getFullTimeSalary());
	}
}
