import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;


public class IteratorTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("California");
		list.add("Oregon");
		list.add("Wahington");
		System.out.println(list);
		
		ListIterator<String> listIterator = list.listIterator();
		
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());			
		}
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("California", "Sacramento");
		map.put("Oregon", "Salem");
		map.put("Washington","Olympia");
		
		System.out.println(map);
		Set<String> keys = map.keySet();
		Iterator<String> iterator = keys.iterator();
				
		while (iterator.hasNext()) {
			String value = iterator.next();
			
			System.out.print("The capital of the state " + value);
			System.out.println(" is " + map.get(value));	
			
		}

	}

}
