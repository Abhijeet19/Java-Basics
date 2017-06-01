import com.test.helper.InputHelper;
import com.test.helper.SimpleMath;

public class Calculator2 {
	public static void main(String[] args) {

		String s1 = InputHelper.getInput("Enter a numeric value: ");
		String s2 = InputHelper.getInput("Enter a numeric value: ");
		String op = InputHelper.getInput("Enter: 1: Addition" + "\n" + "2: Subtraction"
				+ "\n" + "3: Multiplication" + "\n" + "4: Division");

		int ops = Integer.parseInt(op);
		Double result = 0.0;

		switch (ops) {
		case 1:
			result = SimpleMath.addValues(s1, s2);			
			break;			
			
		case 2:
			result = SimpleMath.subtractValues(s1, s2);
			break;

		case 3:
			result = SimpleMath.multiplicationValues(s1, s2);
			break;

		case 4:
			result = SimpleMath.divideValues(s1, s2);			
			break;

		default:
			
		}
		
		System.out.println("The answers is : " + result);

	}	
}
