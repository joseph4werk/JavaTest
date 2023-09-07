package test;

public class HW2 {
	 public static void main(String[] args) {
	        int sum = 0;
//	        1~1000的偶數
	        for (int i = 1; i <= 1000; i++) {
	            if (i % 2 == 0) {
	                sum += i;
	            }
	        }
	        System.out.println("1~1000的偶數和" + sum);
	        System.out.println("======================================================");


//	        1~10的連乘積
	        int sum1 = 1;
	        for (int i = 1; i <= 10; i++) {
	            sum1 *= i;
	        }
	        System.out.println("1~10的連乘積" + sum1);
	        System.out.println("======================================================");

//	        1~10的連乘積
	        int sum2 = 1;
	        int i1 = 1;
	        while (i1 <= 10) {
	            sum2 *= i1;
	            i1++;
	        }
	        System.out.println("1~10的連乘積" + sum2);
	        System.out.println("======================================================");

//	        輸出1 4 9 16 25 36 49 64 81 100

	        for (int i = 1; i <= 10; i++) {
	            System.out.print((i * i) + " ");
	        }
	        System.out.println();
	        System.out.println("======================================================");

//	      阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//	      輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

	        int count = 0;
	        for (int i = 1; i <= 49; i++) {
	            if ((i % 10 != 4) && (i / 10 != 4)) {
	                count += 1;
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println();
	        System.out.println("總共有" + count + "個");
	        System.out.println("======================================================");

//	       請設計一隻Java程式，輸出結果為以下：
//	        1 2 3 4 5 6 7 8 9 10
//	        1 2 3 4 5 6 7 8 9
//	        1 2 3 4 5 6 7 8
//	        1 2 3 4 5 6 7
//	        1 2 3 4 5 6
//	        1 2 3 4 5
//	        1 2 3 4
//	        1 2 3
//	        1 2
//	        1

	        for (int i = 10; i > 0; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	        System.out.println("======================================================");

//	        請設計一隻Java程式，輸出結果為以下：
//	        A
//	        BB
//	        CCC
//	        DDDD
//	        EEEEE
//	        FFFFFF

	        for (int i = 'A'; i <= 'F'; i++) {
	            for (int j = 'A'; j <= i; j++) {
	                System.out.print((char) (i));
	            }
	            System.out.println();
	        }

	    }

}
