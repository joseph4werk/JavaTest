package test;

import java.util.Scanner;

public class Homework3_3 {
	public static void main(String[] args) {
//        阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//        厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//        的號碼與總數，如圖：

		int[] arr = new int[50];
		int input;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？");
		if (scanner.hasNextInt()) {
			input = scanner.nextInt();
			
			for (int j = 1; j <= 49; j++) {
				if ((j % 10 != input) && (j / 10 != input)) {
					count++;
					arr[j] = j;  // replacing the array with 'j', which is originally full of '0' numbers.
					if ((count - 1) % 6 == 0)  // avoiding '6' is divided with no remainder, so '-1' is necessary
						System.out.println();
					System.out.print(arr[j] + "\t");
				}
			}
			System.out.println("總共有" + count + "個數字可選");
			scanner.close();
		}

//		Advanced-quiz: print out 6 lucky-draw numbers
		System.out.println();
		System.out.println("6個數字:)");
//		initialize the integer number 'k' for generating 'random number'
		int randomNumber;  
//		looping 6 times for collecting 6 numbers
		for (int j = 0; j < 6; j++) {
//		creating a infinite loop(not knowing how many times need to run and get the 'DISTINCT' numbers
			while (true) {
				randomNumber = (int) (Math.random() * 50) + 1;  // ensure the number is always between 1 - 50, and keep generating while not collecting enough 'lucky numbers'
				if (arr[randomNumber] != 0) {  // the array has 50 numbers in total, each number is the 'lucky number' that 阿文 would like to have except some '0' numbers 
					System.out.print(arr[randomNumber] + " ");
					arr[randomNumber] = 0;  // replacing the number which is 'taking away from this array'
					break;
				}
			}
		}
	}
}
