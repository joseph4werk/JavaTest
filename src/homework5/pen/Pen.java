package homework5.pen;

public abstract class Pen {
	private String brand;
	private double price;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public Pen() {

	}

	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	abstract void write();
}
