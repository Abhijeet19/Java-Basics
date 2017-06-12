package com.test.property;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileTest {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {			
			prop.load(new FileInputStream("G:/config.properties"));
			
			String deptName = "Financial Cards";
			
			deptName = (deptName.replace(" ", "#")).toUpperCase(); 
			
			System.out.println("Department Name: " + deptName);
			
			String value = prop.getProperty(deptName);
			System.out.println(value);			
		} catch (Exception e) {
			System.out.println("The File is not found.");
		}		
	}
}
