import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",9001);
		InputStream is = socket.getInputStream();
		int singleChar = is.read();
		while(singleChar!=-1){
			System.out.print((char)singleChar);
			singleChar = is.read();
		}
		is.close();
		socket.close();
		

	}

}
