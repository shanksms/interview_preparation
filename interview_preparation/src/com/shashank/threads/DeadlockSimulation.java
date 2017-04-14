/**
 * 
 */
package com.shashank.threads;

/**
 * @author pooja
 *
 */
public class DeadlockSimulation {

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				DeadlockSimulation.method1();
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				DeadlockSimulation.method2();
			}
		}).start();

	}

	public static void method1() {

		synchronized (String.class) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (Integer.class) {

			}
		}

	}

	public static void method2() {

		synchronized (Integer.class) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (String.class) {

			}
		}

	}

}
