import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Demo1 {

	public static void main(String[] args) throws UnknownHostException {
		System.out.println("Enter the Host Name");
		Scanner scanner =new Scanner(System.in);
		String hostName = scanner.next();
		//InetAddress ip = InetAddress.getLocalHost();
		InetAddress ip[]= InetAddress.getAllByName(hostName);
		for(InetAddress i : ip){
		System.out.println(i.getHostAddress());
		System.out.println(i.getHostName());
		}
		scanner.close();

	}

}
