
public class OverloadTest {

	public static void main(String[] args) {
		int value1 = 10;
		int value2 = 20;
		int value3 = 30;
		
		int result = addValues(value1, value2);
		System.out.println("Result: " + result);
		
		result = addValues(value1, value2, value3);
		System.out.println("Result 2 : " + result);
		
		String s1 = "10";
		String s2 = "20";
		
		int result2 = addValues(s1, s2);
		System.out.println("String Result : " + result2);
		
		String sg1 = "A";
		String sg2 = "B";
		String sg3 = "C";
		String result3 = addValues(sg1, sg2, sg3);
		System.out.println("String Result : " + result3);
	}
	
	private static String addValues(String stg1, String stg2, String stg3) {
		return stg1+stg2+stg3;
	}

	private static int addValues(int val1, int val2){
		return val1 + val2;		
	}
	private static int addValues(int val1, int val2, int val3){
		return val1 + val2 + val3;
	}
	private static int addValues(String val1, String val2){
		int v1 = Integer.parseInt(val1);
		int v2 = Integer.parseInt(val2);
		int result = v1 + v2;
		return result;
	}
}
