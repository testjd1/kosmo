package chapter02.EX02;

public class NamingVirableAndConstant {

	public static void main(String[] args) {
		
		/* 변수의 이름 부여  [ 변수 : 값 변경 가능 ]
		 	- 변수이름 : 영문, 한글 가능 ( 권장사항x )
		 	- 첫 자 : 소문자 
		 	- 특수 문자 : _, $
		 	- 첫 자 숫자x 
		 	- JAVA의 예약어 (KEYWORD) 사용 X [ex) int, double ... ]  	 
		 */	
		
		boolean aBcD;				 // true, false 값만 가능
		aBcD = true;
		System.out.println(aBcD);    // true
		aBcD = false;
		System.out.println(aBcD);	 // false
		
		byte 가나다;  // 사용은 가능, 비추
		short _abcd; // 특수문자 : _ , $ 가능
		char $ab_cd;
		double main; // 메소드 이름 변수이름으로 사용 가능, 
					 // 사용방법이 달라서
		// float int; 예약어 변수명으로 사용 -> 오류
		//				[ex) int, class, double, char, ... ]
		String myClassname; // 첫 단어는 소문자, 여러 단어시 대문자 
		
		/* 상수의 이름 부여  [ 상수 : 값 변경 x ]
		   	- 대문자로 처리
		   	- 변수 선언문 앞에  final 키워드 사용
		   	
		 */
		
		double PI;   				// final double : 상수
		
		PI = 3.141592;
		
		System.out.println(PI);
		PI = 1234.00;    			// 상수 값 수정x
	
		System.out.println(PI);
		
		final int MY_DATA; 			// 여러 단어 합침 -> _ 사용
		int myData;					// 변수 -> 소문자
		
	}

}
