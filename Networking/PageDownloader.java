import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class PageDownloader {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("D:\\JavaWeekEnd10to12\\download\\googlelogo.ico");
		URL url = new URL("https://www.google.co.in/images/branding/product/ico/googleg_lodp.ico");
		URLConnection con = url.openConnection();
		con.connect();
		InputStream is = con.getInputStream();
		int singleChar = is.read();
		while(singleChar!=-1){
			fo.write(singleChar);
			singleChar = is.read();
		}
		is.close();
		fo.close();
		System.out.println("Downloaded....");
	}

}
