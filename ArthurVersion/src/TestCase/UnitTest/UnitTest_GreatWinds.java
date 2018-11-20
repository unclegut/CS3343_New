package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import HandPattern.GreatWinds;
import MahJong.Hand;

public class UnitTest_GreatWinds {

	@Test
	public void testGreatWinds() {//大四喜
		Hand hand = new Hand('e','e',new String[]{"e0","e0","e0","s0","s0","s0","w0","w0","w0",
				"n0","n0","n0","c1","c1"});
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testGreatWinds2() {//大四喜 false
		Hand hand = new Hand('e','e',new String[]{"c2","c2","b2","b2","d2","d2","c3","c3","c3",
				"c4","c4","c4","c5","c5"});
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
}
