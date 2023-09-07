package test;

public class TestRandomArray1 {
	public static void main(String[] args) {
		// step 1: 建立三個 3x3 的二維陣列

		// step 2: 將亂數資料填入到x陣列

		// step 3: 將亂數資料填入到y陣列

		// step 4: 把 x & y 對應位置的元素相加放進z陣列

		// step 5: 將三個陣列的元素列印出來

		TestRandomArray1 tra1 = new TestRandomArray1();

//		int[][] x = new int[3][3];
//		int[][] y = new int[3][3];
		int[][] x = tra1.getRandomArray();
		int[][] y = tra1.getRandomArray();
		int[][] z = new int[3][3];

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
//				x[i][j] = (int) (Math.random() * 31);
//				y[i][j] = (int) (Math.random() * 31);
				z[i][j] = x[i][j] + y[i][j];
			}
		}

//		for (int i = 0; i < x.length; i++) {
//			for (int j = 0; j < x[i].length; j++) {
//				System.out.print(x[i][j] + "\t");
//				System.out.print(y[i][j] + "\t");
//				System.out.print(z[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		System.out.println("=============================================");

		tra1.printArray(x);
		tra1.printArray(y);
		tra1.printArray(z);

//		System.out.println("Array X = " + Arrays.deepToString(x));
//		System.out.println("Array Y = " + Arrays.deepToString(y));
//		System.out.println("Array Z = " + Arrays.deepToString(z));

//		亂數
//		System.out.println(Math.random());
//
//		// 1 ~ 10
//		int r = (int) (Math.random() * 10) + 1;
//		System.out.println(r);
//
//		int r2 = (int) (Math.random() * 11);
//		System.out.println(r2);
	}

	public int[][] getRandomArray() {

		int[][] data = new int[3][3];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = (int) (Math.random() * 31);
			}
		}

		return data;
	}

	public void printArray(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("====================");

	}

}
