package xxx;

import java.io.File;

public class GetNatalieMain {

	public static void main(String[] args) {
		File dir = new File("C:\\Pictures");
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		for (int i = 1; i <= 42; i++) {
			String url = "http://www.space-fox.com/wallpapers/celebs/natalie-portman" + 
					"/natalie_portman_" + i	+ ".jpg";
			Thread t = new Thread(new GetNatalieThread(dir, url));
			t.start();
		}
	}

}