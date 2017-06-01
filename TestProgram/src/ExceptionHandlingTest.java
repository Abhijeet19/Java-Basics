
public class ExceptionHandlingTest {
	
	public static void main(String[] args) {
		
//		try {
//			String[] s = {"Welcme!"};
//			System.out.println(s[1]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println("There is an error!");
//		}
//		
//		System.out.println("The application is still running!");
		
		try{
			String[] s ={"Welcome!"};
			System.out.println(s[1]);
		}catch (Exception e){
//			e.printStackTrace();
			System.out.print("There is an error!!!");
		}
		
		System.out.println("The application is still running!");
		
	}

}
