package com.iu.api5.thread;

public class ThreadTest2 extends Thread{
	
	@Override
	public void run() {
		this.t2();
	}
	
	public void t2() {
		for(int i='A';i<='Z';i++) {
			//형변환(char -> int)
			System.out.println("T2: "+(char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
