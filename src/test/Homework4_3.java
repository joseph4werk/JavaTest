package test;

import java.util.Scanner;

public class Homework4_3 {

	public static void main(String[] args) {
//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(提示1：Scanner，陣列)
//		(提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

		int daysOfMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] input = new int[3];
		int daySum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入年月日！(範例: 1997 8 18): ");

		if (scanner.hasNextInt()) {
//			把輸入丟入陣列
			for (int i = 0; i < input.length; i++) {
				input[i] = scanner.nextInt();
			}
//			如果是閏年，把陣列的2月天數改為29天；如果不是，陣列維持原樣
			if (input[0] % 4 == 0 && input[0] % 100 != 0 || input[0] % 400 == 0)
				daysOfMonth[1] = 29;
//			j-1為月份的索引值，用來搜尋daysOfMonth陣列中的月份日期，以利daySum加總
			for (int j = 0; j < input[1] - 1; j++) {
				daySum += daysOfMonth[j];
			}
			System.out.println("輸入的日期為該年第" + (daySum + input[2]) + "天");
		}
	}
}
