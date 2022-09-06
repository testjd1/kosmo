package chapter05.EX01;

import java.util.Arrays;

public class Using_Array {

	public static void main(String[] args) {
/*		
 		기본 자료형인 경우 RAM의 Stack 영역에 변수와 값이 같이 저장이 됨.
 		참조 자료형인 경우 RAM의 Stack 영역에 변수명 저장, Heap 영역에 변수의 값 저장.
	 	배열 (Array) : 하나의 [배열] 변수에 여러개의 값 할당 가능	
		1. 동일한 자료형의 값 할당 가능
		2. 배열의 방의 크기 지정 -> 수정 불가능
		
*/
		
		// 배열 변수  a를 선언
		int[] a = new int[5]; 		// a = 참조변수 , 참조 주소값 가짐.
/*
 		배열  a 변수의 방의 크기 5개 생성 후 주소 값을 a에 할당 하라
 		방 번호 [ index ] 0~4 까지 Heap 영역에 생성
 		new : Heap 영역의 배열 방 5개를 생성해서  Heap 영역의 번지를 a 변수에 할당.
		
 */
		// 배열 변수의 값 할당
		a[0] = 10;		// Heap 영역의 index 0번 방에 정수 10 할당.
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
/*		
		// 배열 방의 값을 출력
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("=======for 이용하여 배열 방의 값 출력 =======");
		for ( int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("배열 변수 a의 방의 개수 : " + a.length);				//  배열 방의 총 갯수 출력
		
		
		System.out.println("====for 문에서 a.length 사용해서 출력 ===");
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);	
		}
*/
		
		
		System.out.println(a);						// 힙 메모리 주소
		System.out.println("====================");

/*
		 향상된(enhanced) for 문으로 배열의 모든 값 출력
		 배열의 모든 방을 순환하면서 출력
		 배열의 모든 값을 한꺼번에 출력
		
*/	
		System.out.println("==========향상 된 for 사용 =====");
		for(int k:a) {
			System.out.println(k);
		}
		// Arrays.toString(a) 로 출력 // 배열의 모든 값 출력
		System.out.println("========= Arrays.toString(a)====");
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		
	}

}
