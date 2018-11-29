package TestCases;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import mahJong.Hand;
import mahJong.Tile;

public class UnitTest_Hand {

	@Test
	public void testGetList() { 
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		
		String[] strTiles = new String[]{"n0","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"};
		
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		for (int i = 0; i < 14; i++) {
			tiles.add(new Tile(strTiles[i]));
		}
		
		assertEquals(tiles,hand.getList());
	}
	
	@Test
	public void testGetWind() { 
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		
		
		assertEquals('e',hand.getPrevalentWind());
		assertEquals('e',hand.getSeatWind());
	}
	

	@Test
	public void testPrint() { 
		Hand hand = new Hand('e','e',new String[]{"n0","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		
		
		hand.printHand();
	} 
}
