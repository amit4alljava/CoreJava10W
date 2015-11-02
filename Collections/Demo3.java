import java.util.ArrayList;

class Employee{
	private int id;
	private String name;
	private double salary;
	Employee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	@Override
	public String toString() {
		return "Employee (id=" + id + ", name=" + name + ", salary=" + salary
				+ ")";
	}
	
	@Override
	public boolean equals(Object o){
		Employee e = (Employee) o;
		if(this.id == e.id && this.name.equals(e.name)
				&& this.salary==e.salary){
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		Employee ram = new Employee(1001, "Ram", 9090);
		empList.add(ram);
		Employee shyam = new Employee(1002, "Shyam", 7878);
		empList.add(shyam);
		System.out.println(empList);
		
		Employee searchRam = new Employee(1001, "Ram", 9090);
		// Search Operation
		int indexNo = empList.indexOf(searchRam);
		if(indexNo>=0){
			System.out.println("Found...");
			empList.remove(indexNo);
		}
		else
		{
			System.out.println("Not Found...");
		}
		

	}

}
