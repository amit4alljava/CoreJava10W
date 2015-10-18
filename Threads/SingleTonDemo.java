class T
{
	//private static T obj = null;
	private static T obj = new T();
	private T(){}
	public  static T getObject(){
		/*synchronized(T.class){
		if(obj==null){
			obj = new T();
		}
		}*/
		return obj;
	}
}
public class SingleTonDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		T obj1 = T.getObject();
		T obj2 = T.getObject();
		T obj3 = T.getObject();
		if(obj1==obj2 && obj1==obj3){
			System.out.println("Same Ref");
		}
		else{
			System.out.println("Not Same Ref");
		}
		
		//T obj = new T();

	}

}
