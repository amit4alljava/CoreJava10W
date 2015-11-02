import java.util.ArrayList;
import java.util.Collections;
/*
 * AutoBoxing Feature Comes From Java 1.5
 * And this is used to convert Primitive Type into Wrapper
 * Type and vice-versa.
 */
import java.util.Iterator;
import java.util.ListIterator;

public class Demo2 {
static void evenOdd(int x){
	if(x%2==0){
		System.out.println("Even No "+x);
	}
	else{
		System.out.println("Odd No "+x);
	}
}
	public static void main(String[] args) {
		// 1.5 Styling
		// Generics
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);// AutoBoxing
		//list.add(new Integer(100));  // Insert at End
		list.add(200);
		//list.add(new Integer(200));
		//list.add("amit");
		//list.add(new Double(90.290));
		list.add(300);
		list.add(0,900);  // Insert at specified index
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		// UnBoxing - Object (Wrapper) to Primitive
		// Boxing - Primitive to Object(Wrapper)
		list.add(list.get(1) + list.get(2)); // AutoBoxing
		/*Integer firstNo = (Integer)list.get(1);
		Integer secondNo = (Integer)list.get(4);
		list.add(new Integer(firstNo.intValue() + secondNo.intValue()));*/
		System.out.println("Now List is "+list);
		// Search Operation
		int index = -1;
		index = list.indexOf(200);
		if(index>=0){
		//if(list.contains(2100)){
			System.out.println("Found...");
		list.set(index, 10000);  // Update
		System.out.println("NOw After Updation List is "+list);
			//list.remove(index);
		}
		else
		{
			System.out.println("Not Found...");
		}
		
		Collections.sort(list);
		System.out.println("After Sort "+list);
		// Traverse 
		// 1st Way
		for(int i = 0 ; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		// 2nd Way
		Iterator<Integer> it  = list.iterator();
		while(it.hasNext()){
			int currentElement = it.next();
			//it.remove();
			// it.next() give current element and then
			// move to the next element
			System.out.println(currentElement);
		}
		//3rd Way
		ListIterator<Integer> lt = list.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		while(lt.hasPrevious()){
			System.out.println(lt.previous());
		}
		//4th Way
		for(int d : list){
			System.out.println(d);
		}
		// 5th Way
		list.forEach(Demo2::evenOdd);
		
	}

}
