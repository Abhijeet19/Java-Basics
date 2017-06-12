
public class LoopTestOne {
	
	static private String[] month= {"January","February","March","April",
			"May","June","July","August",
			"September","October","November","December"};

	public static void main(String[] args) {
		for (int i = 0; i < month.length; i++) {
			System.out.println(month[i]);			
		}
		System.out.println("\"------For Each Loop -----\"");
		for (String monthQueue : month) {
			System.out.println(monthQueue);
		}
		System.out.println("\"----While Loop------------\"");
		
//		int counter = 1; Array Starts with 0
		int counter = 0;
		while (counter < month.length) {
			System.out.println(month[counter]);
			System.out.println("Counter: "+ counter);
			counter++;
			System.out.println("Counter after increment: "+ counter);
		}		
		System.out.println("\"----Do While Loop------------\"");
		
		int counterNew = 0;
		do {
			System.out.println(month[counterNew]);
			counterNew++;
		} while (counterNew < month.length);

	}

}
