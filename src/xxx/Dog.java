package xxx;

public class Dog implements Weightable {
	private String name;
	private double weight;

	public Dog() {
		super();
	}

	public Dog(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void getWeightTool() {
		System.out.print("吾家愛犬小名" + this.name + ", " + "重量是" + this.weight + "kg, 秤重工具是：");
		System.out.println("體重計-胖狗愛用款");
	}
}
