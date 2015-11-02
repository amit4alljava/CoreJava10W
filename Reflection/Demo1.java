import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class A
{
	static{
		System.out.println("A Class Loaded...");
	}
	A(){
		System.out.println("A Class Cons Call");
	}
	private void show(){
		System.out.println("Show Call");
	}
}
class B{
	static{
		System.out.println("B Class Loaded...");
	}
	B(){
		System.out.println("B Class Cons Call");
		
	}
	void disp(){
		System.out.println("Disp call");
	}
}

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Class Name");
		String className = scanner.next();
		Object object = Class.forName(className).newInstance();
		
		System.out.println("Enter the Method Name");
		String methodName = scanner.next();
		Method method = object.getClass().
				getDeclaredMethod(methodName);
		method.setAccessible(true);
		method.invoke(object);
		// Class obj = new ClassName()
		//A obj = new A();
		//Object o = new B();

	}

}
