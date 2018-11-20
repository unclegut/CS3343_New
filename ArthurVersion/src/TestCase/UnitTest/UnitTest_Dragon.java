package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import HandPattern.GreenDragon;
import HandPattern.RedDragon;
import HandPattern.WhiteDragon;
import MahJong.Hand;

public class UnitTest_Dragon {

	@Test
	public void testRedDragon() { //紅中
		Hand hand = new Hand('E','E',new String[]{"r0","r0","r0","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","_0","_0"});
		RedDragon redDragon = new RedDragon();
		boolean result = redDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testRedDragon2() { //紅中 false
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","_0","_0"});
		RedDragon redDragon = new RedDragon();
		boolean result = redDragon.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testGreenDragon() { //發財
		Hand hand = new Hand('E','E',new String[]{"g0","g0","g0","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","_0","_0"});
		GreenDragon greenDragon = new GreenDragon();
		boolean result = greenDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testGreenDragon2() { //發財 false
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","_0","_0"});
		GreenDragon greenDragon = new GreenDragon();
		boolean result = greenDragon.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testWhiteDragon() { //白板
		Hand hand = new Hand('E','E',new String[]{"_0","_0","_0","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","r0","r0"});
		WhiteDragon whiteDragon = new WhiteDragon();
		boolean result = whiteDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testWhiteDragon2() { //白板 false
		Hand hand = new Hand('E','E',new String[]{"g0","g0","g0","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","r0","r0"});
		WhiteDragon whiteDragon = new WhiteDragon();
		boolean result = whiteDragon.checkPattern(hand);
		assertEquals(false,result);
	}

}
