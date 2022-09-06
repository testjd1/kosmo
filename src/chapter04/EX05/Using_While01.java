package chapter04.EX05;

public class Using_While01 {

	public static void main(String[] args) {
/*
	while ( 조건){
	실행문;
	}
	
	초기값 선언을 반드시 while문 밖에서 선언 해야함. ( 내에서 선언 = 무한 루프)
	증가값 선언은 while 내에서 함. ( 증가값 선언x = 무한 루프)
	
		
*/
/*	
		1. while 문에서 반복 횟수가 0인 경우
*/	
		
		int a = 0;
		
		while(a<0) { // a = false
			System.out.println(a + ""); //  조건이 true 일때만 실행
			
		}
/*		
		2. while 문에서 반복 횟수가 1인 경우
	
		System.out.println(" 반복횟수 1번 break사용");
		a = 0;
		while (a==0) {
			System.out.print(a+ " ");
			break;
		}
		
		
		
		System.out.println(" 반복횟수 1번 증가값 사용");
		a = 0;
		while (a==0) {
			System.out.print(a+ " ");
			a++;
		}
		
		System.out.println();
*/		
		
		System.out.println(" 반복 횟수 10번 ");
		a = 0;
		while (a< 10) {
			System.out.print(a+ " ");
			a++ ; 
			
		}
		
		System.out.println();
		
		
		while ( a< 10) {
			a = 0;									// 초기화 값 while 내부 선언
			 System.out.println(a + " ");
			 a++;									// 증가 값  while 내부 처리
			 
			 
			 
/*			 
			 while  조건 생략 가능
			 for : 조건 생략시 무한 루프
			 while 문에서 무한루프 돌림 => 조건이  true
			 
*/			 
			 
			 System.out.println();
			 
			 boolean b;
			 b= true;
			 while(b) {
				 System.out.println(a + " ");
				 a++;
				 
				 if (a>200) {
					 break;
				 }
				 
			 }
			 
		}
		
		
	}

}
