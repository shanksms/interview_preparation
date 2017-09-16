package com.shashank.epi.bitwise;

class BitAlgorithms {
    public static void main(String[] args) {
    	int number = 7;
    	
    	System.out.println(new BitAlgorithms().countSetBits(number));

    }
    
    
    public int countSetBits(int number) {
    	int count = 0;
    	while (number > 0) {
    		count = count + (number & 1);
    		//System.out.println(Integer.toBinaryString(number));
    		number = number >>> 1;
    	}
    	
    	
    	return count;
    }
    
    
}
