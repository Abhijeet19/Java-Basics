
public class StringTest {
	public static void main(String[] args) {
		String s1 = "Welcome to California!";
		String s2 = new String("Welcome to California!");
		String s3 = new String("WELCOME to California!");
		System.out.println(s2);
		
		if(s1 == s2){
			System.out.println("They are equal.");
		} else {
			System.out.println("They are not equal");			
		}
		
		if(s1.equals(s2)){
			System.out.println("They are equal.");
		} else {
			System.out.println("They are not equal");			
		}
		
		if(s1.equalsIgnoreCase(s3)){
			System.out.println("They are equal.");
		} else {
			System.out.println("They are not equal");			
		}
		
		char[] c1 = s1.toCharArray();
		
		for (char c : c1) {
			System.out.println(c);			
		}

	}
}
