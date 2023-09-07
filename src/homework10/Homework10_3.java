package homework10;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Homework10_3 {
	public static void main(String[] args) throws Exception{
		String regex1 = "^\\d{8}$";
		String regex2 = "^[1-3]?$";
		Scanner scanner = new Scanner(System.in);
		String input;
		String formalizeNumber;

		System.out.println("請輸入日期(年月日，例如:20110131)：");
		
		//  驗證input格式
		while (!(input = scanner.nextLine()).matches(regex1)) {
			System.out.println("日期格式不正確，請再輸入一次！");
			System.out.println("請輸入日期，例如:20110131");
		}
		
		Date date = new SimpleDateFormat("yyyyMMdd").parse(input);  // 將input轉型成Date格式，記得要throws
		
		System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年");
		
		// 驗證要格式化的文字是否為1-3
		while (!(formalizeNumber = scanner.nextLine()).matches(regex2)) {
			System.out.println("請輸入1-3的數字");
		}
		switch (formalizeNumber) {
		case "1": {
			Format f1 = new SimpleDateFormat("yyyy/MM/dd");
			System.out.println("(1)千分位為：" + f1.format(date));
			break;
		}
		case "2": {
			Format f2 = new SimpleDateFormat("MM/dd/yyyy");
			System.out.println("(2)百分比為：" + f2.format(date));
			break;
		}
		case "3": {
			Format f3 = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("(3)科學記號數字：" + f3.format(date));
			break;
		}
		default: {
			System.out.println("過不來8...");  // 寫爽
		}
		}
	}
}
