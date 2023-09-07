package homework7;

import java.io.Serializable;

public class Cat implements Serializable, speak {
	public static final int serialversionUID = 1;

	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}
