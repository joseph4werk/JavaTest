package homework9;

class contestant implements Runnable {
	String name;
	int count;

	public contestant(String name) {
		this.name = name;
	}

	public void eat() {
		count++;
		System.out.println(name + "吃第" + count + "碗飯");
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			eat();
			int random = (int) (Math.random() * 2501 + 500);

			try {
				Thread.sleep(random);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了！");
	}
}

public class Homework9_1 {
	public static void main(String[] args) {
		contestant c1 = new contestant("饅頭人");
		contestant c2 = new contestant("詹姆士");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);

		System.out.println("-----大胃王快食比賽開始！-----");

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("-----大胃王快食比賽結束！-----");
	}
}
