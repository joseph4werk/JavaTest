package xxx;

public abstract class EmployeePoly {
	private int empno;
	private String ename;

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public EmployeePoly(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public EmployeePoly(int empno) {
		this(empno, "-");
	}

	public EmployeePoly(String ename) {
		this(0, ename);
	}

	public EmployeePoly() {
		this(0, "-"); // 或 empno = 0; ename = "-";
	}

	public void display() {
		System.out.println("empno=" + empno);
		System.out.println("ename=" + ename);
	}

	// 新增getSalary方法
	public abstract double getSalary();
}
