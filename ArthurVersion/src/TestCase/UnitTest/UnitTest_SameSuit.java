package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.SameSuit;
import mahJong.Hand;

public class UnitTest_SameSuit {

	@Test
	public void testSameSuit() { //�M�@�� d
		Hand hand = new Hand('e','e',new String[]{"d1","d1","d1","d2","d3","d4","d5","d5","d5",
				"d6","d7","d8","d9","d9"});
		SameSuit sameSuit = new SameSuit();
		boolean result = sameSuit.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSameSuit2() { //�M�@�� b
		Hand hand = new Hand('e','e',new String[]{"b1","b1","b1","b2","b3","b4","b5","b5","b5",
				"b6","b7","b8","b9","b9"});
		SameSuit sameSuit = new SameSuit();
		boolean result = sameSuit.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSameSuit3() { //�M�@�� c
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","c2","c3","c4","c5","c5","c5",
				"c6","c7","c8","c9","c9"});
		SameSuit sameSuit = new SameSuit();
		boolean result = sameSuit.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSameSuit4() { //�M�@�� not all the suit are the same
		Hand hand = new Hand('e','e',new String[]{"c1","c9","d1","d2","d3","d4","d5","d5","d5",
				"d6","d7","d8","d9","d9"});
		SameSuit sameSuit = new SameSuit();
		boolean result = sameSuit.checkPattern(hand);
		assertEquals(false,result);
	} 
	
	@Test
	public void testSameSuit5() { //�M�@�� the first suit is not c/b/d
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		SameSuit sameSuit = new SameSuit();
		boolean result = sameSuit.checkPattern(hand);
		assertEquals(false,result);
	}

}
