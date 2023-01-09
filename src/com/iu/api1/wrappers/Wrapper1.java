package com.iu.api1.wrappers;

public class Wrapper1 {

	public static void main(String[] args) {
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		String n1 = "1122";
//		Integer int1 = new Integer(n1);
		
		int a = Integer.parseInt(n1);
		System.out.println(a*2);
		
		n1 = "15.323";
		double d1 = Double.parseDouble(n1);
		System.out.println(d1*1.1);
		
	}
}
