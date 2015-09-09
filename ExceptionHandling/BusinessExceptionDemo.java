import java.util.Scanner;


class MinorAgeException extends RuntimeException
{
	private int age;
	MinorAgeException(int age){
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "Your Age is "+age+" and Age required is 18 or greater so can't apply for VoterId and DL";
	}
}

public class BusinessExceptionDemo {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		try{
			if(age<18){
		
			throw new MinorAgeException(age);
			}
		else
		{
			System.out.println("Process for VoterId");
			System.out.println("Process For Driving License");
		}
		}
		catch(MinorAgeException e){
			System.out.println(e);
		}

	}

}









