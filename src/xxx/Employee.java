package xxx;

public class Employee { // extends Object
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

	public Employee(int empno, String ename) {
		super();  // java預設加入隱形的super()建構子-->super from Object Class.
		this.empno = empno;
		this.ename = ename;
	}

	public Employee(int empno) {
//		無法加入super(); 因此處會呼叫回public Employee(int empno, String ename)建構子，該方法java已預設建立super from Object的呼叫父類別建構子
		this(empno, "-");
	}

	public Employee(String ename) {
		this(0, ename);
	}

	public Employee() {
	}

	public void display() {
		System.out.println("empno = " + empno);
		System.out.println("ename = " + ename);
	}
}
