package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
/*		
		정수(양수, 음수 ) 를 스캐너로 5개 받아서
		양수만 더한 값을 출력 
		
*/		
		Scanner sc= new Scanner(System.in);
		
		int sum = 0;
		double sum2 = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i<5; i++) {
			System.out.printf("값을 입력하세요(%d번)  :",i+1);
			int a = sc.nextInt();
			
			if(a>=0) {
				sum += a;
				count1++;
			}
			
			
			
			sum2 += a;
			count2++;
			
		}
		System.out.printf("양수의 합은 %d입니다.\n",sum);
		System.out.printf("양수의 평균 %.2f입니다.\n",(double)sum/count1);
		System.out.printf("평균 값은 %.2f입니다.\n",(double)sum2/count2);
		
	}

}
