package chapter05.EX01;

import java.util.Arrays;

public class Using_Array12 {

	public static void main(String[] args) {
/*
	 1~1000까지 배열 (arr)에 저장 후
	 
	 1. 배열 선언
	 2. 입력 [for]문 통해 arr 배열 변수에 값 할당
	 3. 출력 [for]문 통해 arr 배열 변수의 값 출력
	 4. 출력 enhance [for] 문으로 향상된 for문 출력
*/	
		
		int [] arr = new int[1000];
		int i;
		//2 . 입력 [for]문 통해 arr 배열 변수에 값 할당
		for(i=0; i<arr.length; i++) {
			 arr[i] = i+1;
			System.out.print(arr[i] + " ");
			if(i%100==0) {
				System.out.println();
			}
		}
		
		System.out.println("=============================================================================================");
		//3 . 출력 [for]문 통해 arr 배열 변수의 값 출력
		for(int k:arr) {
			System.out.print(k + " ");
			if(k%100==0) {
				
				System.out.println();
			}
		}
		System.out.println("=============================================================================================");
		//4 .  Arrays.toString(arr)
		
		System.out.println(Arrays.toString(arr));
		
	}

}
