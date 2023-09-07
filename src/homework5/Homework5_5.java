package homework5;

public class Homework5_5 {
	public static void main(String[] args) {
//	身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	與數字的亂數組合
		genAuthCode();
	}

	public static void genAuthCode() {
		for (int i = 0; i < 8; i++) {
			switch ((int) (Math.random() * 3)) {
			case 0:
				System.out.print((int) (Math.random() * 10));
				break;
			case 1:
				System.out.print((char) (int) (Math.random() * 26 + 65));
				break;
			case 2:
				System.out.print((char) (int) (Math.random() * 26 + 97));
				break;
			}
		}
	}
}
