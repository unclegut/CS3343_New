package TestCase;

import static org.junit.Assert.*;

import org.junit.Test;

import MahJong.Validation;

public class UnitTest_Validation {

	@Test
	public void testValidation_length() { //length!=14
		boolean result = Validation.validateHand(new String[]{"n0","n0","n0","e0","e0","e0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_suit() { //invalid suit "z0"
		boolean result = Validation.validateHand(new String[]{"z0","n0","n0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_rank() { //invalid rank "n1"
		boolean result = Validation.validateHand(new String[]{"n1","n2","n3","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_rank2() { //invalid rank "c0"
		boolean result = Validation.validateHand(new String[]{"c0","c0","c0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_stringLength() { //invalid string "c10"
		boolean result = Validation.validateHand(new String[]{"c10","c0","c0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_tileCount() { //count > 4
		boolean result = Validation.validateHand(new String[]{"n0","n0","n0","n0","n0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_valid() { //valid hand
		boolean result = Validation.validateHand(new String[]{"n0","n0","n0","e0","e0","e0",
				"r0","r0","r0","g0","g0","g0","_0","_0"});
		
		assertEquals(true,result);
	}
	
	@Test
	public void testValidation_wind() { //invalid wind
		boolean result = Validation.validateWind('A');
		
		assertEquals(false,result);
	}
	
	@Test
	public void testValidation_wind2() { //valid wind
		boolean result = Validation.validateWind('N');
		
		assertEquals(true,result);
	}

}
