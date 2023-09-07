package test;

import java.util.Arrays;

public class Homework4_1 {

	public static void main(String[] args) {
//		Quiz1
//		有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示：陣列，length屬性)

		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int total = 0;
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		int avg = total /= array.length;
		System.out.println("平均數是" + avg);
//		binarySearch for the 'index' of the average number in array
		int searchNumber = -(Arrays.binarySearch(array, avg)) - 1;
		System.out.print("大於平均數的值有" + " ");
		for (int i = searchNumber; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n" + "==========================================");

//		Quiz2
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
//		(提示：String方法，陣列

		String s = "Hello World";
		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		System.out.println("\n" + "==========================================");

//		有個字串陣列如下 (八大行星)：
//		{“mercury", “venus", “earth", “mars", “jupiter", “saturn", “uranus", “neptune"}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//		(提示：字元比對，String方法)

		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//		兩個迴圈 第一個計陣列長度，並將字串陣列轉成Char陣列
//		第二個看字串陣列大小，
		int countVowels = 0;
		for (int i = 0; i < planet.length; i++) {
			for (int j = 0; j < planet[i].length(); j++) {
				switch (planet[i].charAt(j)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					countVowels++;
					break;
				default:
					break;
				}
			}
		}
		System.out.print(countVowels);
		System.out.println("\n" + "==========================================");
		
		
		
		
//		for (int i = 0; i < planet.length; i++) {
//			char[] charPlanetArray = planet[i].toCharArray();
//			for (int j = 0; j < charPlanetArray.length; j++) {
//				switch(charPlanetArray[j]){
//				case 'a':
//					countVows++;
//					break;
//					}
//			}
//
//		}
	}
}
