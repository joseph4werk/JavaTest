package homework10;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Homework10_2 {
	public static void main(String[] args) {
		String regex1 = "^[+-]?\\d*[.]?\\d*$";
		String regex2 = "^[1-3]?$";
		Scanner scanner = new Scanner(System.in);
		String input;
		String formalizeNumber;

		System.out.println("請輸入數字：");
		
		//  驗證input格式
		while (!(input = scanner.nextLine()).matches(regex1)) {
			System.out.println("輸入格式不正確，請再輸入一次！");
			System.out.println("請輸入數字：");
		}
		
		BigDecimal bd = new BigDecimal(input);  // 將input轉型成BigDecimal以提供format.match
		
		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
		
		// 驗證要格式化的文字是否為1-3
		while (!(formalizeNumber = scanner.nextLine()).matches(regex2)) {
			System.out.println("請輸入1-3的數字");
		}
		switch (formalizeNumber) {
		case "1": {
			Format f1 = new DecimalFormat("#,##0.##");
			System.out.println("(1)千分位為：" + f1.format(bd));
			break;
		}
		case "2": {
			Format f2 = new DecimalFormat("0%");
			System.out.println("(2)百分比為：" + f2.format(bd));
			break;
		}
		case "3": {
			Format f3 = new DecimalFormat("0.###E0");
			System.out.println("(3)科學記號數字：" + f3.format(bd));
			break;
		}
		default: {
			System.out.println("過不來8...");  // 寫爽
		}
		}
	}
}
