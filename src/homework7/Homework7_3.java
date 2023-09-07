package homework7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Homework7_3 {
	
	public static void main(String[] args) throws Exception{
		File input = new File("C:\\Users\\Tibame_T14\\Desktop\\pics\\2.jpg");
		File output = new File("piyan.jpg");
		copyFile(input, output);
		
	}
	
	public static void copyFile(File inputFile, File outputFile)throws Exception {
		int c;
		File inputeFile = inputFile;
		FileInputStream fis = new FileInputStream(inputeFile);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(outputFile);
		while((c = bis.read())!=-1) {
			fos.write(c);
			fos.flush();
		}
		
		
	}

}
