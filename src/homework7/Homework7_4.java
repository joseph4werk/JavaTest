package homework7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Homework7_4 {
	
	public static void main(String[] args) throws Exception{
		
		File dir = new File("C:\\data");
		File f1 = new File("C:\\data\\Object.ser");
		
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		Dog martinDog = new Dog("MartinD");
		Dog jimmyDog = new Dog("JimmyD");
		Cat martinCat = new Cat("MartinC");
		Cat jimmyCat = new Cat("JimmyC");
		
		// 輸出
		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(martinDog);
		oos.writeObject(jimmyDog);
		oos.writeObject(martinCat);
		oos.writeObject(jimmyCat);
		
		oos.close();
		fos.close();
	}
}
