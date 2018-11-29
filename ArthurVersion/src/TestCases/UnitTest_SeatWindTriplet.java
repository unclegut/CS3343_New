package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.SeatWindTriplet;
import mahJong.Hand;

public class UnitTest_SeatWindTriplet {

	@Test
	public void testSeatWindTriplet() { //true 門東
		Hand hand = new Hand('e','e',new String[]{"e0","e0","e0","c1","c1","c1","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		SeatWindTriplet seatWindTriplet = new SeatWindTriplet();
		boolean result = seatWindTriplet.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSeatWindTriplet2() { //true 門南
		Hand hand = new Hand('s','s',new String[]{"s0","s0","s0","c1","c1","c1","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		SeatWindTriplet seatWindTriplet = new SeatWindTriplet();
		boolean result = seatWindTriplet.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSeatWindTriplet3() { //true 門西
		Hand hand = new Hand('w','w',new String[]{"w0","w0","w0","c1","c1","c1","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		SeatWindTriplet seatWindTriplet = new SeatWindTriplet();
		boolean result = seatWindTriplet.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSeatWindTriplet4() { //true 門北
		Hand hand = new Hand('n','n',new String[]{"n0","n0","n0","c1","c1","c1","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		SeatWindTriplet seatWindTriplet = new SeatWindTriplet();
		boolean result = seatWindTriplet.checkPattern(hand);
		assertEquals(true,result);
	}
	 
	@Test
	public void testSeatWindTriplet5() { //false (count!=3)
		Hand hand = new Hand('n','n',new String[]{"d1","d1","d1","c1","c1","c1","r0","r0","r0",
				"g0","g0","g0","n0","n0"});
		SeatWindTriplet seatWindTriplet = new SeatWindTriplet();
		boolean result = seatWindTriplet.checkPattern(hand);
		assertEquals(false,result);
	}

}
