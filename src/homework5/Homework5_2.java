package homework5;

public class Homework5_2 {
	public static void main(String[] args) {
//		請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
		randAvg();
	}

	public static void randAvg() {
		int sum = 0;
		System.out.print("本次亂數結果: ");
		for (int i = 0; i < 10; i++) {
			int nums = (int) (Math.random() * 101);
			System.out.print(nums + " ");
			sum += nums;
		}
		System.out.println("\n" + "平均值為：" + sum / 10);
	}
}
