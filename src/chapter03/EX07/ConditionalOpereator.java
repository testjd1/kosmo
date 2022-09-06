package chapter03.EX07;

public class ConditionalOpereator {

	public static void main(String[] args) {
/*
		삼항연산자	<- 자주 사용
		(조건 ) ? 참 : 거짓
		조건이 참이면 '참'실행, 거짓이면 '거짓' 실행
		: => 깃발을 나타냄
		
*/	
/*
		int value1 = (3>5) ? 6:9;				// 조건이 false 이므로 변수에 9 할당
		System.out.println(value1);
		
		int value2 = (5>3) ? 10:20;				// 조건이 true 이므로 변수에 10 할당
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println((value3 % 2 ==0) ? "짝수" : "홀수");
		// % : 나머지
		
		// 5의 배수만 출력
		

		int value4 = 30;
		System.out.println(( value4%5 == 0) ? "5의 배수" : "5의배수가 아님");
		
		// 나이가 20이상이면 성인 / 아님
		
		int value5 = 10;
		System.out.println((value5 >= 20 ) ? "당신은 성인입니다." : "당신은 성인이 아닙니다.");
*/	
/*
		// 삼항 연산자는 if ~else 문으로 변환 가능
	
		 if(조건){
		 	실행문1; [ 조건이 참이면 실행문1 실행]
		 }
		 else{
		 	실행문2; [ 조건이 거짓이면 실행문2 실행]
		 }
*/
		
		
		int value3 = 4;
		
		if (value3 %2 == 0) {
			System.out.println("짝수");			// 조건이 참일 때 실행
		}
		else {
			System.out.println("홀수");			// 조건이 거짓일 때 실행
		}
	
		
		int value4 = 30;
		if ( value4 %5 == 0 ) {
			System.out.println("5의 배수 입니다.");
		}
		else {
			System.out.println("5의 배수가 아닙니다.");
		}
		
		
		int value5 = 10;
		if(value5 > 20) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("성인이 아닙니다.");
		}
		
		
	}
	
}
