package homework10;

public class Homework10_1 {

	public static void main(String[] args) {
		// 產生 5 個 1-100 的亂數
		for (int i = 0; i < 5; i++) {
			int randomNumber = (int) (Math.random() * 100) + 1;

			if (isPrime(randomNumber)) {
				System.out.println(randomNumber + "是質數");
			} else {
				System.out.println(randomNumber + "不是質數");
			}
		}
	}

	// 質數檢查公式
	public static boolean isPrime(int randomNumber) {
		if (randomNumber == 1) {
			return false;
		}

		for (int i = 2; i <= ((int) Math.sqrt(randomNumber)); i++) {
			if (randomNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
}
