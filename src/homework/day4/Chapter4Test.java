package homework.day4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Chapter4Test {
	private Chapter4 ch4 = new Chapter4();
	
	@Test
	public void testFooMethod() {
		System.out.println(ch4.foo(2, 4));		
	}

	@Test
	public void testKeyIn() throws Exception {
		ch4.getParametersOfBlah();	
	} 
}
