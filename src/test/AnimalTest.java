package test;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal cat = new Animal(2, 5.0f);
//		cat.speak();
//		
//		System.out.println("3 years passed....");
//		cat.setAge(5);
//		cat.setWeight(7.0f);
//		cat.speak();
		Animal[] a = new Animal[2];
		a[0] = new Animal(3, 8);
		a[1] = new Elephant(8, 1200, "Joe");
//		Animal a1 = new Animal(3, 8.0f);
//		Elephant e1= new Elephant(8, 1200.0f, "Joe");

		for (int i = 0; i < a.length; i++) {
			a[i].speak();
			System.out.println("===========");
		}
//		a[0].speak();
//		System.out.println("===========");
//		a[1].speak();
	}

}
