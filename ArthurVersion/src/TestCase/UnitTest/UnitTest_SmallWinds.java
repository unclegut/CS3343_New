package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import HandPattern.SmallWinds;
import MahJong.Hand;

public class UnitTest_SmallWinds {

	@Test
	public void testSmallWinds() { //�p�|�� 2333
		Hand hand = new Hand('e','e',new String[]{"n0","n0","e0","e0","e0","s0","s0","s0","w0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallWinds2() { //�p�|�� 3233
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","s0","s0","s0","w0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallWinds3() { //�p�|�� 3323
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","s0","s0","w0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallWinds4() { //�p�|�� 3332
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","s0","s0","s0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(true,result);
	}	
	
	@Test
	public void testSmallWinds5() { //�p�|�� not 3332 structure, else return false
		Hand hand = new Hand('e','e',new String[]{"c1","n0","n0","e0","e0","e0","s0","s0","s0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}	
	
	@Test
	public void testSmallWinds6() { //�p�|�� return false
		Hand hand = new Hand('e','e',new String[]{"d1","d1","d1","d2","d3","d4","d5","d5","d5",
			"d6","d7","d8","d9","d9"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}	

}
