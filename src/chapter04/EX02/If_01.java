package chapter04.EX02;

public class If_01 {

	public static void main(String[] args) {
/*
		제어문 : 프로그램의 순서 바꾸기 가능
			선택 제어문 : if / switch
			반복 제어문 : for / while / do while

		1. if : 조건을 만족하는 실행문 실행 후 IF 문 빠져나옴
		2. switch : break사용 해야만 빠져나올 수 있음
				
			if (조건;){
				실행문1							// 조건 1이 참일 때, 실행문 1 실행
			}
			else if (조건2) {					// 조건 2가 참일 때, 실행문 2 실행
				실행문2
			}else{
				실행문3							// 위의 모든 조건 충족X 실행
			}
*/	
/* 		1). if (조건){ 실행 ;}					// 조건이 참일 때 실행문 1 실행
		(break) 문을 사용하지 않더라도 빠져나옴

		if(3>5) {
				System.out.println("안녕");
				System.out.println("방가");
		}
		System.out.println("============================");
		if(3<5) {
				System.out.println("안녕");
				System.out.println("방가");
		}
			
		//if 조건에서 실행문이 한개일 경우 중괄호 생략 가능
			
		if(5>3) 
			System.out.println("오늘은 비가 옵니다.");
			System.out.println("비가 보슬보슬 옵니다.");
*/			
/*		
		2). if (조건){
				실행문1	;						// 조건이 참일 때 실행문 1 실행
			}else{
				실행문 2	;						// 조건이 거짓일 때 실행문 2 실행
			}	
		
		if(5>3) {									// 조건은 반드시  true / false 값 나와야함
			System.out.println("실행1 (참)");			// 조건이 참일 때 실행문 1 실행
		}else {
			System.out.println("실행2 (거짓)");		// 조건이 거짓일 때 실행문 2 실행
		}


		
		int a,b;									// 변수 선언만 한 경우
		
		// System.out.println(a);						// 변수의 값을 넣지 않고 출력
		a = 5; b = 0;
		if(a>5) {
			b = 10;
		}else {
			b = 20;
		}
		System.out.println("if else구문");
		System.out.println(b);
		
		// if ~else 구문을 삼항 연산자로 변환 
		// 삼항 연산자는 한 라인으로 처리
		System.out.println("삼항연산자 출력");
		System.out.println((a>5)? 10:20);
*/		
/*
 		3) 조건이 여러개인 경우 : if (조건) ~ else if (조건 ) ~ else
 		해당 조건을 만족하는 실행문을 실행 후 if 문 탈출
  	
 */
		
		int c;
		c = 20;
		
		
		if(c>=90) {												// false
			System.out.println("A 학점입니다.");		
		}else if(c>=80) {										// true
			System.out.println("B 학점입니다.");					// 실행 후 if 문 빠져나옴
		}else if(c>=70) {
			System.out.println("C 학점입니다.");
		}else if (c>=60) {
			System.out.println("D 학점입니다.");
		}else {
			System.out.println("학점 미달입니다.");
		}
		
		System.out.println("if 문 탈출");
		
	}
}
