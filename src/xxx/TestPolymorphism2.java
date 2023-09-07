package xxx;

public class TestPolymorphism2 {
	
	public static void main(String[] args) {
		EmployeePoly[] e = new EmployeePoly[3]; // 宣告員工陣列,準備置入員工3人
		
		e[0] = new FullTimeEmployeePoly(7002, "peter", 40000.0);
		e[1] = new ManagerPoly(7003, "merry", 50000.0, 10000.0);
		e[2] = new PartTimeEmployeePoly(7004, "John", 1000.0, 8);
		
		for (int i = 0; i < e.length; i++)
			System.out.println(e[i].getSalary());

//      instanceof測試 
//		for (int i = 0; i < e.length; i++)
//			if (e[i] instanceof FullTimeEmployeePoly) // EmployeePoly , FullTimeEmployeePoly , ManagerPoly ,
//				System.out.println("yes");
//			else
//				System.out.println("no");

//      另外第二種寫法
//		EmployeePoly[] e = new EmployeePoly[3];
//		EmployeePoly e0 = new FullTimeEmployeePoly(7002, "peter", 40000.0);
//		EmployeePoly e1 = new ManagerPoly(7003, "merry", 50000.0, 10000.0);
//		EmployeePoly e2 = new PartTimeEmployeePoly(7004, "John", 1000.0, 8);
//		e[0] = e0;
//		e[1] = e1;
//		e[2] = e2;
//		for (int i = 0; i < e.length; i++)
//			System.out.println(e[i].getSalary());

//      再另第三種寫法
//		EmployeePoly[] e = new EmployeePoly[3];
//		FullTimeEmployeePoly e0 = new FullTimeEmployeePoly(7002, "peter", 40000.0);
//		ManagerPoly e1 = new ManagerPoly(7003, "merry", 50000.0, 10000.0);
//		PartTimeEmployeePoly e2 = new PartTimeEmployeePoly(7004, "John", 1000.0, 8);
//		e[0] = e0;
//		e[1] = e1;
//		e[2] = e2;
//		for (int i = 0; i < e.length; i++)
//			System.out.println(e[i].getSalary());
	}
}
