import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9001);
		System.out.println("Waiting for the Client....");
		Socket socket = server.accept();
		System.out.println("Here Comes the Client");
		System.out.println("Enter the Message to Send");
		Scanner scanner = new Scanner(System.in);
		String msg = scanner.nextLine();
		OutputStream os = socket.getOutputStream();
		os.write(msg.getBytes());
		os.close();
		socket.close();
		scanner.close();
		System.out.println("Data Sended....");
		
		

	}

}
