import java.io.CharArrayReader;


public class TestObject {
	public static void main(String args[]) {
		String object = "abcdefgh";
		int objectLength = object.length();
		char c[] = new char[objectLength];
		
		object.getChars(0, objectLength, c, 0);
		CharArrayReader input1 = new CharArrayReader(c);
		CharArrayReader input2 = new CharArrayReader(c, 1, 4);
		int i;
		int j;
		
		try{
			while((i = input1.read()) == (j=input2.read())) {
				System.out.println((char)i);
			}
				
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
