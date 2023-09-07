package homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Caculator c1 = new Caculator();
		while (true) {
			Scanner scanner = new Scanner(System.in);
			try {
				System.out.println("請輸入x的值");
				int x = scanner.nextInt();
				System.out.println("請輸入y的值");
				int y = scanner.nextInt();
				System.out.println(x + "的" + y + "次方等於" + c1.powerXY(x, y));
				break;
			} catch (CalException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");
			}
		}
	}
}
