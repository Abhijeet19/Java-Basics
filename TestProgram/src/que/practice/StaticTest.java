package que.practice;

import org.jfree.data.Value;

public class StaticTest {
	
	static int j = 0;
	
	int value = 10;

	public static void main(String[] args) {
		int i;
				
		for (i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println(i+ "    ******* ");
		
		for (j = 0; j < 5; j++) {
			System.out.println(j);
		}
		System.out.println("******* " + j);
		
		StaticTest myObj = new StaticTest();
//		value++; // Without creating object I can't access the variables
		// local variables are for that method scope only
		myObj.value++;
		System.out.println("Value : " + myObj.value);
	}	
}
