package test;

public class TestBMI {
	public static void main(String[] args) {
		double height = 1.66;
		double weight = 45.5;

		double bmi = weight / Math.pow(height, 2);
		System.out.println("BMI = " + bmi);
		System.out.printf("BMI = %.2f%n", bmi);
//		System.out.println();
		
		if (bmi < 18.5) {
			System.out.println("過瘦西八");
		} else if (bmi >= 24) {
			System.out.println("過重");
		} else {
			System.out.println("正常");
		}
	}

}
