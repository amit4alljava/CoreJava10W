
interface X{
	void show();
}

class Y implements X
{
	@Override
	public void show(){
		System.out.println("Y Show");
	}
}

public class Demo {

	public static void main(String[] args) {
		// class ____ implements X
		//{
		
		//}
		
		X obj2 = ()->System.out.println("Lambda Show Call");
		obj2.show();
		
		X obj = new X(){
			@Override
			public void show(){
				System.out.println("Anonymous Show Call");
			}
		};
		obj.show();

	}

}










