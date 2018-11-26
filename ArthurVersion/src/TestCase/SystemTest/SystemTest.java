package TestCase.SystemTest;

import static org.junit.Assert.*;

import org.junit.Test;

import mahJong.Hand;
import mahJong.HandChecker;
import mahJong.Validation;

public class SystemTest {

	@Test
	public void test() { // main() //chicken hand

		char pWind = 'e';
		char sWind = 'e';
		String[] tileStr = { "c1", "c2", "c3", "c4", "c4", "c4", "b1", "b2", "b3", "d7", "d8", "d9", "r0", "r0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(0,hc.calculatePoints());
		}

	}

	@Test
	public void test2() { // main() //chicken red dragon

		char pWind = 'e';
		char sWind = 'e';
		String[] tileStr = { "r0","r0","r0","c4","c4","c4","b1","b2","b3",
				"d7","d8","d9","g0","g0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(1,hc.calculatePoints());
		}

	}
	
	@Test
	public void test3() { // main() //chicken green dragon

		char pWind = 'e';
		char sWind = 'e';
		String[] tileStr = { "g0","g0","g0","c4","c4","c4","b1","b2","b3",
				"d7","d8","d9","r0","r0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(1,hc.calculatePoints());
		}
	}
	
	@Test
	public void test4() { // main() //chicken white dragon

		char pWind = 'e';
		char sWind = 'e';
		String[] tileStr = { "_0","_0","_0","c4","c4","c4","b1","b2","b3",
				"d7","d8","d9","r0","r0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(1,hc.calculatePoints());
		}
	}
	
	@Test
	public void test5() { // main() //seatWindTriplet

		char pWind = 's';
		char sWind = 'e';
		String[] tileStr = { "e0","e0","e0","c4","c4","c4","b1","b2","b3",
				"d7","d8","d9","r0","r0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(1,hc.calculatePoints());
		}
	}
	
	@Test
	public void test6() { // main() //prevalentWindTriplet

		char pWind = 's';
		char sWind = 'e';
		String[] tileStr = { "s0","s0","s0","c4","c4","c4","b1","b2","b3",
				"d7","d8","d9","r0","r0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(1,hc.calculatePoints());
		}
	}
	
	@Test
	public void test7() { // main() //seatWindTriplet

		char pWind = 's';
		char sWind = 'e';
		String[] tileStr = { "e0","e0","e0","c4","c4","c4","b1","b2","b3",
				"d7","d8","d9","r0","r0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(1,hc.calculatePoints());
		}
	}
	
	@Test
	public void test8() { // main() //common

		char pWind = 'e';
		char sWind = 'e';
		String[] tileStr = { "c1","c2","c3","c5","c6","c7","b1","b2","b3",
				"d5","d6","d7","r0","r0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(1,hc.calculatePoints());
		}
	}
	
	@Test
	public void test9() { // main() //AllInTriplets

		char pWind = 'e';
		char sWind = 'e';
		String[] tileStr = { "c1","c1","c1","c2","c2","c2","b3","b3","b3",
				"d4","d4","d4","d5","d5" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(3,hc.calculatePoints());
		}
	}
	
	@Test
	public void test10() { // main() //MixSuit

		char pWind = 'e';
		char sWind = 'e';
		String[] tileStr = { "c1","c1","c1","c2","c3","c4","c5","c5","c5",
				"c6","c6","c6","_0","_0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(3,hc.calculatePoints());
		}
	}
	
	@Test
	public void test11() { // main() //ContainOneNine

		char pWind = 'e';
		char sWind = 'e';
		String[] tileStr = { "c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"e0","e0","e0","_0","_0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(6,hc.calculatePoints());
		}
	}
	
	@Test
	public void test12() { // main() //SmallDragon

		char pWind = 'e';
		char sWind = 'e';
		String[] tileStr = { "r0","r0","r0","g0","g0","g0","_0","_0","d1",
				"d2","d3","c2","c2","c2" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(5,hc.calculatePoints());
		}
	}
	
	@Test
	public void test13() { // main() //SmallWinds

		char pWind = 'n';
		char sWind = 'n';
		String[] tileStr = { "d1","d2","d3","e0","e0","e0","s0","s0","s0",
				"w0","w0","w0","n0","n0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(9,hc.calculatePoints());
		}
	}
	
	@Test
	public void test14() { // main() //SameSuit

		char pWind = 'e';
		char sWind = 'e';
		String[] tileStr = { "d1","d1","d1","d2","d3","d4","d5","d5","d5",
				"d6","d7","d8","d9","d9" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(7,hc.calculatePoints());
		}
	}
	
	@Test
	public void test15() { // main() //GreatDragon

		char pWind = 'n';
		char sWind = 'n';
		String[] tileStr = { "r0","r0","r0","g0","g0","g0","_0","_0","_0",
				"c6","c7","c8","e0","e0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(8,hc.calculatePoints());
		}
	}
	
	@Test
	public void test16() { // main() //OnlyOneNine

		char pWind = 'n';
		char sWind = 'n';
		String[] tileStr = { "c1","c1","c1","b9","b9","b9","d1","d1","d1",
				"c9","c9","c9","b1","b1" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(-1,hc.calculatePoints());
		}
	}
	
	@Test
	public void test17() { // main() //ThirteenOrphans

		char pWind = 'n';
		char sWind = 'n';
		String[] tileStr = { "c1","c9","b1","b9","d1","d9","n0","e0","s0",
				"w0","r0","g0","_0","_0" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(-1,hc.calculatePoints());
		}
	}
	
	@Test
	public void test18() { // main() //GreatWinds

		char pWind = 'n';
		char sWind = 'n';
		String[] tileStr = { "e0","e0","e0","s0","s0","s0","w0","w0","w0",
				"n0","n0","n0","c1","c1" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(-1,hc.calculatePoints());
		}
	}
	
	@Test
	public void test19() { // main() //Trickhand
		
		char pWind = 'n';
		char sWind = 'n';
		String[] tileStr = { "c1","c3","c5","c7","c9","b1","b3","b5","b7",
				"b9","d1","d3","d5","d7" };

		System.out.println("-- MahJong Point Calculator --\n");
		System.out.println("Prevalent Wind: (e/s/w/n) : " + pWind + "\n");
		System.out.println("Seat Wind: (e/s/w/n) : " + sWind);

		Validation v = new Validation();
		boolean isValid = v.validateHand(tileStr);
		assertEquals(true,isValid);
		
		if (isValid) {
			Hand hand = new Hand(pWind, sWind, tileStr);
			hand.printHand();
			System.out.println("\n");

			HandChecker hc = HandChecker.getInstance();
			hc.checkHand(hand);
			
			assertEquals(-2,hc.calculatePoints());
		}
	}

}
