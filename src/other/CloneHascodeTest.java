package other;

public class CloneHascodeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee();
		System.out.println("employee hashcode:"+employee.hashCode());
		
		Employee employee1 = (Employee) employee.clone();
		System.out.println("employee1 hashcode:"+employee1.hashCode());
		

	}

}

class Employee implements Cloneable{
	
	int id;
	String name;
	
	public Employee() {
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
