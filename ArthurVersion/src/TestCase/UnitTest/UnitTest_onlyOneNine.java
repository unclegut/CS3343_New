package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import HandPattern.OnlyOneNine;
import MahJong.Hand;

public class UnitTest_onlyOneNine {

	@Test
	public void testOnlyOneNine() { //清么九
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
	
	@Test
	public void testOnlyOneNine4() { //清么九 false (not 對對糊)
		Hand hand = new Hand('e','e',new String[]{"c1","c9","b1","b9","d1","d9","n0","e0","s0",
				"w0","r0","g0","_0","_0"});
		OnlyOneNine onlyOneNine = new OnlyOneNine();
		boolean result = onlyOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	

}
