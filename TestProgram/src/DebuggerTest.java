import java.net.URI;
import java.net.URISyntaxException;

public class DebuggerTest {
	public static void main(String[] args) {
		
		try {
			URI uri = new URI("http:\\www.google.com");
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		 
		System.out.print("I am still alive!");

	}

}
