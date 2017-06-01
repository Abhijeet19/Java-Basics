
public class NullTest {

	
	public static void main(String[] args) {
		String a=null;
		
		System.out.println(a);
		
		try {
			if (a!=null & a.length()>10) {
			System.out.println("Success");
			}
			else {
			System.out.println("Failure");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
