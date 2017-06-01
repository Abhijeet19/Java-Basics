import java.util.HashMap;

/*
 * Given a mapping of alphabets to integers as follows:

1 = A
2 = B
3 = C
...
26 = Z

Given any combination of the mapping numbers as string, return the number of ways in which the input string can be split into sub-strings and represented as character strings. For e.g. given
"111" -> "AAA", "AK", "KA" -> 3
Valid combinations are ({1,1,1}, {1,11},{11,1}) = 3
"11" -> "AA", "K" -> 2
Valid combinations are ({1,1},{11}) = 2
"123" -> "ABC", "LC", "AW" -> 3
Valid combinations are ({1,2,3},{1,23},{12,3}) = 3

You don't have to return all the mappings, only the number of valid mappings.
 */

public class NumberCombination {
	public static void main(String args[]) {
		HashMap<Integer, String> code = new HashMap<Integer, String>();
		code.put(1, "A");
		code.put(2, "B");
		code.put(3, "C");
		code.put(12, "L");
		code.put(23, "W");
		
		int queryNumber = 123;
		
		
		
	}
}
