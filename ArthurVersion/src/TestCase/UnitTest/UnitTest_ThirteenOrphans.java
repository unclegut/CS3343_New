package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.ThirteenOrphans;
import mahJong.Hand;

public class UnitTest_ThirteenOrphans {

	@Test
	public void testThirteenOrphans() {//�Q�T�\
		Hand hand = new Hand('e','e',new String[]{"c1","c9","b1","b9","d1","d9","n0","e0","s0",
				"w0","r0","g0","_0","_0"});
		ThirteenOrphans thirteenOrphans = new ThirteenOrphans();
		boolean result = thirteenOrphans.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testThirteenOrphans2() {//�Q�T�\ false
		Hand hand = new Hand('e','e',new String[]{"c2","c2","b2","b2","d2","d2","c3","c3","c3",
				"c4","c4","c4","c5","c5"});
		ThirteenOrphans thirteenOrphans = new ThirteenOrphans();
		boolean result = thirteenOrphans.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testThirteenOrphans3() {// Invalid hand
		Hand hand = new Hand('e','e',new String[]{"c1","c9","b1","b9","d1","d9","n0","e0","s0",
				"w0","r0","g0","_0"});
		ThirteenOrphans thirteenOrphans = new ThirteenOrphans();
		boolean result = thirteenOrphans.checkPattern(hand);
		assertEquals(false,result);
	}

} 
