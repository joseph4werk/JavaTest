package cube;

public class CubeTest {
	
	public static void main(String[] args) {
		try {
			Cube c1 = new Cube();
			c1.setLength(-3);
			System.out.println(c1.getVolume());
		} catch (CubeException e) {
			e.printStackTrace();
		}
	}
}
