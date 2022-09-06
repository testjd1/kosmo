package chapter05.EX01;

import java.util.Arrays;

public class Using_Array04 {
	public static void main(String[] args){
/*
	
	배열 ( Array ) : 하나의 [배열] 변수에 여러개의 값 넣음.
		 - 참조 자료형 :  변수는 Stack에 저장, 값은 Heap에 저장
		   변수의 Heap 영역의 주소값 있음.
		   
		  - 기본 자료형 : 변수, 값 모두 Stack에 저장
		 boolean , byte, short, int, long, float, double, char
	기본 자료형 배열 변수 :  
	참조 자료형 배열 변수	: String
				

		
	// 1) 동일한 자료형 가지고 있음
	 방의 개수 변경 가능 ( 정적 )
		Heap 공간은 반드시 값이 있어야함.
		초기 값 x ->  JVM이 자동으로 넣음
		정수 : 0, 실수 : 0.0, boolean : false
		참조 자료형 : null
*/			
		// 1. 배열 선언과 초기화
		int[] a = new int[5];
		// int 배열 변수([])  
		// new : Heap 공간에 int 배열 방 5개 생성 후 힙 주소 a 변수에 할당
		
		// 2. 배열 방의 정보 입력
/*		
 		System.out.println("======== 방의 개수를 직접 넣어서 출력 ==============");
		// index ( 방 ) 직접 할당
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
*/	
		// 1. 직접 출력
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		// 2. for 문 통해 출력
		System.out.println("======== for을 통해 값을 입,출력 ==============");
		for(int i = 0, j=100; i<5; i++,j+=100) {
			a[i] = j;
			System.out.println(a[i]);
		}
		
		System.out.println("======= a.length ==================");
		System.out.println(a.length);				// 배열 방의 개수 출력
		
		for(int i=0, j=1000; i<a.length; i++,j+=100) {
			a[i]=j;
		}
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
				
	
		// 3. 향상된 for문 사용하여 출력
		System.out.println("==========향상된 for 문 사용 ===============");
		for(int k: a) {
			System.out.println(k);				// 배열에 저장된 모든 값 출력
		}
		// 4.출력 Arrays.toString(a) : 메소드 함수
		System.out.println("========Arrays.toString() 함수 사용==============");
		System.out.println(Arrays.toString(a));
		}
	
}
