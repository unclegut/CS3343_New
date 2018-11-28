package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.MixSuit;
import mahJong.Hand;

public class UnitTest_MixSuit {

	@Test
	public void testMixSuit() { // 混一色
		Hand hand = new Hand('e', 'e',
				new String[] { "d1", "d1", "d1", "d2", "d3", "d4", "d5", "d5", "d5", "d6", "d7", "d8", "_0", "_0" });
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(true, result);
	}

	@Test
	public void testMixSuit2() { // 混一色 false (d9 : getRank() != '0')
		Hand hand = new Hand('e', 'e',
				new String[] { "c1", "c1", "c1", "c2", "c3", "c4", "c5", "c5", "c5", "c6", "c7", "c8", "d9", "d9" });
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(false, result);
	}

	@Test
	public void testMixSuit3() { // true (not in order)

		Hand hand = new Hand('e', 'e',
				new String[] { "e0", "e0", "e0", "s0", "s0", "s0", "w0", "w0", "w0", "n0", "n0", "n0", "c1", "c1" });
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(true, result);
	}

	@Test
	public void testMixSuit4() { // 混一色 false, all honor tiles
		Hand hand = new Hand('e', 'e',
				new String[] { "e0", "e0", "e0", "s0", "s0", "s0", "w0", "w0", "w0", "n0", "n0", "n0", "_0", "_0" });
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(false, result);
	}
	
	@Test
	public void testMixSuit5() { // 混一色 false, same suit
		Hand hand = new Hand('e', 'e',
				new String[] { "d1","d1","d1","d2","d3","d4","d5","d5","d5",
						"d6","d7","d8","d9","d9" });
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(false, result);
	}
	
	@Test
	public void testMixSuit6() { // Branches case 
		Hand hand = new Hand('e', 'e',
				new String[] { "b1","d1","d1","d2","d3","d4","d5","d5","d5","d6","d7","d8","d9","d9" });
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(false, result);
	}
	@Test
	public void testMixSuit7() { // Branches case n 
		Hand hand = new Hand('e', 'e',
				new String[] { "d1", "d1", "d1", "d2", "d3", "d4", "d5", "d5", "d5", "d6", "d7", "d8", "n0", "n0" });
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(true, result);
	}
	@Test
	public void testMixSuit8() { // Branches case e
		Hand hand = new Hand('e', 'e',
				new String[] { "d1", "d1", "d1", "d2", "d3", "d4", "d5", "d5", "d5", "d6", "d7", "d8", "e0", "e0" });
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(true, result);
	}
	@Test
	public void testMixSuit9() { // Branches case s
		Hand hand = new Hand('e', 'e',
				new String[] { "d1", "d1", "d1", "d2", "d3", "d4", "d5", "d5", "d5", "d6", "d7", "d8", "s0", "s0" });
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(true, result);
	}
	@Test
	public void testMixSuit10() { // Branches case w
		Hand hand = new Hand('e', 'e',
				new String[] { "d1", "d1", "d1", "d2", "d3", "d4", "d5", "d5", "d5", "d6", "d7", "d8", "w0", "w0" });
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(true, result);
	}
	@Test
	public void testMixSuit11() { // Branches case r 
		Hand hand = new Hand('e', 'e',
				new String[]  { "d1", "d1", "d1", "d2", "d3", "d4", "d5", "d5", "d5", "d6", "d7", "d8", "r0", "r0" });
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(true, result);
	}
	@Test
	public void testMixSuit12() { // Branches case g
		Hand hand = new Hand('e', 'e',
				new String[]{ "d1", "d1", "d1", "d2", "d3", "d4", "d5", "d5", "d5", "d6", "d7", "d8", "g0", "g0" });
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(true, result);
	}

} 
