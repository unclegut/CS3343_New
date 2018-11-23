package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.AllHonorTiles;
import handPattern.PrevalentWindTriplet;
import mahJong.Hand;

public class UnitTest_PrevalentWind {

	@Test
	public void testPrevalentWindTriplet() { //true 圈東
		Hand hand = new Hand('e','e',new String[]{"e0","e0","e0","c1","c1","c1","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		PrevalentWindTriplet prevalentWindTriplet = new PrevalentWindTriplet();
		boolean result = prevalentWindTriplet.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testPrevalentWindTriplet2() { //true 圈南
		Hand hand = new Hand('s','s',new String[]{"s0","s0","s0","c1","c1","c1","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		PrevalentWindTriplet prevalentWindTriplet = new PrevalentWindTriplet();
		boolean result = prevalentWindTriplet.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testPrevalentWindTriplet3() { //true 圈西
		Hand hand = new Hand('w','w',new String[]{"w0","w0","w0","c1","c1","c1","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		PrevalentWindTriplet prevalentWindTriplet = new PrevalentWindTriplet();
		boolean result = prevalentWindTriplet.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testPrevalentWindTriplet4() { //true 圈北
		Hand hand = new Hand('n','n',new String[]{"n0","n0","n0","c1","c1","c1","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		PrevalentWindTriplet prevalentWindTriplet = new PrevalentWindTriplet();
		boolean result = prevalentWindTriplet.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testPrevalentWindTriplet5() { //false (count!=3)
		Hand hand = new Hand('n','n',new String[]{"d1","d1","d1","c1","c1","c1","r0","r0","r0",
				"g0","g0","g0","n0","n0"});
		PrevalentWindTriplet prevalentWindTriplet = new PrevalentWindTriplet();
		boolean result = prevalentWindTriplet.checkPattern(hand);
		assertEquals(false,result);
	}
	

}
