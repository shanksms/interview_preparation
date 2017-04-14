package com.shashank.threads;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("In runnable");
			}
		}).start();

	}

}
