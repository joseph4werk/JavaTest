package xxx;

public class WeightTest {

	public static void main(String[] args) {
		Weightable[] w = new Weightable[3];
		w[0] = new Dog("Martin", 10);
		w[1] = new Plane("A350", 100000);
		w[2] = new Powder("Pink", 0.5);

		for (int i = 0; i < w.length; i++) {
			w[i].getWeightTool();
			System.out.println("***********************************************************");
		}
	}

}
