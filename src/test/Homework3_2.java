package test;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args) {
//        請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：

//		scanner input number
		int input;
//		randomly generate number from 0-9
		int randomNumber = (int) (Math.random() * 9);
		Scanner scanner = new Scanner(System.in);
		System.out.print("開始猜數字吧！");
		System.out.println();
//		not sure looping times
		while (scanner.hasNextInt()) {
			input = scanner.nextInt();
			if (input >= 0 && input <= 9) {
				if (input != randomNumber) {
					System.out.println("猜錯囉");
				} else {
					System.out.println("答對了！答案就是" + input);
					break;
				}
			} else
				System.out.println("請輸入0~9整數");
		}

//        extended-function：generate logical test. Testing key-in number is greater/less than the ANSWER
		int input1;
		int randomNumber1 = (int) (Math.random() * 101);
		System.out.println(("開始猜0~100的數字!"));
		while (true) {
			Scanner scanner1 = new Scanner(System.in);
			if (scanner1.hasNextInt()) {
				input1 = scanner1.nextInt();
				if (input1 > 0 && input1 <= 100) {
					if (input1 == randomNumber1) {
						System.out.println("太牛逼了吧，恭喜答對！答案是" + input1);
						break;
					} else if (input1 > randomNumber1) {
						System.out.println("猜太大了 別太衝");
					} else {
						System.out.println("猜大一點==");
					}
				} else
					System.out.println("請輸入0~100整數");
			}
		} 
	}
}
