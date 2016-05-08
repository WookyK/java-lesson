package homework.day6;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class ArrayTutorial {
	private int[] array = new int[10];
	private ArrayList<Integer> arrayList = new ArrayList<>();

	/** 7.6.2 **/
	private int sum = 0;
	private double average = 0;

	// 7.6.2
	public void computingSumAndAverageValue() {
		List<Integer> values = new ArrayList<Integer>();
		generateSampleList(values);
		
		for (Integer integer : values) { //for each integer in values
			sum += integer; // means "sum = sum + integer"
		}
		System.out.println("sum : " + sum);
		average = (double)sum / values.size();
		System.out.println("avg : " + average);
	}

	private void generateSampleList(List<Integer> values) {
		values.add(10324);
		values.add(242);
		values.add(1231411);
		values.add(983434);
		values.add(1031224);
		values.add(24322);
		values.add(98);
		values.add(0);
	}



	/**
	 * 
	 * @return index of the lowest value
	 */
	public int searchTheLowestValuesIdxInList() {
		int indexOfTheLowestValue = -1;
		List<Integer> values = new ArrayList<Integer>();
		generateSampleList(values);

		int tempVal = values.get(0);
		int tempIdx = 0;

		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) < tempVal ) {
				tempVal = values.get(i);
				tempIdx = i;
			}
		}
		indexOfTheLowestValue = tempIdx;
		/// end
		return indexOfTheLowestValue;
	}
	
	public int searchKeyValueInList(int key) {
		int indexOfKey = -1;
		List<Integer> values = new ArrayList<Integer>();
		generateSampleList(values);
		int tempIdx = -1;
		for (int i = 0; i < values.size(); i++) {
			if (key == values.get(i)) {
				tempIdx = i;
				break;
			}
		}
		indexOfKey = tempIdx;
		return indexOfKey;
	}

	
	@Test
	public void testSearchKeyValueInList() throws Exception {
		Scanner sc = new Scanner(System.in);
		int result = searchKeyValueInList(0);
		assertThat(result, is(7));
	}
	
	@Test
	public void testSearchKeyValueInListFailCase() throws Exception {
		int result = searchKeyValueInList(-8);
		assertThat(result, is(-1));
	}
	
	@Test
	public void testFillingTheArrayWithTwo() throws Exception {
		//		fillingTheArrayWithTwo();
		for (int i : array) {
			assertThat(i, is(2));
		}
	}

	@Test
	public void testFillingTheArrayWithFour() throws Exception {
		//		fillingTheArrayWithFour();
		assertThat((Integer)arrayList.size(), is(10));
		for (Integer i : arrayList) {
			assertThat(i, is(4));
		}
	}

	@Test
	public void testComputingSumAndAverageValue() throws Exception {
		computingSumAndAverageValue();
		assertThat(sum, is(3281055));
		assertThat(average, is(410131.875));
	}

	@Test
	public void testSearchTheLowestValuesIdxInList() throws Exception {
		int result = searchTheLowestValuesIdxInList();
		assertThat(result, is(7));
	}

	@Test
	public void testSearchPrimeNumber() throws Exception {
		//		int result = searchPrimeNumber();
		//		assertThat(result, is(2));
	}	
}
