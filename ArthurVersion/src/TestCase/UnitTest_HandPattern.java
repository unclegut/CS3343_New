package TestCase;

import static org.junit.Assert.*;
import org.junit.Test;

import MahJong.Hand;
import HandPattern.ThirteenOrphans;
import HandPattern.WhiteDragon;
import HandPattern.AllHonorTiles;
import HandPattern.AllinTriplets;
import HandPattern.ContainOneNine;
import HandPattern.GreatDragon;
import HandPattern.GreatWinds;
import HandPattern.GreenDragon;
import HandPattern.MixSuit;
import HandPattern.OnlyOneNine;
import HandPattern.RedDragon;
import HandPattern.SameSuit;
import HandPattern.SmallDragon;
import HandPattern.SmallWinds;

public class UnitTest_HandPattern {
	
	@Test
	public void testRedDragon() { //紅中
		Hand hand = new Hand('E','E',new String[]{"r0","r0","r0","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","_0","_0"});
		RedDragon redDragon = new RedDragon();
		boolean result = redDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testRedDragon2() { //紅中 false
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","_0","_0"});
		RedDragon redDragon = new RedDragon();
		boolean result = redDragon.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testGreenDragon() { //發財
		Hand hand = new Hand('E','E',new String[]{"g0","g0","g0","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","_0","_0"});
		GreenDragon greenDragon = new GreenDragon();
		boolean result = greenDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testGreenDragon2() { //發財 false
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","_0","_0"});
		GreenDragon greenDragon = new GreenDragon();
		boolean result = greenDragon.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testWhiteDragon() { //白板
		Hand hand = new Hand('E','E',new String[]{"_0","_0","_0","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","r0","r0"});
		WhiteDragon whiteDragon = new WhiteDragon();
		boolean result = whiteDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testWhiteDragon2() { //白板 false
		Hand hand = new Hand('E','E',new String[]{"g0","g0","g0","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","r0","r0"});
		WhiteDragon whiteDragon = new WhiteDragon();
		boolean result = whiteDragon.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testContainOneNine() { //花么
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","_0","_0"});
		ContainOneNine containOneNine = new ContainOneNine();
		boolean result = containOneNine.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testContainOneNine2() { //花么 false (not 1 or 9)
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","b9","b9","b9","d8","d8","d8",
				"e0","e0","e0","_0","_0"});
		ContainOneNine containOneNine = new ContainOneNine();
		boolean result = containOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testContainOneNine3() { //花么 false (all 1 )
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","b1","b1","b1","d1","d1","d1",
				"e1","e1","e1","_0","_0"});
		ContainOneNine containOneNine = new ContainOneNine();
		boolean result = containOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testContainOneNine4() { //花么 false (all 9 )
		Hand hand = new Hand('E','E',new String[]{"c9","c9","c9","b9","b9","b9","d9","d9","d9",
				"e9","e9","e9","_0","_0"});
		ContainOneNine containOneNine = new ContainOneNine();
		boolean result = containOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testContainOneNine5() { //花么 false (not 23333)
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c2","b9","b9","b9","d8","d8","d8",
				"e0","e0","e0","_0","_0"});
		ContainOneNine containOneNine = new ContainOneNine();
		boolean result = containOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testAllInTriplet() { //對對糊
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","b1","b1","b1","d1","d1","d1",
				"d2","d2","d2","d3","d3"});
		AllinTriplets allinTriplets = new AllinTriplets();
		boolean result = allinTriplets.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testAllInTriplet2() { //對對糊 false
		Hand hand = new Hand('E','E',new String[]{"c2","c2","b2","b2","d2","d2","c3","c3","c3",
				"c4","c4","c4","c5","c5"});
		AllinTriplets allinTriplets = new AllinTriplets();
		boolean result = allinTriplets.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testMixSuit() { //混一色
		Hand hand = new Hand('E','E',new String[]{"d1","d1","d1","d2","d3","d4","d5","d5","d5",
				"d6","d7","d8","_0","_0"});
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testMixSuit2() { //混一色 false (d9 : getRank() != '0')
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","c2","c3","c4","c5","c5","c5",
				"c6","c7","c8","d9","d9"});
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testMixSuit3() { //混一色 false
		Hand hand = new Hand('E','E',new String[]{"e0","e0","e0","s0","s0","s0","w0","w0","w0",
				"n0","n0","n0","c1","c1"});
		MixSuit mixSuit = new MixSuit();
		boolean result = mixSuit.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testSmallDragon() { //小三元 r0*3 g0*3 _0*2
		Hand hand = new Hand('E','E',new String[]{"r0","r0","r0","g0","g0","g0","_0","_0","d1",
				"d1","d1","d2","d2","d2"});
		SmallDragon smallDragon = new SmallDragon();
		boolean result = smallDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallDragon2() { //小三元 r0*3 g0*2 _0*3
		Hand hand = new Hand('E','E',new String[]{"r0","r0","r0","g0","g0","_0","_0","_0","d1",
				"d1","d1","d2","d2","d2"});
		SmallDragon smallDragon = new SmallDragon();
		boolean result = smallDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallDragon3() { //小三元 r0*2 g0*3 _0*3
		Hand hand = new Hand('E','E',new String[]{"r0","r0","g0","g0","g0","_0","_0","_0","d1",
				"d1","d1","d2","d2","d2"});
		SmallDragon smallDragon = new SmallDragon();
		boolean result = smallDragon.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallDragon4() { //小三元 false 
		Hand hand = new Hand('E','E',new String[]{"r0","r0","g0","g0","g0","c1","c1","c1","d1",
				"d1","d1","d2","d2","d2"});
		SmallDragon smallDragon = new SmallDragon();
		boolean result = smallDragon.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testSmallWinds() { //小四喜 2333
		Hand hand = new Hand('E','E',new String[]{"n0","n0","e0","e0","e0","s0","s0","s0","w0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallWinds2() { //小四喜 3233
		Hand hand = new Hand('E','E',new String[]{"n0","n0","n0","e0","e0","s0","s0","s0","w0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallWinds3() { //小四喜 3323
		Hand hand = new Hand('E','E',new String[]{"n0","n0","n0","e0","e0","e0","s0","s0","w0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testSmallWinds4() { //小四喜 3332
		Hand hand = new Hand('E','E',new String[]{"n0","n0","n0","e0","e0","e0","s0","s0","s0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(true,result);
	}	
	
	@Test
	public void testSmallWinds5() { //小四喜 not 3332 structure, else return false
		Hand hand = new Hand('E','E',new String[]{"c1","n0","n0","e0","e0","e0","s0","s0","s0",
				"w0","w0","d2","d2","d2"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
	}	
	
	@Test
	public void testSmallWinds6() { //小四喜 return false
		Hand hand = new Hand('E','E',new String[]{"d1","d1","d1","d2","d3","d4","d5","d5","d5",
			"d6","d7","d8","d9","d9"});
		SmallWinds smallWinds = new SmallWinds();
		boolean result = smallWinds.checkPattern(hand);
		assertEquals(false,result);
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
	public void testSameSuit2() { //清一色 not all the suit are the same
		Hand hand = new Hand('E','E',new String[]{"d1","c1","d1","d2","d3","d4","d5","d5","d5",
				"d6","d7","d8","d9","d9"});
		SameSuit sameSuit = new SameSuit();
		boolean result = sameSuit.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testSameSuit3() { //清一色 the first suit is not c/b/d
		Hand hand = new Hand('E','E',new String[]{"n0","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		SameSuit sameSuit = new SameSuit();
		boolean result = sameSuit.checkPattern(hand);
		assertEquals(false,result);
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
	public void testGreatDragon2() { //大三元 false
		Hand hand = new Hand('E','E',new String[]{"c2","c2","b2","b2","d2","d2","c3","c3","c3",
				"c4","c4","c4","c5","c5"});
		GreatDragon greatDragon = new GreatDragon();
		boolean result = greatDragon.checkPattern(hand);
		assertEquals(false,result);
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
	public void testAllHonorTiles2() { //字一色 not all honor tiles
		Hand hand = new Hand('E','E',new String[]{"d1","n0","n0","e0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		AllHonorTiles allHonerTiles = new AllHonorTiles();
		boolean result = allHonerTiles.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testAllHonorTiles3() { //字一色 not 23333 after sorting
		Hand hand = new Hand('E','E',new String[]{"n0","n0","n0","n0","e0","e0","r0","r0","r0",
				"g0","g0","g0","_0","_0"});
		AllHonorTiles allHonerTiles = new AllHonorTiles();
		boolean result = allHonerTiles.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testOnlyOneNine() { //清么九
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"c9","c9","c9","b1","b1"});
		OnlyOneNine onlyOneNine = new OnlyOneNine();
		boolean result = onlyOneNine.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testOnlyOneNine2() { //清么九 false (not 1 or 9)
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"c9","c9","c9","b2","b2"});
		OnlyOneNine onlyOneNine = new OnlyOneNine();
		boolean result = onlyOneNine.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testOnlyOneNine3() { //清么九 false (not c/b/d)
		Hand hand = new Hand('E','E',new String[]{"c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"c9","c9","c9","_0","_0"});
		OnlyOneNine onlyOneNine = new OnlyOneNine();
		boolean result = onlyOneNine.checkPattern(hand);
		assertEquals(false,result);
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
	public void testThirteenOrphans2() {//十三么 false
		Hand hand = new Hand('E','E',new String[]{"c2","c2","b2","b2","d2","d2","c3","c3","c3",
				"c4","c4","c4","c5","c5"});
		ThirteenOrphans thirteenOrphans = new ThirteenOrphans();
		boolean result = thirteenOrphans.checkPattern(hand);
		assertEquals(false,result);
	}
	
	@Test
	public void testGreatWinds() {//大四喜
		Hand hand = new Hand('E','E',new String[]{"e0","e0","e0","s0","s0","s0","w0","w0","w0",
				"n0","n0","n0","c1","c1"});
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(true,result);
	}
	
	@Test
	public void testGreatWinds2() {//大四喜 false
		Hand hand = new Hand('E','E',new String[]{"c2","c2","b2","b2","d2","d2","c3","c3","c3",
				"c4","c4","c4","c5","c5"});
		GreatWinds greatWinds = new GreatWinds();
		boolean result = greatWinds.checkPattern(hand);
		assertEquals(false,result);
	}
	
	
	
	
	
	
	
	
	
	
	

}
