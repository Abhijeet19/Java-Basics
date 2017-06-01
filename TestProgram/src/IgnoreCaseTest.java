import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class IgnoreCaseTest {
	public static void main(String[] args) {
		String dbValue = "Financial Cards";
		String actualvalue = "FINANCIAL CARDS";
		
		if(dbValue.equalsIgnoreCase(actualvalue)){
			System.out.println("Equals...");
		} else {
			System.out.println("Not equals...");
		}
		
		dbValue = (dbValue).toUpperCase();
		
		System.out.println("dbValue: " + dbValue);
		
		actualvalue = (actualvalue).toUpperCase();
		
		System.out.println("actualValue :" + actualvalue);
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("one", "Financial Cards");
		hm.put("two", "FINANCIAL CARDS");
		
		Set<String> key = hm.keySet();
		Iterator<String> it = key.iterator();
		
		while(it.hasNext()) {
			String value = it.next();
			System.out.println("Map: " + value);
		}
		
	}
}
