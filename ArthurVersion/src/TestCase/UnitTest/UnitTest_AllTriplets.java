package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.AllinTriplets;
import mahJong.Hand;

public class UnitTest_AllTriplets {

	@Test
	public void testAllInTriplet() { //對對糊
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","b1","b1","b1","d1","d1","d1",
				"d2","d2","d2","d3","d3"});
		AllinTriplets allinTriplets = new AllinTriplets();
		boolean result = allinTriplets.checkPattern(hand);
		assertEquals(true,result);
	}
	
	
	@Test
	public void testAllInTriplet2() { //對對糊 false
		Hand hand = new Hand('e','e',new String[]{"c2","c2","b2","b2","d2","d2","c3","c3","c3",
				"c4","c4","c4","c5","c5"});
		AllinTriplets allinTriplets = new AllinTriplets();
		boolean result = allinTriplets.checkPattern(hand);
		assertEquals(false,result);
	}

}
