package xxx;

public class Powder implements Weightable {
	private String color;
	private double weight;

	public Powder() {
		super();
	}

	public Powder(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void getWeightTool() {
		System.out.print("顏色是" + this.color + ", " + "重量是" + this.weight + "kg, 秤重工具是：");
		System.out.println("天秤-涼了");
	}
}
