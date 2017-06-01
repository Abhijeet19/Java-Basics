import java.util.Arrays;


public class ArraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int array[] = {2,11,5,1,4,7};
	// {1,2,4,5,7,11} = 11+4 = 1+2+5+7
	
	/*
	 * solution is sort in ascending order
	 *  find the maximum number
	 *  start addition of the maximum number with the lowest number
	 *  calculate the sum of the rest numbers is it equal to the sum of 
	 *  the max number + first lowest number
	 *  if not proceed with the second number
	 */
	
	Arrays.sort(array);
	System.out.print(" " + array[array.length - 1]);
	int sumOfTwo = 0;
	int sumOfRest;
	
	for(int i=0; i<array.length; i++) {
		System.out.println("@"+array[i]);
		sumOfTwo = array[array.length-1] + array[i];
		System.out.println("sumOfTwo :: " + sumOfTwo);
		sumOfRest = 0;
		for(int j=0; j < (array.length-1); j++) {			
			if(i!=j) {
				sumOfRest += array[j];
			}
		}
		System.out.println("sumOfRest :: " + sumOfRest);		
	}
	
	}
}
