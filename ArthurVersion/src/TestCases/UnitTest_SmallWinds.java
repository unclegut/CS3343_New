package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.SmallWinds;
import mahJong.Hand;

public class UnitTest_SmallWinds {

	@Test
	public void testSmallWinds() { //小四喜 2333
		Hand hand = new Hand('e','e',new String[]{"n0","n0","e0","e0","e0","s0","s0","s0","w0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallWinds2() { //小四喜 3233
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","s0","s0","s0","w0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallWinds3() { //小四喜 3323
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","s0","s0","w0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallWinds4() { //小四喜 3332
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","s0","s0","s0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(true,result);
	}	
	
	@Test
	public void testSmallWinds5() { //小四喜 not 3332 structure, else return false
		Hand hand = new Hand('e','e',new String[]{"c1","n0","n0","e0","e0","e0","s0","s0","s0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}	
	
	@Test
	public void testSmallWinds6() { //小四喜 return false
		Hand hand = new Hand('e','e',new String[]{"d1","d1","d1","d2","d3","d4","d5","d5","d5",
			"d6","d7","d8","d9","d9"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}	
	
	@Test
	public void testSmallWinds7() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","e0","s0"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testSmallWinds8() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"w0","e0","s0"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testSmallWinds9() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"w0","e0","n0"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testSmallWinds10() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"w0","s0","n0"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	
	@Test
	public void testSmallWinds11() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","n0","c1","e0","e0","s0","s0","s0","w0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testSmallWinds12() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","n0","e0","e0","e0","c1","s0","s0","w0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testSmallWinds13() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","n0","e0","e0","e0","s0","s0","s0","c1",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testSmallWinds14() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","s0","s0","c1","w0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testSmallWinds15() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","s0","s0","s0","w0",
				"w0","c1","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testSmallWinds16() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","s0","s0","w0",
				"w0","c1","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	 
	@Test
	public void testSmallWinds17() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","s0","s0","s0",
				"w0","w0","w0","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}

}
