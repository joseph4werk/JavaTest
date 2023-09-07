package test;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_1 {
	public static void main(String[] args) {

//        第一題-三角形
//		Homework3_1 hw3 = new Homework3_1();
		int[] input = new int[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入三個整數: ");

		if (scanner.hasNextInt()) {
			for (int i = 0; i < input.length; i++) {
				input[i] = scanner.nextInt();
			}
			Arrays.sort(input);

			if (input[0] + input[1] <= input[2]) {
				printArray(input);
				System.out.println("不是三角形");
			} else if (Math.pow(input[0], 2) + Math.pow(input[1], 2) == Math.pow(input[2], 2)) { // extension for 直角三角形
				printArray(input);
				System.out.println("直角三角形");
			} else if (input[0] == input[1] || input[1] == input[2]) {
				if (input[0] == input[2]) {
					printArray(input);
					System.out.println("正三角形");
				} else {
					printArray(input);
					System.out.println("等腰三角形");
				}
			} else {
				printArray(input);
				System.out.println("其它三角形");
			}
		}
		scanner.close();
	}

//	print array method
	public static void printArray(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}