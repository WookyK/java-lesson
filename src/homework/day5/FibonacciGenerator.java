package homework.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciGenerator {
	/**
	 * fibonacci sequennce
	 * 1,1,2,3,5,8,13 ....
	 */
	
	private int nth = 1;
	private int fibonacciOld1 = 1;
	private int fibonacciOld2 = 1;
	
	public int nextNumber() {
		int result;
		if ( nth == 1 || nth == 2) {
			result = 1;
		} else{
			result = fibonacciOld1 + fibonacciOld2;
		}
		nth++;
		fibonacciOld1 = fibonacciOld2;
		fibonacciOld2 = result;
		
		return result;
	}
	@Test
	public void testNextNumber() throws Exception {
//		for (int i = 0; i < 5; i++) {
//			System.out.println(nextNumber());
//		*i = i + 2 <---adds up by two
//		}
		int i = 0;
		while (i < 5){
			System.out.println(nextNumber());
			i++;
		}
	}
}
