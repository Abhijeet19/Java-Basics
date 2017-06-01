
public class MultiDimentionalArrayTest {
	
	public static void main(String[] args) {
		
		String[][] states = new String[3][2];
		
		states[0][0] = "California";
		states[0][1] = "Sacramento";
		states[1][0] = "Omaha";
		states[1][1] = "Salem";
		states[2][0] = "Washington";
		states[2][1] = "Olympia";
		
		
		for (int i = 0; i < states.length; i++) {
			
			StringBuilder sb = new StringBuilder();
//			System.out.println("Length 1:" + states.length);
			
			for (int j = 0; j < states[i].length; j++) {
//				System.out.println("Length 2 :" + states[i].length);
				
				if (j == 0) {
					System.out.print("The capitol of the state ");
				} else {
					sb.append(" is ");
				}							
				sb.append(states[i][j]);				
			}			
			System.out.println(sb);			
		}		
		
		/* 
		 *  same out put with my logic.
		 
		for (int i = 0; i < 3; i++) {
								
			for (int j = 0; j < 2; j++) {
				if (j != 1) {
					System.out.print("The capital of the state ");
					System.out.print(states[i][j]);
					System.out.print(" is ");
				}else {
					System.out.print(states[i][j]);
				}				
			}
			System.out.println();		
		}
		*/

	}

}
