import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator1 {
	public static void main(String[] args) {

		String s1 = getInput("Enter a numeric value: ");
		String s2 = getInput("Enter a numeric value: ");
		String op = getInput("Enter: 1: Addition" + "\n" + "2: Subtraction"
				+ "\n" + "3: Multiplication" + "\n" + "4: Division");

		int ops = Integer.parseInt(op);
		Double result = 0.0;

		switch (ops) {
		case 1:
			result = addValues(s1, s2);			
			break;			
			
		case 2:
			result = subtractValues(s1, s2);
			break;

		case 3:
			result = multiplicationValues(s1, s2);
			break;

		case 4:
			result = divideValues(s1, s2);			
			break;

		default:
			
		}
		
		System.out.println("The answers is : " + result);

	}

	private static Double divideValues(String s1, String s2) {
		Double d1 = Double.parseDouble(s1);
		Double d2 = Double.parseDouble(s2);
		Double result = d1 / d2;
		return result;
	}

	private static Double multiplicationValues(String s1, String s2) {
		Double d1 = Double.parseDouble(s1);
		Double d2 = Double.parseDouble(s2);
		Double result = d1 * d2;
		return result;
	}

	private static Double subtractValues(String s1, String s2) {
		Double d1 = Double.parseDouble(s1);
		Double d2 = Double.parseDouble(s2);
		Double result = d1 - d2;
		return result;
	}

	private static Double addValues(String s1, String s2) {
		Double d1 = Double.parseDouble(s1);
		Double d2 = Double.parseDouble(s2);
		Double result = d1 + d2;
		return result;
	}

	public static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println(prompt);
		System.out.flush();

		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}

}
