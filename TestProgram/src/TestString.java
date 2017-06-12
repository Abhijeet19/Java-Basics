
public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "spring ";
		System.out.println("S1 : " + s1);
		String s2 = s1 + "summer ";
		System.out.println("S2 : " + s2);
		s1.concat("fall ");
		System.out.println("S1 : " + s1);
		s2.concat(s1);
		System.out.println("S2 : " + s2);
		s1 += "winter ";
		
		System.out.println("S1 : " + s1);
		
		System.out.println("Final S2 : " + s2);

	}

}
