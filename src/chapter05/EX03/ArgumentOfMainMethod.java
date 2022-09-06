package chapter05.EX03;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {
	/* 
	 	main Method의 입력 매개변수 전달하기, 메소드(객체 지향 언어) = 함수
		-메소드(함수)의 형식 : 리턴타입 메소드명 (입력매개변수) {실행부]
							void main(String[] args){실행부}
							
													
	 */		
		
		String a = args[0];
		String b = args[1];
		String c = args[2];
		
		// 출력 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// 연산
		System.out.println(b + 1);		// 3(String) + 1 ( int ) = 31
		System.out.println(c + 1);		// 5.8(String) + 1 ( int ) = 5.81
		System.out.println("====================================================================");
		// 숫자 형식으로 되어있는 String => 정수 , 더블형으로 변환
										// Integer.parseInt(String @ )
										// Double.parseDouble(String @ )
		
		int  d = Integer.parseInt(b);
		double e = Double.parseDouble(c);
		
		System.out.println(d);
		System.out.println(e);
		System.out.println("=====================형 변환 후 연산======================================");
		
		System.out.println(d + 1);		// 정수 + 정수
		
		System.out.println(e + 1);		// 실수 + 정수
	
	
	}

}
