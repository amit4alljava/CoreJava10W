import java.lang.reflect.Method;
import java.util.Scanner;

class Calculator{
	public int add(int x, int y){
		return x + y;
	}
	public int subtract(int x, int y){
		return x - y;
	}
	public int multiply(int x, int y){
		return x * y;
	}
	public int divide(int x, int y){
		return x / y;
	}
}

public class CalcDemo {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First No");
		int firstNo = scanner.nextInt();
		System.out.println("Enter the Second No");
		int secondNo = scanner.nextInt();
		System.out.println("Enter the Operation (add,subtract,multiply,divide) ");
		String operation = scanner.next();
		//Calculator calc = new Calculator();
		int result = 0;
		Object object = Class.forName("Calculator").newInstance();
		Method method = object.getClass()
				.getDeclaredMethod(operation, int.class,int.class);
		// Downcasting + AutoBoxing
		result = (Integer)method.invoke(object, firstNo,secondNo);
		
		/*if(operation.equals("add")){
			result = calc.add(firstNo, secondNo);
		}
		else
		if(operation.equals("subtract")){
			result = calc.subtract(firstNo, secondNo);
		}
		else
		if(operation.equals("multiple")){
			result = calc.multiply(firstNo, secondNo);
		}
		else
		if(operation.equals("divide")){
			result = calc.divide(firstNo, secondNo);
		}*/
		System.out.println("Result is "+result);
		
		

	}

}
