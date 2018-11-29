package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.OnlyOneNine;
import mahJong.Hand;

public class UnitTest_onlyOneNine {

	/* Branch coverage */
	@Test
	public void testOnlyOneNine() { //清么九  23333 
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"c9","c9","c9","b1","b1"});
		OnlyOneNine onlyOneNine = new OnlyOneNine();
		boolean result = onlyOneNine.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testOnlyOneNine2() { //清么九 false (not 1 or 9)
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"c9","c9","c9","b2","b2"});
		OnlyOneNine onlyOneNine = new OnlyOneNine();
		boolean result = onlyOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testOnlyOneNine3() { //清么九 false (not c/b/d)
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"c9","c9","c9","_0","_0"});
		OnlyOneNine onlyOneNine = new OnlyOneNine();
		boolean result = onlyOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	
	/* Condition coverage : not 23333 */		
	@Test
	public void testOnlyOneNine4() { // get(0)== false
		Hand hand = new Hand('e','e',new String[]{"b1","b9","b9","b9","b9","c1","c1","c1","c9",
				"c9","c9","d1","d1","d1"});
		OnlyOneNine onlyOneNine = new OnlyOneNine();
		boolean result = onlyOneNine.checkPattern(hand);
		assertEquals(false,result);
	} 
	
	@Test
	public void testOnlyOneNine5() { // get(1)== false
		Hand hand = new Hand('e','e',new String[]{"b1","b1","b9","b9","c1","c1","c1","c1","c9",
				"c9","c9","d1","d1","d1"});
		OnlyOneNine onlyOneNine = new OnlyOneNine();
		boolean result = onlyOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testOnlyOneNine6() { // get(2)== false
		Hand hand = new Hand('e','e',new String[]{"b1","b1","b9","b9","b9","c1","c1","c1","c1",
				"c1","c1","c1","c1","c1"});
		OnlyOneNine onlyOneNine = new OnlyOneNine();
		boolean result = onlyOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testOnlyOneNine7() { // get(3)== false
		Hand hand = new Hand('e','e',new String[]{"b1","b1","b9","b9","b9","c1","c1","c1","c9",
				"c9","c9","c9","c9","c9"});
		OnlyOneNine onlyOneNine = new OnlyOneNine();
		boolean result = onlyOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testOnlyOneNine8() { // get(4)== false 23334 invalid hand 
		Hand hand = new Hand('e','e',new String[]{"b1","b1","b9","b9","b9","c1","c1","c1","c9",
				"c9","c9","d1","d1","d1","d1"});
		OnlyOneNine onlyOneNine = new OnlyOneNine();
		boolean result = onlyOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	

}
