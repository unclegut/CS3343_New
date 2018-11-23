package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.Chicken;
import handPattern.GreatWinds;
import mahJong.Hand;

public class UnitTest_handPattern {

	@Test
	public void testGetPoint() {
		Chicken chicken = new Chicken();
		int result = chicken.getPoint();
		assertEquals(0, result);
	}
	
	@Test
	public void testGetPoint2() { //maximum
		GreatWinds greatWinds = new GreatWinds();
		int result = greatWinds.getPoint();
		assertEquals(-1, result);
	}
	
	@Test
	public void testToString() {
		Chicken chicken = new Chicken();
		String result = chicken.toString();
		assertEquals("Chicken 0", result);
	}
	
	@Test
	public void testToString2() { //maximum
		GreatWinds greatWinds = new GreatWinds();
		String result = greatWinds.toString();
		assertEquals("GreatWinds Maximum", result);
	}
	
	

}
