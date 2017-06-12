
public class StringParseTest {
	public static void main(String[] args) {
		
		String s1 = "Welcome to California!";
		System.out.println(s1.length());
		
		int pos = s1.indexOf("California!");		
		System.out.println("position of California : " + pos);
		
		String sub = s1.substring(11);
		System.out.println("Substring : " + sub);
		
		String s2 = "Welcome         ";
		System.out.println(s2.length());
		
		String s3 = s2.trim();
		System.out.println(s3.length());

	}

}
