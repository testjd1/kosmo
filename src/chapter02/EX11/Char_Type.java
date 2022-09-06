package chapter02.EX11;

public class Char_Type {

	public static void main(String[] args) {
/*		 char 데이터 타입 : 하나의 문자만 저장 
		 문자, 숫자, 유니코드로 저장
		 ' ' (작은 따옴표)를 사용하여 저장
		 여러 문자 저장 = String 이용
		 유니코드 (2byte) : 전 세계의 모든 문자를 16진수로 표기
*/		
/*
		// 1) 문자로 저장하는 방법
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3'; 				// 3이라는 문자 의미
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
*/		
/*		
		// 2) 정수로 저장하는 방법
		char value4 = 65;				// A : 65
		char value5 = 0xac00;			// 0x : 16진수
		char value6 = 51;				// 3 : 51
		
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
*/		
/*		
		// 3) 유니코드 형식으로 저장 (\\u 유니코드); ''를 사용해서 넣음
		char value7 = '\u0041';			// A
		char value8 = '\uac00';			// 가
		char value9 = '\u0033';			// 3
		char value100 = 35;  			// # : 35
		char value101 = '\uac12';		// 값 : ac12
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value100);
		System.out.println(value101);
		
		
*/
/*		
		// 4) 구글 검색을 이용하여 자신의 이름의 유니코드를 찾아서 출력
		char value103 = '\uAE40';
		char value104 = '\uC7AC';
		char value105 = '\uB3D9';
		
		System.out.print(value103);
		System.out.print(value104);
		
		System.out.println(value105);
		
		System.out.println("유니코드로 변환한 제 이름은 "+ value103 + value104 + value105 +"입니다.");
*/
/*
		// 5) 문자 A를 저장하는 다양한 방법
		
		char a = 'A';					// A  : 65
		char b = 65;					// 정수로 저장 (10진수)
		char c = 0b1000001;				// 0b 뒤에 오는 값은 2진수
		char d = 00101;					// 0 뒤에 오는 값은 8진수
		char e = 0x0041; 				// 0x 뒤에 오는 값은 16진수
		char f = '\u0041';				// 유니코드로 값 할당
		
		
		System.out.println((int) a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
*/
	}

}
