package TestCase.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import handPattern.AllHonorTiles;
import mahJong.Hand;

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
	@Test
	public void testAllHonorTiles4() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"s0","s0","s0","w0","w0","w0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});  
		AllHonorTiles allHonerTiles = new AllHonorTiles();
		boolean result = allHonerTiles.checkPattern(hand);
		assertEquals(true,result);
	}
	@Test
	public void testAllHonorTiles5() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"c1","s0","s0","w0","w0","w0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});  
		AllHonorTiles allHonerTiles = new AllHonorTiles();
		boolean result = allHonerTiles.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testAllHonorTiles6() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","g0","_0","_0"}); 
		AllHonorTiles allHonerTiles = new AllHonorTiles();
		boolean result = allHonerTiles.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testAllHonorTiles7() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","r0","r0","r0","r0",
				"g0","g0","g0","g0","_0","_0"}); 
		AllHonorTiles allHonerTiles = new AllHonorTiles();
		boolean result = allHonerTiles.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testAllHonorTiles8() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","e0","r0","r0","r0","r0",
				"g0","g0","g0","g0","_0","_0"}); 
		AllHonorTiles allHonerTiles = new AllHonorTiles();
		boolean result = allHonerTiles.checkPattern(hand);
		assertEquals(false,result);
	}
	@Test
	public void testAllHonorTiles9() { // Branches case
		Hand hand = new Hand('e','e',new String[]{"n0","n0","w0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		AllHonorTiles allHonerTiles = new AllHonorTiles();
		boolean result = allHonerTiles.checkPattern(hand);
		assertEquals(false,result);
	}
	
 
}
