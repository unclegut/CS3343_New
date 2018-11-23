package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.ContainOneNine;
import mahJong.Hand;

public class UnitTest_ContainOneNine {

	@Test
	public void testContainOneNine() { //花么
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","_0","_0"});
		ContainOneNine containOneNine = new ContainOneNine();
		boolean result = containOneNine.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testContainOneNine2() { //花么 false (not 1 or 9)
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","b9","b9","b9","d8","d8","d8",
				"e0","e0","e0","_0","_0"});
		ContainOneNine containOneNine = new ContainOneNine();
		boolean result = containOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testContainOneNine3() { //花么 false (all 1 )
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","b1","b1","b1","d1","d1","d1",
				"e1","e1","e1","_0","_0"});
		ContainOneNine containOneNine = new ContainOneNine();
		boolean result = containOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testContainOneNine4() { //花么 false (all 9 )
		Hand hand = new Hand('e','e',new String[]{"c9","c9","c9","b9","b9","b9","d9","d9","d9",
				"e9","e9","e9","_0","_0"});
		ContainOneNine containOneNine = new ContainOneNine();
		boolean result = containOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testContainOneNine5() { //花么 false (not 23333)
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c2","b9","b9","b9","d8","d8","d8",
				"e0","e0","e0","_0","_0"});
		ContainOneNine containOneNine = new ContainOneNine();
		boolean result = containOneNine.checkPattern(hand);
		assertEquals(false,result);
	}

}
