package change_teacher_review.basic1;
// import java.lang.*;

/*
자료형 ( data type )
1. 기본형	
	boolean
	char
	int / long
	double

2. 참조형
	클래스
	배열
	-> new 예약어를 통해 객체 생성
	
	
 (*) String

*/

public class Ex01_Var {// extends Object
	
	// 멤버 변수

	public static void main(String[] args) {
/*		
	 문자열 변수  a, 정수 변수 b 선언
	 변수 b에 200 대입
	 b에 200 대입 , a에 Hello 지정
	 지역 변수
		 
*/		
		String a = null;  		// -> String : 클래스 느낌
		int b = 0;				// -> int : 예약어
		b = 200;
		a = "Hello";
		
		// a = new String("Hello");
		
		System.out.println(a + b);

	}

}
