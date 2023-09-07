package xxx;

public class Classroom extends Thread {

	private int no;
	private String tName;

	public Classroom(int no, String tName) {
		this.no = no;
		this.tName = tName;
	}

	public void run() {
		System.out.println(no + " " + tName + "開始上課");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(no + " " + tName + "下課了");
	}
}
