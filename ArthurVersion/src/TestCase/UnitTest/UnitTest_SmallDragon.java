package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import HandPattern.SmallDragon;
import MahJong.Hand;

public class UnitTest_SmallDragon {

	@Test
	public void testSmallDragon() { //�p�T�� r0*3 g0*3 _0*2
		Hand hand = new Hand('e','e',new String[]{"r0","r0","r0","g0","g0","g0","_0","_0","d1",
				"d1","d1","d2","d2","d2"});
		SmallDragon smallDragon = new SmallDragon();
		boolean result = smallDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallDragon2() { //�p�T�� r0*3 g0*2 _0*3
		Hand hand = new Hand('e','e',new String[]{"r0","r0","r0","g0","g0","_0","_0","_0","d1",
				"d1","d1","d2","d2","d2"});
		SmallDragon smallDragon = new SmallDragon();
		boolean result = smallDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallDragon3() { //�p�T�� r0*2 g0*3 _0*3
		Hand hand = new Hand('e','e',new String[]{"r0","r0","g0","g0","g0","_0","_0","_0","d1",
				"d1","d1","d2","d2","d2"});
		SmallDragon smallDragon = new SmallDragon();
		boolean result = smallDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallDragon4() { //�p�T�� false 
		Hand hand = new Hand('e','e',new String[]{"r0","r0","g0","g0","g0","c1","c1","c1","d1",
				"d1","d1","d2","d2","d2"});
		SmallDragon smallDragon = new SmallDragon();
		boolean result = smallDragon.checkPattern(hand);
		assertEquals(false,result);
	}

}
