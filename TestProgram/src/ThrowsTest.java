
public class ThrowsTest {
	
	public static void main(String[] args ){
		
		try {
			getArrayItem();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Item was out of bond.");
		}
	}

	private static void getArrayItem() throws ArrayIndexOutOfBoundsException{
		String[] str = {"Welcome!"};
		System.out.println(str[1]);
	}

}
