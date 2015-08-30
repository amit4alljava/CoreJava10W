
public class Demo4 {

	public static void main(String[] args) {
		String a = "Hello";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a);
		a = a.toUpperCase();
		System.out.println(a);
		char r[] = a.toCharArray();
		System.out.println(a.indexOf("L"));  // First Occurance
		System.out.println(a.lastIndexOf("L")); // Last Occurance
		System.out.println(a.replace('L', 'K'));
		String b  = "       Amit       Srivastava        ";
		System.out.println("["+b+"]");
		System.out.println("["+b.trim()+"]");
		String address="A-21, Shakti Nagar, Delhi-7";
		String array[] = address.split(",");
		System.out.println("Array is "+array.length);
		for(String z : array){
			System.out.println(z);
		}
		

	}

}
