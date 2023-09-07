package homework7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class homework7_5 {

	public static void main(String[] args) throws Exception {
		// 輸入
		File f1 = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);

		try {
			while (true) {
				((speak) ois.readObject()).speak();
				System.out.println("-----------------------------");
			}
		} catch (EOFException e) {
			System.out.println("***Thers is no shit to read^^");
		}
		
		ois.close();
		fis.close();

	}
}
