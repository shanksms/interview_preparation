package com.shashank.epi.bitwise;

class BitAlgorithms {
   
    
    public int countSetBits(int number) {
    	int count = 0;
    	while (number != 0) {
    		count = count + (number & 1);
    		//System.out.println(Integer.toBinaryString(number));
    		number = number >>> 1;
    	}
    	
    	
    	return count;
    }
    
    public short computeBitParity(long number) {
    	short parity = 0;
    	while (number != 0) {
    		parity ^= (number & 1);
    		number = number >>> 1;
    	}
    	
    	
    	
    	return parity;
    }
    
    
}
