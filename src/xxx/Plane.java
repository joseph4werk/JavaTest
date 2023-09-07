package xxx;

public class Plane implements Weightable{
	private String kind;     // 種類
	private double weight;
	
	public Plane() {
		super();
	}

	public Plane(String kind, double weight) {
		super();
		this.kind = kind;
		this.weight = weight;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void getWeightTool() {
		System.out.print("機型是" + this.kind+ ", " + "重量是" + this.weight + "kg, 秤重工具是：");
		System.out.println("地磅-fat ass專用款");
	}
}
