package TestCase;

import static org.junit.Assert.*;

import org.junit.Test;

import MahJong.Validation;

public class testCase_Validation {

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

}
