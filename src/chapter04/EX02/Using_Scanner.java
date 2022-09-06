package chapter04.EX02;

import java.util.Scanner; // 같은 패키지 외부의 객체를 사용할 경우 import가 필요함.
public class Using_Scanner {

	public static void main(String[] args) {
/*		
	Scanner : 첫 글자가 대문자로 시작 = 클래스 ( 객체 생성 틀 )
	
	- 콘솔을 통해서 값 ( 정수, 문자열 , 실수, 문자 ) 을 받아서 처리함.
		 	[int, next(), nextln(). nextDouble ... ]
	- 객체를 임포트해서 사용해야 한다. ( import java.util.Scanner)
	- 공백이나 엔터를 사용해서 여러개의 값을 넣을 수 있음.
	- Scanner sc 사용 후에는 sc.close()를 사용하여 메모리에서 객체 제거

*/		
		Scanner sc = new Scanner (System.in);		// 객체
		// Scanner 클래스로 부터 sc 라는 객체를 생성함. (콘솔을 통해 인풋 받음)
		// ctrl + shift + o : 외부 클래스 자동 import
		// sc : 객체
		// sc.nextint() : 객체의 메소드  ( 함수 )
/**/		
		System.out.println("정수 값 입력");
		int a = sc.nextInt();  		// 콘솔에서 정수값 받아서 변수 a에 할당
		System.out.println("변수 a를 출력 : " + a);
		
		System.out.println("문자열 입력");
		String b = sc.next(); 		// 콘솔에서 문자열을 받아 변수 b에 할당
		System.out.println("변수 b를 출력: " + b);
	
		
		System.out.println("실수 값 입력");
		double c = sc.nextDouble();
		System.out.println("변수 c 출력 : "+c);
		
		
		String s = sc.next();					// 문자열 변수 선언
		System.out.println("한 문자 입력");
		char d = s.charAt(0); 					// 문자열 + enter
		System.out.println("변수 d 출력 : " +d);
		
		sc.close(); 							// 메모리에서 객체 삭제
	}

}
