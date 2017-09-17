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
    
    public long closestNumberWithSameWeightOptimized(long number) {
		//find out 2 consecutive rightmost bits that differ
		//since number is guaranteed to be positive, we will only focus on 63 digits and leave the MSB.
		
		long numberOfBits = 63;
		for (int i = 0; i < numberOfBits - 1; i++) {
			//if bits at ith and i+1 th postions are not same.
			if (((number >>> i) & 1) != ((number >>> (i +1)) & 1)) {
				//swap them
				number ^=  (1<<i) | (1<<(i+1));
				return number;
			}
			
		}
		
		
		throw new IllegalArgumentException("All bits are either 0 or 1");
	}
    
    private long bitAtGivenPosition(int position, long number) {
    	number = number >>> position;
    	return number & 1;
    	
    }
    
}
