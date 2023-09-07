package xxx;

public class PartTimeEmployeePoly extends EmployeePoly {
	 private double hourPay; //時薪
     private int workHour;   //工作時數 

     public void display() {
       super.display();
       System.out.println("hour pay=" + hourPay);
       System.out.println("work hour=" + workHour);
     }


     public PartTimeEmployeePoly(int empno , String ename , double hourPay, int workHour) {
          super(empno, ename);
          this.hourPay = hourPay;
          this.workHour = workHour;
     }

     //add
     public double getSalary() {
          return hourPay * workHour;
     }
}
