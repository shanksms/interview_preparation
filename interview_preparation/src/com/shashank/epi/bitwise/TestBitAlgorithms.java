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
	
	@Test
	public void testSwapBits() {
		//Binary representation is 10100
		long number = 20;
		int i = 0, j = 2;
		//Expected binary representation after swapping is 10001
		String expectedBinaryRepAfterSwap = "10001";
		assertEquals(expectedBinaryRepAfterSwap, Long.toBinaryString(bitAlgorithms.swapBits(0, 2, number)));
	}
	
	@Test
	public void testClosestNumberWithSameWeight() {
		long number = 6;
		//expected output is 5
		assertEquals(5, bitAlgorithms.closestNumberWithSameWeight(number));
	}
	@Test
	public void testClosestNumberWithSameWeightOptimized() {
		long number = 6;
		//expected output is 5
		assertEquals(5, bitAlgorithms.closestNumberWithSameWeightOptimized(number));
	}
	
	@Test
	public void testMultiply() {
		
		assertEquals(30, bitAlgorithms.multiply(5, 6));
	}
}
