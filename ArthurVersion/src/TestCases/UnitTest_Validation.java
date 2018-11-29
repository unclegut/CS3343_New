package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

import mahJong.Validation;

public class UnitTest_Validation {

	@Test
	public void testValidation_length() { //length!=14
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"n0","n0","n0","e0","e0","e0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_suit() { //invalid suit "z0"
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"z0","n0","n0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_rank() { //invalid rank "n1"
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"n1","n2","n3","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_rank2() { // invalid rank c0
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"c0","c0","c0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	 
	@Test
	public void testValidation_stringLength() { //invalid string "c10"
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"c10","c0","c0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_tileCount() { //count > 4
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"n0","n0","n0","n0","n0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_tileCount2() { //count > 4 condition
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"b1","n0","n0","n0","n0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(true,result);
	}
	
	@Test
	public void testValidation_tileCount3() { //count > 4 condition
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"b1","b2","n0","n0","n0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(true,result);
	}
	
	@Test
	public void testValidation_c0() { //not between 1-9
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"c0","n0","n0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_b0() { 
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"bA","c0","c0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_d0() { 
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"d0","c0","c0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_valid() { //valid hand
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"n0","n0","n0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(true,result);
	}
	
	@Test
	public void testValidation_valid2() { //valid hand
		Validation v = new Validation();
		boolean result = v.validateHand(new String[]{"c1","c1","c1","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(true,result);
	}
	
	@Test
	public void testValidation_wind() { //invalid wind
		Validation v = new Validation();
		boolean result = v.validateWind('A');
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_wind2() { //valid wind
		Validation v = new Validation();
		boolean result = v.validateWind('n');
		
		assertEquals(true,result);
	}
	
	@Test
	public void testValidation_wind3() { //valid wind
		Validation v = new Validation();
		boolean result = v.validateWind('e');
		
		assertEquals(true,result);
	}
	
	@Test
	public void testValidation_wind4() { //valid wind
		Validation v = new Validation();
		boolean result = v.validateWind('s');
		
		assertEquals(true,result);
	}
	
	@Test
	public void testValidation_wind5() { //valid wind
		Validation v = new Validation();
		boolean result = v.validateWind('w');
		
		assertEquals(true,result);
	}
	
	

}
