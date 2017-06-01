import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Calculator {

	public static void main(String[] args) {
		
		String s1 = getInput("Enter a numeric value: ");
		String s2 = getInput("Enter a numeric value: ");
		
		Double result = addTwoValues(s1, s2);
		
		System.out.println("The answers is : " +result);
		
		Double resultOfAddMultiplication = addMultipleValues(1,2,3,4,5);
		
		System.out.println("Multiplication: " + resultOfAddMultiplication);


	}

	private static Double addTwoValues(String s1, String s2) {
		Double d1 = Double.parseDouble(s1);
		Double d2 = Double.parseDouble(s2);
		Double result = d1 + d2;
		return result;
	}
	
	public static String getInput(String prompt){
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(prompt);
		System.out.flush();	
		
		try {
			return stdin.readLine();		
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
	
	private static double addMultipleValues(double ... values){
		double result = 1d;
		for (double d : values) {
			result *=d;			
		}
		
		return result;
	}

}
