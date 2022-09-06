package chapter04.EX04;

import java.util.Scanner;

public class Using_For02 {

	public static void main(String[] args) {
/*		
		for 문 사용해서 스캐너로 5개 값 받아 출력
		
		

		Scanner sc = new Scanner(System.in);
		
		
		String s;
		for(int i=0;i<5;i++) {
			System.out.print("값을 입력하세요\n");
			s=sc.next();
			
			System.out.println(s);
		}
*/		
		// for 문 내에서 변수 선언 -> for문 내에서만 사용 가능
		// 클래스 내에서 재사용 가능
		
		int a = 0;						// 전역 변수
		
		for (int i=0;i<3; i++) {   // 0, 1, 2 세번 돌아감
			// i = 지역 변수, for 문 내에서만 사용
			System.out.println(i);
			System.out.println(a);	
		}

		
	}

}
