package que.practice;
import que.practice.StaticTest;

public class StaticTestMain {
	public static void main(String[] args) {
		// calling Static variable to check its value
		
		System.out.println("StaticTest.j : " + StaticTest.j);
		StaticTest.j++;
		System.out.println("StaticTest.j incremented : " + StaticTest.j);
		
		// Calling instance variable to check its value
		
		StaticTest objStaticTest = new StaticTest();
		
		System.out.println("objStaticTest.value : " + objStaticTest.value);
		
	}
}
