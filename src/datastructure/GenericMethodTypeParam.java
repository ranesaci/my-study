package datastructure;

public class GenericMethodTypeParam {

	public static void main(String[] args) {
		String[] arr = {"sachin", "Rane"};
		
		print(arr);

	}

	 static <E>  void print(E[] arr) {
		 for (int i = 0; i < arr.length; i++) {
			 System.out.println(arr[i]);
			
		}
		
		
	}

}
