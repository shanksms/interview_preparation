/**
 * 
 */
package com.shashank.epi.bitwise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author pooja
 *
 */

public class TestCountSetBits {
	private CountSetBits countSetBits;
	
	@Before
	public void before() {
		countSetBits = new CountSetBits();
	}
	
	
	@Test
	public void testCountBits() {
		//Binary Rep 11
		int number = 4;
		assertEquals(2, countSetBits.countSetBits(number));
		
	}
}
