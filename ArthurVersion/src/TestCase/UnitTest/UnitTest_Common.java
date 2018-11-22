package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import HandPattern.Chicken;
import HandPattern.CommonHand;
import MahJong.Hand;

public class UnitTest_Common {

	
	@Test
	public void testCommonHand0() { //not in order
		Hand hand = new Hand('e','e',new String[]{"c1","c3","c2","c6","c5","c7","b1","b2","b3",
				"d5","d6","r0","d7","r0"});
		CommonHand commonHand = new CommonHand();
		boolean result = commonHand.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testCommonHand1() {
		Hand hand = new Hand('e','e',new String[]{"c1","c2","c3","c5","c6","c7","b1","b2","b3",
				"d5","d6","d7","r0","r0"});
		CommonHand commonHand = new CommonHand();
		boolean result = commonHand.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testCommonHand2() {
		Hand hand = new Hand('e','e',new String[]{"c1","c2","c3","c3","c4","c5","b1","b2","b3",
				"d5","d6","d7","r0","r0"});
		CommonHand commonHand = new CommonHand();
		boolean result = commonHand.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testCommonHand3() {
		Hand hand = new Hand('e','e',new String[]{"c1","c2","c3","c3","c4","c5","b1","b2","b3",
				"d5","d6","d7","b8","b8"});
		CommonHand commonHand = new CommonHand();
		boolean result = commonHand.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testCommonHand4() {
		Hand hand = new Hand('e','e',new String[]{"c1","c3","c4","c5","c7","c8","b1","b2","b3",
				"d5","d6","d7","b8","b8"});
		CommonHand commonHand = new CommonHand();
		boolean result = commonHand.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testCommonHand5() {
		Hand hand = new Hand('e','e',new String[]{"c3","c3","c3","c5","c7","c8","b1","b2","b3",
				"d5","d6","d7","b8","b8"});
		CommonHand commonHand = new CommonHand();
		boolean result = commonHand.checkPattern(hand);
		assertEquals(false,result);
	}

}
