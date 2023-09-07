package test;

public class HW1 {
	public static void main(String[] args) {

//		請設計一隻Java程式,計算12,6這兩個數值的和與積
		int sum = 12 + 6;
		int total = 12 * 6;
		System.out.println("number = 12 & 6\nsum = " + sum + ", total = " + total);

		System.out.println("*******************************");
//		請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int dozen = 200 / 12;
		int mod = 200 % 12;
		System.out.println("200顆蛋是" + dozen + "打又" + mod + "顆");

		System.out.println("*******************************");
//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalSec = 256559;
		int days = totalSec / (60 * 60 * 24);
		int hours = (totalSec / 60 / 60) % 24;
		int minutes = (totalSec / 60) % 60;
		int seconds = totalSec % 60;

		System.out.println(totalSec + "秒 = " + days + "天" + hours + "小時" + minutes + "分" + seconds + "秒");

		System.out.println("*******************************");
//		請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int r = 5;
		System.out.println("面積為" + (r * r * PI) + ", 圓周長為" + (5 * 2 * PI));

		System.out.println("*******************************");
//		某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		int saving = 1500000;
		double rates = 0.02;
		double years = 10;
		double savingsResult = saving * (Math.pow(1 + rates, years));

		System.out.println("150萬元存10年後會漲到" + savingsResult / 10000 + "萬");

		System.out.println("*******************************");

//		• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//			5 + 5
//			5 + ‘5’
//			5 + “5”
//			並請用註解各別說明答案的產生原因

		System.out.println(5 + 5); // 整數相加

		System.out.println(5 + '5'); // 單引號中的'5' unicode為53，相加後為58
		System.out.println(5 + "5"); // 字串相加5&5=55

	}

}
