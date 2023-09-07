package homework5.pen;

public class Pencil extends Pen {

	public Pencil(String brand, double price) {
		super(brand, price);
	}

	@Override
	public double getPrice() {
		return super.getPrice() * 0.8;

	}

	public void write() {
		System.out.println("削鉛筆再寫");
	}

}
