package com.test.property;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


public class PropertyFileTestMultiValue {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("G:/multiValue.properties"));	
			
//			String first = prop.getProperty("abhijeet#email");
//			System.out.println(first);
			
			Set<Object> keys = prop.keySet();
			Iterator<Object> iterator = keys.iterator();
			
			while (iterator.hasNext()) {
				String value = iterator.next().toString();			
				String pattern = ".*[#].*";
				String keyValue = null;
				
				if (value.matches(pattern)) {
					keyValue = value.replace("#", " ");					
				}
			
				System.out.print("The key :" + keyValue);				
				System.out.println(" has value :" + prop.get(value));
			}
			
		} catch (Exception e) {
			System.out.println("File not found!");			
		}
		
		
		
	}

}
