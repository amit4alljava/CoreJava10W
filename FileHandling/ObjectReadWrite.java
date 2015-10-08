import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Dept implements Serializable
{
	int deptno = 100;
}
class Person // implements Serializable
{
	
	Person(){
		age = 1;
		System.out.println("Person Class Cons Call");
	}
	int age;
}

class Employee extends Person implements Serializable
{
	Dept dept = new Dept();
	private static final long serialVersionUID = 1L;
/**
	 * 
	 */
	
private int id;
private String name;
private double salary;
private transient String password;
private double bonus;
private double pf;
Employee(){
	password ="11111";
	System.out.println("Employee Class Cons Call");
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
public double getPf() {
	return pf;
}
public void setPf(double pf) {
	this.pf = pf;
}

}
public class ObjectReadWrite {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	Employee ram = new Employee();
	ram.age = 21;
		ram.setId(1001);
		ram.setName("ram");
		ram.setSalary(9090);
		FileOutputStream fo = new FileOutputStream("E:\\TestingFileHandling\\objectfile\\emp.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(ram);
		os.close();
		fo.close();
		System.out.println("Object Store....");
		
		// Read
		File file = new File("E:\\TestingFileHandling\\objectfile\\emp.dat");
		if(file.exists()){
		FileInputStream fi = new FileInputStream(file);
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee e = (Employee)oi.readObject();
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" Password "+e.getPassword()+" Age "+e.age);
		System.out.println(e.dept.deptno);
		oi.close();
		fi.close();
		}
	}

}
