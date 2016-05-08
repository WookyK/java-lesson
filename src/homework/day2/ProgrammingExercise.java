package homework.day2;

import static org.junit.Assert.*;

import java.awt.Rectangle;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

public class ProgrammingExercise {
	final public static double PI = 3.14; 
	
	@Test
	public void testName() throws Exception {
		Rectangle rect = new Rectangle(10, 10); 
		double area = 2 * rect.getWidth() + 2 * rect.getHeight();
		Assert.assertTrue(area == 40);
	}
	@Test
	public void testName1() throws Exception {
		Rectangle rect = new Rectangle(10, 10);
		System.out.println(rect.getSize());
	}
	
	@Test
	public void testName2() throws Exception {
		Rectangle rect = new Rectangle(100, 100);
		double area = rect.getWidth() * rect.getHeight();
		Assert.assertTrue(area == 10000);
	}
	
	@Test
	public void testName3() throws Exception {
		Rectangle rect = new Rectangle(20, 40);
		System.out.println(rect.getWidth());
	}
	@Test
	public void testName4() throws Exception {
		Rectangle rect = new Rectangle(102067, 900);
		System.out.println(rect.getBounds2D());
	
	}
	
	@Test
	public void testName5() throws Exception {
		GregorianCalendar cal = new GregorianCalendar(2000, Calendar.AUGUST, 21);
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekday);
	
	}
	
	@Test
	public void testName6() throws Exception {
		GregorianCalendar cal = new GregorianCalendar(2000,Calendar.AUGUST, 21);
		cal.add(Calendar.DAY_OF_MONTH, 10000 );
		int date = cal.get(Calendar.DATE);
		System.out.println(date);
		
	}
	@Test
	public void testName7() throws Exception {
		Rectangle rect = new Rectangle (20,40);
		System.out.println(rect.getHeight());
		
	}
	
}
