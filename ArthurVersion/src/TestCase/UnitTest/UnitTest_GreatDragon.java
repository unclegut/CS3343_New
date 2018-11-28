package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.GreatDragon;
import mahJong.Hand;

public class UnitTest_GreatDragon {

	@Test
	public void testGreatDragon() { //大三元
		Hand hand = new Hand('e','e',new String[]{"r0","r0","r0","g0","g0","g0","_0","_0","_0",
				"c6","c7","c8","e0","e0"});
		GreatDragon greatDragon = new GreatDragon();
		boolean result = greatDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testGreatDragon2() { //大三元 false
		Hand hand = new Hand('e','e',new String[]{"c2","c2","b2","b2","d2","d2","c3","c3","c3",
				"c4","c4","c4","c5","c5"});
		GreatDragon greatDragon = new GreatDragon();
		boolean result = greatDragon.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testGreatDragon3() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"c1","c2","c3","g0","g0","g0","_0","_0","_0",
				"c6","c7","c8","e0","e0"});
		GreatDragon greatDragon = new GreatDragon();
		boolean result = greatDragon.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testGreatDragon4() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"r0","r0","r0","c1","c2","c3","_0","_0","_0",
				"c6","c7","c8","e0","e0"});
		GreatDragon greatDragon = new GreatDragon();
		boolean result = greatDragon.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testGreatDragon5() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"r0","r0","r0","g0","g0","g0","c1","c2","c3",
				"c6","c7","c8","e0","e0"});
		GreatDragon greatDragon = new GreatDragon();
		boolean result = greatDragon.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testGreatDragon6() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"c1","r0","r0","g0","g0","g0","_0","_0","_0",
				"c6","c7","c8","e0","e0"});
		GreatDragon greatDragon = new GreatDragon();
		boolean result = greatDragon.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testGreatDragon7() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"r0","r0","r0","c1","g0","g0","_0","_0","_0",
				"c6","c7","c8","e0","e0"});
		GreatDragon greatDragon = new GreatDragon();
		boolean result = greatDragon.checkPattern(hand);
		assertEquals(false,result);
	} 
	@Test
	public void testGreatDragon8() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"r0","r0","r0","g0","g0","g0","c1","_0","_0",
				"c6","c7","c8","e0","e0"});
		GreatDragon greatDragon = new GreatDragon();
		boolean result = greatDragon.checkPattern(hand);
		assertEquals(false,result);
	}

}
