package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
/*
	 	정수 배열 방 열개 생성
	 	임의의 값 열개를 방에 저장
	 	그 중 최대 값을 뽑아서 출력.
	
		
*/		
		
		Scanner sc = new Scanner(System.in);
		
		int [] a =  new int[10];
		int max =0;
		
		
		for(int i=0; i<10; i++) {
			System.out.printf("정수를 입력하세요 (%d번)",i+1);
			int n = sc.nextInt();
			a[i] =n;
		}
			
	/* 방에 잘 들어가는지 확인
		for(int i = 0; i<10; i++) {
			System.out.print(a[i] + " ");
		}
	*/	
		
		for(int i = 0; i<a.length; i++) {
			if(a[i]>=max) {
				max =a[i];
			}
		}
		
		int min = a[0];
		for(int i = 1; i<a.length; i++) {
			if(a[i]<=min) {
				min =a[i];
			}
		}
		System.out.printf("입력된 정수의 값은 "+Arrays.toString(a)+"입니다.\n");
		System.out.printf("최댓값은 %d 입니다.\n",max);
		System.out.printf("최솟값은 %d 입니다.\n",min);
		
		System.out.println("=========2번째 방법은  Arrays.sort() 메소드를 사용해서 출력 =========");
		Arrays.sort(a);					// 배열 방의 값 정렬
		System.out.println("최댓값 : " + a[a.length-1]);
		System.out.println("최솟값 : " + a[0]);
		
		System.out.println("================Stream 사용 ===========");
		System.out.println("최댓값 : " + Arrays.stream(a).max().getAsInt());
		System.out.println("최솟값 : " + Arrays.stream(a).min().getAsInt());
	}

}
