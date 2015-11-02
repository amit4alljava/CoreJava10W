import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
interface RR{
	
}
interface TT{
	
}
class R implements RR, TT
{
	int s;
	private int t;
	public String m;
}
public class ScanClassDemo {

	public static void main(String[] args) {
		R obj = new R();
		Class cls = obj.getClass(); //Meta Data + Data
		Class cls2 = String.class;  // Meta Data
		Field fields[] =cls2.getDeclaredFields();
		Method methods[] = cls2.getDeclaredMethods();
		System.out.println("Total Methods are "+methods.length);
		Constructor cons[] = cls2.getConstructors();
		Class supercls = cls2.getSuperclass();
		Class interfaces []=cls2.getInterfaces();
		System.out.println("Total Interfaces Implement "+interfaces.length);
		System.out.println("Super Class "+supercls.getName());
		System.out.println("Total fields are "+fields.length);
		for(Field field : fields){
			if(Modifier.isPrivate(field.getModifiers())){
				System.out.println("This is Private Field "+field.getName());
			}
			else
				if(Modifier.isPublic(field.getModifiers())){
					System.out.println("This is Public Field "+field.getName());
				}
				else
					if(Modifier.isProtected(field.getModifiers())){
						System.out.println("This is Protected Field "+field.getName());
					}
					else
						if(Modifier.isFinal(field.getModifiers())){
							System.out.println("This is Final Field "+field.getName());
						}		
						/*else
							if(Modifier.isAbstract(field.getModifiers())){
								System.out.println("This is Private Field "+field.getName());
							}*/
							else
								if(Modifier.isStatic(field.getModifiers())){
									System.out.println("This is Static Field "+field.getName());
								}
			//System.out.println(field.getName());
		}

	}

}
