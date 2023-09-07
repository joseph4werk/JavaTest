package xxx;

public class Tibame {

	public static void main(String[] args) {
		System.out.println("Tibame開門了");
		Classroom c1 = new Classroom(401, "小吳");
		Classroom c2 = new Classroom(402, "郭老師");
		Classroom c3 = new Classroom(403, "怡榕");

		c1.start();
		c2.start();
		c3.start();
		
		try {
			c1.join();
			c2.join();
			c3.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Tibame關門....");
	}
}
