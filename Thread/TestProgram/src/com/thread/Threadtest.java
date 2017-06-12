package com.thread;

public class Threadtest extends Thread{
	
	@Override
	public void run() {
		int iterator = 5;
		
		try {
			for (int i = 0; i < iterator; i++) {
				System.out.println("From Secondary Thread...");
				sleep(1000);
				//sleep(1000);
			}
		} catch (InterruptedException e) {
			System.err.println(e); // passed exception object.
		}
	}
	

}
