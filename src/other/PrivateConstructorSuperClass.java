package other;

public class PrivateConstructorSuperClass {
	
	private PrivateConstructorSuperClass() {
		
	}
	public PrivateConstructorSuperClass(int value) {
		System.out.println("PrivateConstructorSuperClass param constructor="+value);
	}
	
	public void getData() {
		System.out.println("get data super");
	}

}
