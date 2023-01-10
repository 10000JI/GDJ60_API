package com.iu.api2.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class randomMain {
	public static void main(String[] args) {
		HashSet<Integer> hs = null;
		ArrayList<Integer> ar = new ArrayList<>();
		Random random = new Random();
		
		//1000원 로또 구매 1~45 번호 6개를 랜덤하게 추출
		//6번 뽑기, 중복 허용 X
		//1번째 뽑은 애는 0번 비교
		//2번째 뽑은 애는 1번 비교
		//3번째 뽑은 애는 2번 비교
		//4번째 뽑은 애는 3번 비교
		//5번째 뽑은 애는 4번 비교
		//6번째 뽑은 애는 6번 비교
		
//		int num = random.nextInt(9)+1;
//		System.out.println(num);
		int idx=1;
		ar.add(random.nextInt(45)+1);
		while(true) {
			int n = random.nextInt(45)+1;
//			hs = new HashSet<>();
			if(ar.get(idx)==n) {
				continue;
			}
			ar.add(n);
			idx++;
			for(int i=0;i<ar.size();i++) {
				System.out.println(ar.get(i));
			}
			if(ar.size()==5) {
				break;
			}
//			Iterator<Integer> is = hs.iterator();
//			
//			while(is.hasNext()) {
//				Integer num1 = is.next();
//				System.out.println(num1);
//				if()
		}		
	}		
}
