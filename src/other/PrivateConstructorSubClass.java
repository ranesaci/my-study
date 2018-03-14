package other;

public class PrivateConstructorSubClass extends PrivateConstructorSuperClass {
	
	public PrivateConstructorSubClass() {
		/*System.out.println("before PrivateConstructorSubClass");*/
		super(10);
		System.out.println("after PrivateConstructorSubClass");
	}
	
	public static void main(String[] args) {
		PrivateConstructorSubClass privateConstructorSubClass = new PrivateConstructorSubClass();
		System.out.println("in main method after object created");
	}

}
