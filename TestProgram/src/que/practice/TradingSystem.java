package que.practice;

public class TradingSystem {
	private static String category = "electronic trading system";
    public static void main(String[] args) throws ClassNotFoundException {
//    	Class.forName("TestClass");
    	try {
    		Class.forName("TestClass");
    	} catch (Exception e) {
    		
			System.out.println("Test Exception");
			e.printStackTrace();
		}
        TradingSystem system = null;
        System.out.println(system.category);
    }

}
