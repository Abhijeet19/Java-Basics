public class TestPro {
/* Method Oveloading
 * Only change in return type is not method overloading
  
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int result = addValue(a,b);
		System.out.println("Result : "+ result);
	}

	private static int addValue(int a1, int b1) {
		return a1 + b1;
	}
	
	private static double addValue(int a1, int b1) {
		return a1 + b1;
	}
	*/
	/*
	 public static void main(String args[]){		
		int a = 10;		
		for (int i=0; i< 10; i++){
			System.out.print(i);
			a++;
		}		
		System.out.println("a: "+a);
			
	}	*/
	
	public static void main(String args[]) {
		
		int value = 20;
		
		int result = valueIncrement(value);
		
		System.out.println("Result after function call : " + result );
		System.out.println("Original value : " + value );
	}
	
	private static int valueIncrement(int v) {
		v++;
		return v;
	}
}
