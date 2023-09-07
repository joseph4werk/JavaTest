package xxx;

import java.io.*;
import java.net.*;

public class GetNatalieThread implements Runnable {
	private File dir;
	private String url;
	
	public GetNatalieThread(File dir, String url) {
		this.dir = dir;
		this.url = url;
	}
	
	@Override
	public void run() {
		String filename = url.substring(url.lastIndexOf("/") + 1);
		File file = new File(dir, filename);
		
		try {
			URL myURL = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) myURL.openConnection();
			InputStream is = conn.getInputStream();
			FileOutputStream fos = new FileOutputStream(file);

			System.out.println("Wallpaper: " + filename + " kick-off!");

			// 自訂緩衝區
			int length = 0;
			byte[] b = new byte[4096];
			while ((length = is.read(b)) != -1) {
				fos.write(b, 0, length);
				fos.flush();
			}
			fos.close();
			is.close();
			
			System.out.println(filename + " Done!");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}