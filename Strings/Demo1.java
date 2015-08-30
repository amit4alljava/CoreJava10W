
public class Demo1 {

	public static void main(String[] args) {
		
		// Final Class (Java 1.0)
		// it a group of characters (Char Array)
		// Also Called as a DataType , But is a Class
		// Immutable Class
		// String use String Pool 
		String a  ="Hello".intern();  // 1 or 0 
		String b = "Hello".intern();
		String c = new String("Hello");  // 2 or 1 
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		//String x = new String();
		//String y = new String("Hello");
		a = "Bye";
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		a ="Hello";
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		String e = new String("Hi");  //2
		String f = new String("Hi");  // 1
		if(e==f){
			System.out.println("Same Ref of e and f");
		}
		else
		{
			System.out.println("Not Same Ref of e and f");
		}
		// TODO Auto-generated method stub

	}

}
