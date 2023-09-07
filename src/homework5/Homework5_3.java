package homework5;

public class Homework5_3 {
	public static void main(String[] args) {
//		 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//		 可以找出二維陣列的最大值並回傳

		int intArray[][] = { { 1, 6, 3 }, { 9, 5, 2 } };
		double doubleArray[][] = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		System.out.println("最大值：" + maxElement(intArray));
		System.out.println("最大值：" + maxElement(doubleArray));
	}

	public static int maxElement(int x[][]) {
		int maxValue = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxValue < x[i][j]) {
					maxValue = x[i][j];
				}
			}
		}
		return maxValue;
	}

	public static double maxElement(double x[][]) {
		double maxValue = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxValue < x[i][j]) {
					maxValue = x[i][j];
				}
			}
		}
		return maxValue;
	}

}
