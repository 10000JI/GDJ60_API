package com.iu.api5.thread;

public class ThreadTest4 implements Runnable{
	@Override
	public void run() {
		this.t4();
	}
	
	public void t4() {
		for(int i =0;i<25;i++) {
			System.out.println("World:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
