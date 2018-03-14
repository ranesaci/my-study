package other;

public class PrintPatternTest {

	public static void main(String[] args) {
		printPattern(10);

	}

	private static void printPattern(int number) {
		
		for (int i = 1; i <= number; i++) {
			for (int j = number; j > 0; j--) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print(j);
				}
			}
			System.out.println();
			
		}
		
	}

}
