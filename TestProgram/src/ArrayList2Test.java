import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2Test {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("One");
		list.add("Three");
		list.add("Two");
		
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}		
		


	}

}
