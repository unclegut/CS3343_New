package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.GreatWinds;
import mahJong.Hand;

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
	
	@Test
	public void testGreatWinds3() {// Branches case
		Hand hand = new Hand('e','e',new String[]{"e0","e0","e0","s0","s0","s0","w0","w0","w0",
				"n0","n0","n0","c1","c2"}); 
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testGreatWinds4() {// Branches case
		Hand hand = new Hand('e','e',new String[]{"e0","e0","e0","s0","s0","s0","c2","w0","w0",
				"n0","n0","n0","c1","c2"});
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testGreatWinds5() {// Branches case
		Hand hand = new Hand('e','e',new String[]{"c0","e0","e0","s0","s0","s0","s2","w0","w0",
				"n0","n0","n0","c1","c2"}); 
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testGreatWinds6() {// Branches case
		Hand hand = new Hand('e','e',new String[]{"e0","e0","e0","c0","s0","s0","c2","w0","w0",
				"n0","n0","n0","c1","c2"});
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testGreatWinds7() {// Branches case
		Hand hand = new Hand('e','e',new String[]{"e0","e0","e0","c0","s0","s0","s2","c1","w0",
				"n0","n0","n0","c1","c2"});
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testGreatWinds8() {// Branches case
		Hand hand = new Hand('e','e',new String[]{"e0","e0","e0","c0","s0","s0","s2","c1","w0",
				"c2","n0","n0","c1","c2"}); 
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testGreatWinds9() {// Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","s0"});
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testGreatWinds10() {// Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","s0","e0"}); 
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(false,result);
	} 
	@Test
	public void testGreatWinds11() {// Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","w0","e0"});
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	
	
}
