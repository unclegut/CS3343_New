package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import HandPattern.AllHonorTiles;
import MahJong.Hand;

public class UnitTest_AllHonorTiles {

	@Test
	public void testAllHonorTiles() { //字一色
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		AllHonorTiles allHonerTiles = new AllHonorTiles();
		boolean result = allHonerTiles.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testAllHonorTiles2() { //字一色 not all honor tiles
		Hand hand = new Hand('e','e',new String[]{"d1","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		AllHonorTiles allHonerTiles = new AllHonorTiles();
		boolean result = allHonerTiles.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testAllHonorTiles3() { //字一色 not 23333 after sorting
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","n0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		AllHonorTiles allHonerTiles = new AllHonorTiles();
		boolean result = allHonerTiles.checkPattern(hand);
		assertEquals(false,result);
	}

}
