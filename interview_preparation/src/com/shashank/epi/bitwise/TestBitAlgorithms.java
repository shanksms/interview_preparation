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

public class TestBitAlgorithms {
	private BitAlgorithms bitAlgorithms;
	
	@Before
	public void before() {
		bitAlgorithms = new BitAlgorithms();
	}
	
	
	@Test
	public void testCountBits() {
		//Binary Rep 10
		int number = 4;
		assertEquals(1, bitAlgorithms.countSetBits(number));
		
	}
	
	@Test
	public void testComputeBitParity() {
		//bit parity of 1 is 1
		long number = 1;
		assertEquals(1, bitAlgorithms.computeBitParity(number));
	}
}
