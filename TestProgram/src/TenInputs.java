import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Amdocs
 * Enter 10 numbers : 1 2 2 3 5 4 5 8 6 5
 * the distinct number : 1 2 3 4 5 6 8 
 */

public class TenInputs {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers : ");
		int value = 0;
		Set<Integer> set = new TreeSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			value = sc.nextInt();
			set.add(value);
		}
		
		System.out.println("The distinct numbers : " + set);
				
	}

}
