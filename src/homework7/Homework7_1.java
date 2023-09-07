package homework7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Homework7_1 {

	static void p(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) throws Exception {
		String str;
		int i = 0;
		int count = 0;
		File file = new File("Sample.txt");
		FileReader fr = new FileReader(file);
		FileReader fr1 = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		BufferedReader br1 = new BufferedReader(fr1);
		while ((str = br.readLine()) != null) {
			i++;
//			System.out.println(str);
			p(str);
		}

		System.out.println();
//		System.out.println("Sample.txt檔案共有" + file.length() + "個位元組");
		p("Sample.txt檔案共有" + file.length() + "個位元組");
		
		br.close();
		fr.close();

		while (br1.read() != -1) {
			count++;
		}
//		System.out.println("Sample.txt檔案共有" + count + "個字元");
//		System.out.println("Sample.txt檔案共有" + i + "列");
		p("Sample.txt檔案共有" + count + "個字元");
		p("Sample.txt檔案共有" + i + "列");

		br1.close();
		fr1.close();
	}

}
