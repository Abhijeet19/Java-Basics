
public class ReverseString {

	public static void main(String[] args) {
		//char[] abc = {'a','b','c','d'};
		
		String a = "Abhijeet";
		int len = a.length();
		System.out.println("Length :" + len);
		char [] ab = new char[len]; 
		
		for (int i = len-1 ; i >= 0; i-- ) {
			ab[i] = a.charAt(i);
			System.out.println(":" + ab[i]);
		}
	}

}
