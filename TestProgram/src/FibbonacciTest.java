
public class FibbonacciTest {

	public static void main(String[] args) {
		
		long firstNumber = 1;
		long secondNumber = 2;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
		for(int i = 0; i < 100; i++ ) {
			long number = firstNumber + secondNumber;
			System.out.println(number);
			
			firstNumber = secondNumber;
			secondNumber = number;
		}
		


	}

}
