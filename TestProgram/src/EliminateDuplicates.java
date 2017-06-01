import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class EliminateDuplicates {

	/**
	 * Amdocs
	 * eliminate duplicate elements from array
	 */
	public static void main(String[] args) {
		
		int a[] = new int[]{10,20,30,40,20,10};
		Set num = (Set) eliminateDuplicate(a);
		
		System.out.println("num : " + num);
	}
	
	public static Set eliminateDuplicate(int[] numbers) {
		System.out.println("Numbers : " + numbers);
//		List<int[]> list = new ArrayList<int[]>();		
//		list = Arrays.asList(numbers);
				ArrayList<Integer> list = new ArrayList<Integer>();
//		List<int[]> list = Arrays.asList(numbers);
		for (int i : numbers) {
			list.add(i);
		}
		System.out.println("List : " + list);
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.addAll(list);
		
		System.out.println("Eliminated Duplicate : " + set);
		
		
		
		return set;
		
	}

}
