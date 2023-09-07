package xxx;

import java.util.Scanner;

public class RegexTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String tel = sc.next();
//		
//		String regex = "^09\\d\\d-[0-9]{6}$";
//		
//		if(tel.matches(regex)) {
//			System.out.println("OK");
//		}else {
//			System.out.println("No good...");
//		}
		
		String idNumber = sc.next();
		String regex = "^[A-Za-z]{1}[12]\\d{8}";
		
		if(idNumber.toUpperCase().matches(regex)) {
			System.out.println("OK");
		}else {
			System.out.println("No good...");
		}
	}
}
