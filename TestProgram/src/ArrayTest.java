
public class ArrayTest {
	public static void main(String[] args) {
		int[] a = new int[3];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[0]);
		}
		
		int a2[] = new int[3];
		
		for (int i = 0; i < a2.length; i++){
			System.out.println(a2[i]);
		}
		
		int[] a3 = {1,2,3};
		
		for (int i =0; i < a3.length; i++) {
			System.out.println(a3[i]);
		}
		
		System.out.println("The value of the first item is : " + a3[0]);
	}

}
