package homework7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Homework7_2 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);

		for (int i = 0; i <= 10; i++) {
			int random = (int) (Math.random() * 1000) + 1;
			ps.print(random + "\n");
			bos.flush();
		}
	}
}
