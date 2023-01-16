package com.iu.api5.thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1();
		ThreadTest2 tt2 = new ThreadTest2();
		ThreadTest3 tt3 = new ThreadTest3();
		ThreadTest4 tt4 = new ThreadTest4();
		
		tt1.start(); //OS에게 위임
		tt2.start(); //OS에게 위임

		
		//runable
		//다형성에 의해 tt3은 Runable type이라고 말할 수 있다.
		Thread tr1 = new Thread(tt3);  
		Thread tr2 = new Thread(tt4);
		tr1.start();
		tr2.start();
	}

}
