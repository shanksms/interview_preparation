/**
 * 
 */
package com.shashank.effective_java.enum_chap;

/**
 * @author pooja
 *
 */
public class WeightTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double earthWeight = Double.parseDouble(args[0]);
		double mass = earthWeight/Planet.EARTH.surfaceGravity();
		//%n is for new line
		for (Planet p : Planet.values()) {
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
			
		}

	}

}
