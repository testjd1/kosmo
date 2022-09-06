package chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
/*
		1~500까지 3의 배수를 배열에 저장
		출력 : 1. 직접 / 2.  for / 3. 향상for / 4. 함수
*/	
		int[] a = new int[166];
		int sum = 0;
		int count2=0;
		// 3의 배수 배열에 저장
		for(int i = 1,count = 0; i<=500; i++) {
			
			if(i%3==0) {
				a[count]=i;	
				System.out.print(a[count] + " ");
				count++;
				sum += i;
				count2 = count;
			}	
			
		}
		System.out.println();
		// 1. 직접 출력

		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("=====================================");
		
		
		// 2. for 문 통해 출력
		System.out.println("======== for을 통해 값을 입,출력 ==============");
		for(int i = 1, count = 0; i<=500; i++) {
			
			if(i%3==0) {
				a[count]=i;	
				System.out.print(a[count] + " ");
				count++;
			}		
		}
		System.out.println();
		// 3. 향상된 for문 사용하여 출력
		System.out.println("==========향상된 for 문 사용 ===============");
		for(int k: a) {
			System.out.print(k+ " ");// 배열에 저장된 모든 값 출력		
		}
		System.out.println();
		// 4.출력 Arrays.toString(a) : 메소드 함수
		System.out.println("========Arrays.toString() 함수 사용==============");
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		
		System.out.println("배열의 합계 :" + sum);
		System.out.println("배열의 평균 :" + (double)sum / count2);
	}
}


