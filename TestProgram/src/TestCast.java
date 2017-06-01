
public class TestCast {
	public static void main(String[] args) {
		double doubleValue = 12.5;
		//int intValue1 = (int)doubleValue;
		Double doubleObj = new Double(doubleValue);
		//int intValue = 128;
		//byte byteValue = (int)intValue;
		
		//System.out.println("byteValue : " + byteValue);
	//	System.out.println("intValue : " + intValue1);
		
		
		int testResult = doubleObj.intValue();
		
		System.out.println("int : "+testResult);	
		System.out.print("int : "+testResult+12);
	}

}
