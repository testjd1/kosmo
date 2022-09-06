package chapter04.EX05;

import java.util.Scanner;

public class Using_While {
	public static void main(String[] args) {
/*
  스캔을 사용해서 -1 이 될 때까지 정수 값 받음
*/
/*
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int sum = 0;
		int n = 0;
		while (n != -1) {				// -1 이 정수 값으로 input 되면 루프 빠져나옴
			
			System.out.println("정수 값을 입력하세요, 종료시 -1 입력");
			n = sc.nextInt();

			if(n>0) {
					sum += n;					// 정수 합 누적
					count++;					// 정수 값 카운트
			}
		
		}
		if (count==0) {	// 제일 처음 정수 값을 -1 넣음
			System.out.println("입력된 정수가 없습니다.");
		}else {
			System.out.println("입력하신 정수는 : " +count + "개 입니다.");
			System.out.println("입력하신 정수의 합은 : " +sum + "입니다.");
			System.out.println("입력하신 정수의 평균은 : " +(double)sum / count + " 입니다.");
				
		}
		sc.close();
*/		
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int sum = 0;
		System.out.println("정수 값을 입력하세요, 종료시 -1 입력");
		int n = sc.nextInt();
		while (n != -1) {				// -1 이 정수 값으로 input 되면 루프 빠져나옴
			
			
			n = sc.nextInt();

			sum += n;					// 정수 합 누적
			count++;					// 정수 값 카운트
		
		}
		if (count==0) {	// 제일 처음 정수 값을 -1 넣음
			System.out.println("입력된 정수가 없습니다.");
		}else {
			System.out.println("입력하신 정수는 : " +count + "개 입니다.");
			System.out.println("입력하신 정수의 합은 : " +sum + "입니다.");
			System.out.println("입력하신 정수의 평균은 : " +(double)sum / count + " 입니다.");
				
		}
		
		
		
		
		
		
		
	}
}
