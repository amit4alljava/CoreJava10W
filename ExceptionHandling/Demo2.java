import java.util.InputMismatchException;
import java.util.Scanner;


public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNo = 0;
		int secondNo =0;
		int result = 0;
		try{
		System.out.println("Enter the First No ");
		firstNo = scanner.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Only 0-9 Allowed ");
			scanner.nextLine();
			System.out.println("Enter the First No ");
			firstNo = scanner.nextInt();
		}
		try{
		System.out.println("Enter the Second No ");
		 secondNo = scanner.nextInt();
		}
		catch(InputMismatchException e){
		System.out.println("Only 0-9 Allowed ");
		scanner.nextLine();
		System.out.println("Enter the Second No ");
		 secondNo = scanner.nextInt();
		}
		try{
		 result = firstNo/secondNo;
		}
		catch(ArithmeticException e){
			System.out.println("U Divide a No With Zero");
		}
		System.out.println("Result is "+result);
		scanner.close();

	}

}
