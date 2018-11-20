package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import HandPattern.SameSuit;
import MahJong.Hand;

public class UnitTest_SameSuit {

	@Test
	public void testSameSuit() { //清一色
		Hand hand = new Hand('e','e',new String[]{"d1","d1","d1","d2","d3","d4","d5","d5","d5",
				"d6","d7","d8","d9","d9"});
		SameSuit sameSuit = new SameSuit();
		boolean result = sameSuit.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSameSuit2() { //清一色 not all the suit are the same
		Hand hand = new Hand('e','e',new String[]{"d1","c1","d1","d2","d3","d4","d5","d5","d5",
				"d6","d7","d8","d9","d9"});
		SameSuit sameSuit = new SameSuit();
		boolean result = sameSuit.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testSameSuit3() { //清一色 the first suit is not c/b/d
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		SameSuit sameSuit = new SameSuit();
		boolean result = sameSuit.checkPattern(hand);
		assertEquals(false,result);
	}

}
