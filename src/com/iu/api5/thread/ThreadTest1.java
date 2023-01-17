package com.iu.api5.thread;

public class ThreadTest1 extends Thread{
	@Override
	public void run() {
		this.t1();
	}

	public void t1() {
		
		for(int i=0;i<26;i++) {
			System.out.println("T1 :"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
