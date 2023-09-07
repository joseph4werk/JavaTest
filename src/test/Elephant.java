package test;

public class Elephant extends Animal {
	String name;

	public Elephant() {
		
	}
	
	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}

//	Annotation (標註) JDK5：給Java工具或框架的資訊
	@Override // 給編譯器的資訊，讓編譯器對此方法是用override規則檢查(安全)
	public void speak() {
		super.speak();
		System.out.println("Name is = " + this.name);
	}
	
	
////	編譯成功不報錯，但不符合override的規則
////	因為被編譯器當成overloading，1個是speak() (Animal)；1個是speak(int data) (Elephant)
//	public void speak(int data) {
//		super.speak();
//		System.out.println("Name is = " + this.name);
//	}
}
