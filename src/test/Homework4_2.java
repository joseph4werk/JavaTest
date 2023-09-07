package test;

import java.util.Scanner;

public class Homework4_2 {

	public static void main(String[] args) {

//	 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	 表如下:

//	 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	 員工編號: 25 19 27 共 3 人!」

		int[][] colleagues = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		Scanner scanner = new Scanner(System.in);
		System.out.println("要借多少？");
		int countColleagues = 0;
		if (scanner.hasNextInt()) {
			int lendingAmount = scanner.nextInt();
			System.out.print("有錢可借的員工編號: ");
			for (int i = 0; i < colleagues.length; i++) {
				if (lendingAmount >= colleagues[i][1]) {
					countColleagues++;
					System.out.print(colleagues[i][0] + " ");
				}
			}
			System.out.print("共" + countColleagues + "人!");
		}
		scanner.close();
	}
}
