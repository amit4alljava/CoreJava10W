import java.io.File;
import java.io.IOException;


public class Demo1 {

	public static void main(String[] args) {
		// Example Create a New File in Java
		File file = new File("D:\\JavaWeekEnd10to12\\Abcd.txt");
		try{
			// try is a block where exception can be occured
		file.createNewFile();  // throw new IOException
		
		System.out.println("File Created...");
		int e = 10/0; // throw new ArithmeticException(); (UnChecked)
		// Checked  Exception Treatement Must be on Compile time
		}
		catch(ArithmeticException e){
			System.out.println("U Divide a number with zero , Kindly COntact to System Admin");
		}
		catch(IOException e){
			System.out.println("File Path Might Be Wrong or Not Exist , Kindly COntact to System Admin");
		}
		catch(Exception  e){
			System.out.println("Some Other Problem Raised , Contact to Software Team");
		}

	}

}
