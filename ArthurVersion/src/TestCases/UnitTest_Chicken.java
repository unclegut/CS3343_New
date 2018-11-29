package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.Chicken;
import handPattern.SmallDragon;
import mahJong.Hand;

public class UnitTest_Chicken {

	@Test
	public void testChicken1() {		// True: Sequence x 4
		Hand hand = new Hand('e','e',new String[]{"c1","c2","c3","c4","c5","c6","b1","b2","b3",
				"d7","d8","d9","r0","r0"});
		Chicken chicken = new Chicken();
		boolean result = chicken.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testChicken2() {		// True: Triplets x 4
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","c4","c4","c4","b7","b7","b7",
				"d8","d8","d8","r0","r0"});
		Chicken chicken = new Chicken();
		boolean result = chicken.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testChicken3() {		// True: Sequence x 2, Triplets x 2
		Hand hand = new Hand('e','e',new String[]{"c1","c2","c3","c4","c4","c4","b7","b8","b9",
				"d8","d8","d8","c9","c9"});
		Chicken chicken = new Chicken();
		boolean result = chicken.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testChicken4() {		// False: Sequences not match
		Hand hand = new Hand('e','e',new String[]{"b1","b2","b3","c6","c7","c9","d2","d4","d5",
				"b5","b6","b7","c8","c8"});
		Chicken chicken = new Chicken();
		boolean result = chicken.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testChicken5() {		// True: Matches rank, but not match suit
		Hand hand = new Hand('e','e',new String[]{"d1","d2","d3","d3","d4","d5","d5","d6","d7",
				"d7","d8","c9","g0","g0"});
		Chicken chicken = new Chicken();
		boolean result = chicken.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testChicken6() {		// Branches case
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c2","c4","c4","c4","b7","b7","b7",
				"d8","d8","d8","r0","r0"});
		Chicken chicken = new Chicken();
		boolean result = chicken.checkPattern(hand);
		assertEquals(false,result);
	} 
	

}
