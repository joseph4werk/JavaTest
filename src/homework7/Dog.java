package homework7;

import java.io.Serializable;

public class Dog implements Serializable, speak {
	public static final int serialversionUID = 1;

	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
