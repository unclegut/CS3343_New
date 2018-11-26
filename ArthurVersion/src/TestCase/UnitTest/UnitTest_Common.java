package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.Chicken;
import handPattern.CommonHand;
import mahJong.Hand;

public class UnitTest_Common {

	
	@Test
	public void testCommonHand1() {		// True: Eye x 1
		Hand hand = new Hand('e','e',new String[]{"c1","c2","c3","c5","c6","c7","b1","b2","b3",
				"d5","d6","d7","r0","r0"});
		CommonHand commonHand = new CommonHand();
		boolean result = commonHand.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testCommonHand2() {		// True: Eye x 2
		Hand hand = new Hand('e','e',new String[]{"c1","c2","c3","c3","c4","c5","b1","b2","b3",
				"d5","d6","d7","r0","r0"});
		CommonHand commonHand = new CommonHand();
		boolean result = commonHand.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testCommonHand3() {		// Unsorted hand
		Hand hand = new Hand('e','e',new String[]{"b9","d8","b7","c3","c4","c5","b2","b1","b3",
				"r0","r0","d7","d9","b8"});
		CommonHand commonHand = new CommonHand();
		boolean result = commonHand.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testCommonHand4() {		// False: Sequences not match
		Hand hand = new Hand('e','e',new String[]{"c1","c2","c3","c6","c7","c9","b2","b4","b5",
				"d5","d6","d7","b8","b8"});
		CommonHand commonHand = new CommonHand();
		boolean result = commonHand.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testCommonHand5() {		// False: Contains triplets
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","c6","c6","c6","b2","b2","b2",
				"d5","d5","d5","b8","b8"});
		CommonHand commonHand = new CommonHand();
		boolean result = commonHand.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testCommonHand6() {		// False: Matches rank, but not match suit
		Hand hand = new Hand('e','e',new String[]{"c1","c2","c3","c3","c4","c5","c5","c6","c7",
				"c7","c8","b9","_0","_0"});
		CommonHand commonHand = new CommonHand();
		boolean result = commonHand.checkPattern(hand);
		assertEquals(false,result);
	}

}
