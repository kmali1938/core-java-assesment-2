package org.multithread;

public class SlowThread implements Runnable{
	private int value;

	public SlowThread(int value) {
		this.value=value;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is the "+Thread.currentThread().getName());
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+value+" * "+i+" = "+(i*value));
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Multiplication of the "+Thread.currentThread().getName()+" completed");
		
	}

}
