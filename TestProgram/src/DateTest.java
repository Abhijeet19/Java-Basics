import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class DateTest {
	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println("Date :" + dt);
		
		GregorianCalendar gc = new GregorianCalendar(2009,1,28);
		gc.add(GregorianCalendar.DATE,1);
		Date d2 = gc.getTime();
		
		System.out.println("Date 2 : " + d2);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String sd = df.format(d2);
		System.out.println("Date 3 : " + sd);
		
		
	}

}
