package TestCase;

import static org.junit.Assert.*;

import org.junit.Test;

import MahJong.Hand;
import MahJong.Tile;
import HandPattern.ThirteenOrphans;
import MahJong.Validation;
import HandPattern.AllHonorTiles;
import HandPattern.AllinTriplets;
import HandPattern.GreatDragon;
import HandPattern.GreatWinds;
import HandPattern.MixSuit;
import HandPattern.SameSuit;

public class testCase {

	/* test for validation*/
	@Test
	public void testValidation_length() { //length!=14
		boolean result = Validation.validating(new String[]{"n0","n0","n0","e0","e0","e0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_suit() { //invalid suit
		boolean result = Validation.validating(new String[]{"z0","n0","n0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_rank() { //invalid rank
		boolean result = Validation.validating(new String[]{"n1","n2","n3","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_valid() { //valid hand
		boolean result = Validation.validating(new String[]{"n0","n0","n0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(true,result);
	}

	/* test for hand pattern*/
	@Test
	public void testAllInTriplet() { //對對糊
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","b1","b1","b1","d1","d1","d1",
				"d2","d2","d2","d3","d3"});
		AllinTriplets allinTriplets = new AllinTriplets();
		boolean result = allinTriplets.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testMixSuit() { //混一色
		Hand hand = new Hand('E','E',new String[]{"d1","d1","d1","d2","d3","d4","d5","d5","d5",
				"d6","d7","d8","e0","e0"});
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSameSuit() { //清一色
		Hand hand = new Hand('E','E',new String[]{"d1","d1","d1","d2","d3","d4","d5","d5","d5",
				"d6","d7","d8","d9","d9"});
		SameSuit sameSuit = new SameSuit();
		boolean result = sameSuit.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testGreatDragon() { //大三元
		Hand hand = new Hand('E','E',new String[]{"r0","r0","r0","g0","g0","g0","_0","_0","_0",
				"c6","c7","c8","e0","e0"});
		GreatDragon greatDragon = new GreatDragon();
		boolean result = greatDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	
	@Test
	public void testAllHonorTiles() { //字一色
		Hand hand = new Hand('E','E',new String[]{"n0","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		AllHonorTiles allHonerTiles = new AllHonorTiles();
		boolean result = allHonerTiles.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testThirteenOrphans() {//十三么
		Hand hand = new Hand('E','E',new String[]{"c1","c9","b1","b9","d1","d9","n0","e0","s0",
				"w0","r0","g0","_0","_0"});
		ThirteenOrphans thirteenOrphans = new ThirteenOrphans();
		boolean result = thirteenOrphans.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testGreatWinds() {//大四喜
		Hand hand = new Hand('E','E',new String[]{"e0","e0","e0","s0","s0","s0","w0","w0","w0",
				"n0","n0","n0","c1","c1"});
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(true,result);
	}
	
	
	
	
	
	
	
	
	
	

}
