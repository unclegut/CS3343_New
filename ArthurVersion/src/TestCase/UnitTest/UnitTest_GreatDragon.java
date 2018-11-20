package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import HandPattern.GreatDragon;
import MahJong.Hand;

public class UnitTest_GreatDragon {

	@Test
	public void testGreatDragon() { //大三元
		Hand hand = new Hand('E','E',new String[]{"r0","r0","r0","g0","g0","g0","_0","_0","_0",
				"c6","c7","c8","e0","e0"});
		GreatDragon greatDragon = new GreatDragon();
		boolean result = greatDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testGreatDragon2() { //大三元 false
		Hand hand = new Hand('E','E',new String[]{"c2","c2","b2","b2","d2","d2","c3","c3","c3",
				"c4","c4","c4","c5","c5"});
		GreatDragon greatDragon = new GreatDragon();
		boolean result = greatDragon.checkPattern(hand);
		assertEquals(false,result);
	}

}
