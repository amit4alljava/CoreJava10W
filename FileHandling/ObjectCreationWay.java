import java.util.Scanner;

class W implements Cloneable
{
	int x , y;
	W(){
		x = 100;
		y = 200;
		System.out.println("W Call ");
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class V
{
	V(){
		System.out.println("V Call");
	}
}
public class ObjectCreationWay {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {
		// 1. A obj = new A();
		// 2. Deserialization
		// 3. Dynamic Way 
		// 4. Clone
		//W obj = new W();  // Static Way of Object Creation
		// Resolve on Compile time Object creation on Runtime
		//WWWW obj2 = new WWWW();
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Class Name");
		String className = scanner.next();
		// Resolve on Runtime and Object Creation on Runtime (Lazy or Dynamic)
		Class.forName(className).newInstance();*/
		W obj = new W();
		obj.x++;
		obj.y=9000;
		W obj3 = obj; // obj reference assign to obj3
		W obj2 = (W)obj.clone();
		// In the above line it create a new object
		// but it doesn't call a constructor this time
		if(obj==obj2){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		System.out.println("obj "+obj.x +" "+obj.y);
		System.out.println("obj2 "+obj2.x +" "+obj2.y);
	}

}
