package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.AllinTriplets;
import mahJong.Hand;

public class UnitTest_AllTriplets {

	@Test
	public void testAllInTriplet() { //對對糊 true
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","b1","b1","b1","d1","d1","d1",
				"d2","d2","d2","d3","d3"});
		AllinTriplets allinTriplets = new AllinTriplets();
		boolean result = allinTriplets.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testAllInTriplet2() { //對對糊  get(0)!=2 f
		Hand hand = new Hand('e','e',new String[]{"c1","c9","b1","b9","d1","d9","n0","e0","s0",
				"w0","r0","g0","_0","_0"});
		AllinTriplets allinTriplets = new AllinTriplets();
		boolean result = allinTriplets.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testAllInTriplet3() { //對對糊  get(1)!=3 tf
		Hand hand = new Hand('e','e',new String[]{"c1","c1","b1","b1","d1","d1","n0","n0","s0",
				"s0","r0","r0","_0","_0"});
		AllinTriplets allinTriplets = new AllinTriplets();
		boolean result = allinTriplets.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testAllInTriplet4() { //對對糊  get(2)!=3 ttf invalid hand
		Hand hand = new Hand('e','e',new String[]{"c1","c1","b1","b1","b1","d1","d1","d1","d1",
				"d1","d1","d1","d1","d1"});
		AllinTriplets allinTriplets = new AllinTriplets();
		boolean result = allinTriplets.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testAllInTriplet5() { //對對糊  get(3)!=3 tttf invalid hand
		Hand hand = new Hand('e','e',new String[]{"c1","c1","b1","b1","b1","d1","d1","d1","d2",
				"d2","d2","d2","d2","d2"});
		AllinTriplets allinTriplets = new AllinTriplets();
		boolean result = allinTriplets.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testAllInTriplet6() { //對對糊  get(4)!=3 ttttf invalid hand(15 tiles)
		Hand hand = new Hand('e','e',new String[]{"c1","c1","b1","b1","b1","d1","d1","d1","d2",
				"d2","d2","d3","d3","d3","d3"});
		AllinTriplets allinTriplets = new AllinTriplets();
		boolean result = allinTriplets.checkPattern(hand);
		assertEquals(false,result);
	}
	
	
 
}
