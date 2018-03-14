package other;

public class PrintZeroPatternTest {

	public static void main(String[] args) {
		printZeroPattern(4);

	}

	private static void printZeroPattern(int number) {
		int staticCols = 9;
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <=staticCols; j++) {
				if(i==j || j== staticCols/2+1 || j== staticCols-i+1) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
			
		}
		
	}

}
