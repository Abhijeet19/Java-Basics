
public class StringBuilderTest {
	public static void main(String[] args) {
		String s1 = "Welcome";
		StringBuilder sb = new StringBuilder(s1);
		sb.append(" to California!");
		
		System.out.println(sb);
		
		String s2 = "Expendable";
		System.out.println(s2);
		
		s2 = s2 + "2";
		
		System.out.println(s2);
		
	}

}
