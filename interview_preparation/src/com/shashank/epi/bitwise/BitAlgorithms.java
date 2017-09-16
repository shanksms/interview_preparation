package com.shashank.epi.bitwise;

class BitAlgorithms {
   
    
    public long countSetBits(long number) {
    	long count = 0;
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
    
    public long swapBits(int i, int j, long number) {
    	long bitAtIthPosition = bitAtGivenPosition(i, number);
    	long bitAtJthPosition = bitAtGivenPosition(j, number);
    	//if bits at both positions are same, do nothing.
    	if (bitAtIthPosition == bitAtJthPosition) {
    		return number;
    	}
    	
    	long bitMask = (1 << i) | (1 << j);
    	
    	
    	return (number ^ bitMask);
    }
    
    public long closestNumberWithSameWeight(long number) {
    	
    	long setBits = countSetBits(number);
    	long numberWithSameWeight = -1;
    	/*
    	 * We have to alternate between addition and subtraction 
    	 */
    	boolean addFlag = false;
    	long toAdd = 1;
    	long toSubtract = 1;
    	
    	while(true) {
    		if(addFlag) {
    			if (setBits == countSetBits(number + toAdd)) {
    				numberWithSameWeight = number + toAdd;
    				break;
    			} else {
    				toAdd += 1;
    			}
    		} else {
    			if (setBits == countSetBits(number - toSubtract)) {
    				numberWithSameWeight = number - toSubtract;
    				break;
    			} else {
    				toSubtract += 1;
    			}
    		}
    	}
    	
    	
    	return numberWithSameWeight;
    }
    
    private long bitAtGivenPosition(int position, long number) {
    	number = number >>> position;
    	return number & 1;
    	
    }
    
}
