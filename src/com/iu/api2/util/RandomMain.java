package com.iu.api2.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RandomMain {
	public static void main(String[] args) {
		Random random = new Random();
		//1000원 로또 구매 1~45 번호 6개를 랜덤하게 추출
		//6번 뽑기, 중복 허용 X
		//1번째 뽑은 애는 0번 비교
		//2번째 뽑은 애는 1번 비교
		//3번째 뽑은 애는 2번 비교
		//4번째 뽑은 애는 3번 비교
		//5번째 뽑은 애는 4번 비교
		//6번째 뽑은 애는 6번 비교
		
		//담을 수 있는 방법 
		//1.배열 2.list,set,map

//ex1) Hashset
//		HashSet<Integer> hs = new HashSet<>();		
//		while(hs.size()!=6) {
//			int n = random.nextInt(45)+1;
//			hs.add(n);
//		}
//		
//		Iterator<Integer> is = hs.iterator();
//		while(is.hasNext()) {
//			Integer num1 = is.next();
//			System.out.println(num1);
//		}	
		
//ex2) 배열
//		int[] nums = new int[6];
//		//대입하려고 하기에 향상된 for문 사용 불가능
//		//i가 0일때 중복검사 0번
//		//i가 1일때 중복검사 1번
//		//... i가 5일때 중복검사 5번
//		for(int i=0;i<nums.length;i++) {
//			nums[i] = random.nextInt(45)+1;
//			for(int j=0;j<i;j++) {
//				if(nums[i]==nums[j]) {
//					i--;
//					//중복되면 인덱스 번호 i를 유지
//					//바깥쪽 for문 조건문에 증감식 때문
//					break;
//				}
//			}//안쪽 for문
//		}//바깥쪽 for문
//		for(int i=0;i<nums.length;i++) {
//			System.out.println(nums[i]);
//
//		}
		
//ex3) ArrayList
		ArrayList<Integer> ar = new ArrayList<>();
		while(ar.size()<6) {
			int n = random.nextInt(45)+1;
			boolean check = true;
			for(int i=0;i<ar.size();i++) {
				//중복 비교 
				//모두 비교해야되기 때문에 if문에 add불가능
				if(n == ar.get(i)) {
					//중복이라면 check에 false
					check= false;
					break;
				}
			}
			if(check = true) {
				ar.add(n);
			}
		}
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));	
		}
	}
}
