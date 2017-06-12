package com.thread;

public class Main {
	
	public static void main(String [] args){
		
		int iterator = 3;
		
		Threadtest thread = new Threadtest();
		thread.start();
		System.out.println("First call");
		//thread.run();
		System.out.println("Second call."); // asked in amdocs
	// 	thread.start();  // during this second call it throws an exception illegalState 
	//	thread.run();
		
		try {
			for (int i = 0; i < iterator; i++) {
				System.out.println("From main process.");
				thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}
	}

}
