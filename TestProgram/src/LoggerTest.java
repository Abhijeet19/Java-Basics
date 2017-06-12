// import java.util.logging.Logger; 
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/*
public class LoggerTest {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
	
	public static void main(String[] args){
		logger.info("Star app:");
		System.out.println("Hello World!!!");
		logger.info("End app...");
	}
	

}
*/

import org.apache.log4j.*;

public class LoggerTest {
	
	static final Logger logger = Logger.getLogger(LoggerTest.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.debug("Hello World.....");
	}
	
}