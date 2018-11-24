package TestCase.IntegrationTest;

import static org.junit.Assert.*;

import org.junit.Test;

import mahJong.Hand;
import mahJong.HandChecker;

public class integrationTest {

	@Test
	public void testChicken() { 
		Hand hand = new Hand('e','e',new String[]{"c1","c2","c3","c4","c4","c4","b1","b2","b3",
				"d7","d8","d9","r0","r0"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(0,result);
		
	}
	
	@Test
	public void testRedDragon() { //chicken hand with RedDragon
		Hand hand = new Hand('e','e',new String[]{"r0","r0","r0","c4","c4","c4","b1","b2","b3",
				"d7","d8","d9","g0","g0"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(1,result);
		
	}
	
	@Test
	public void testGreenDragon() { //chicken hand with GreenDragon
		Hand hand = new Hand('e','e',new String[]{"g0","g0","g0","c4","c4","c4","b1","b2","b3",
				"d7","d8","d9","r0","r0"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(1,result);
		
	}
	
	@Test
	public void testWhiteDragon() { //chicken hand with WhiteDragon
		Hand hand = new Hand('e','e',new String[]{"_0","_0","_0","c4","c4","c4","b1","b2","b3",
				"d7","d8","d9","r0","r0"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(1,result);
		
	}
	
	@Test
	public void testSeatWind() { //chicken hand with seatWindTriplet 
		Hand hand = new Hand('s','e',new String[]{"e0","e0","e0","c4","c4","c4","b1","b2","b3",
				"d7","d8","d9","r0","r0"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(1,result);
		
	}
	
	@Test
	public void testPrevalentWind() { //chicken hand with prevalentWindTriplet 
		Hand hand = new Hand('s','e',new String[]{"s0","s0","s0","c4","c4","c4","b1","b2","b3",
				"d7","d8","d9","r0","r0"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(1,result);
		
	}
	
	@Test
	public void testCommon() { 
		Hand hand = new Hand('e','e',new String[]{"c1","c2","c3","c5","c6","c7","b1","b2","b3",
				"d5","d6","d7","r0","r0"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(1,result);
		
	}
	
	@Test
	public void testAllInTriplets() { 
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","c2","c2","c2","b3","b3","b3",
				"d4","d4","d4","d5","d5"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(3,result);
		
	}
	
	@Test
	public void testMixSuit() { 
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","c2","c3","c4","c5","c5","c5",
				"c6","c6","c6","_0","_0"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(3,result);
		
	}
	
	@Test
	public void testContainOneNine() { 
		Hand hand = new Hand('e','e',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","_0","_0"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(6,result);
		
	}
	
	@Test
	public void testSmallDragon() { 
		Hand hand = new Hand('e','e',new String[]{"r0","r0","r0","g0","g0","g0","_0","_0","d1",
				"d2","d3","c2","c2","c2"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(5,result);
		
	}
	
	@Test
	public void testSmallWinds() { 
		Hand hand = new Hand('n','n',new String[]{"d1","d2","d3","e0","e0","e0","s0","s0","s0",
				"w0","w0","w0","n0","n0"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(9,result);
		
	}
	
	@Test
	public void testAllHonorTiles() { 
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"}); 
		
		HandChecker hc = HandChecker.getInstance();
		hc.checkHand(hand);
		
		int result = hc.calculatePoints();
		
		assertEquals(-1,result);
		
	}

}
