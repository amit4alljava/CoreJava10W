
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a  = new String("hello");  // Immutable + String Pool
		StringBuilder sb = new StringBuilder();
		//StringBuffer sb = new StringBuffer(100);
		//StringBuffer sb = new StringBuffer("hello"); // Mutable + No Pool
		// hello + 16 = 5 + 16 = 21
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.ensureCapacity(2000);
		sb.append("How are you i am fine thank u jhjhgjghjhgjhjhjhjhgjghjhgjhgjhgjghjghjhgjhgjhgjghjghjghjghjghjghjghjgj");
		System.out.println("Length "+sb.length());
		System.out.println("Capcity "+sb.capacity());
		// NewCapacity = OldCapacity * 2 + 2
		// 44 = 21 * 2 + 2

	}

}
