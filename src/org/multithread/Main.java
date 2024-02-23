package org.multithread;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread st = new Thread(new SlowThread(10));
		st.setPriority(Thread.MIN_PRIORITY);
		st.setName("Slow Thread");
		st.start();
		
		Thread mt = new Thread(new MediumThread(20));
		mt.setPriority(Thread.NORM_PRIORITY);
		mt.setName("Medium Thread");
		mt.start();
		
		Thread ft = new Thread(new FastThread(30));
		ft.setPriority(Thread.MAX_PRIORITY);
		ft.setName("Fast Thread");
		ft.start();
		
		//The main thread has to wait for the completion of the Child thread
		try {
			st.join();
			mt.join();
			ft.join();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Interrupted");
		}
		
		System.out.println("Execution for all threads completed !!");
		
		
		
		
		

	}

}
