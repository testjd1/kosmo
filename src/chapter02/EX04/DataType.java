package chapter02.EX04;

public class DataType {
	public static void main(String[] args) {

		/*
		  자바의 자료형
		  	- 기본 자료형 8가지 : 첫 문자 - 소문자
		  		boolean : true , false
		  		byte 	: 정수 (1byte = 8bit ), -2^7 ~ 2^7-1
		  							   		   -128 ~ 127
		  		short 	: 정수 (2byte = 16bit), -2^15 ~ 2^15-1
		  									   -32,768 ~ 32,767
		  		int		: 정수 (4byte = 32bit), -2^31 ~ 2^31-1		  										
		  		long 	: 정수 (8byte = 64bit), 값을 할당할 때 1234L
		  		 								-2^63~ 2^63-1
		  		float 	: 실수 (4byte), 값을 할당할 때 123.45F
		  										-2^31 ~ 2^31-1
		  		double 	: 실수 (8byte)
		  		char 	: 문자 , ''
		  		
		  	- 참조 자료형 무한대 : 첫 문자 - 대문자 [ex) String]
		  		String 	: 문자열 , ""
		  		배열, 클래스, 인터페이스 ...
		 */
		
		boolean aaa;					// true or false만 가능
		aaa = true; aaa= false;
		System.out.println(aaa);
		
		byte bbb;    					// 정수값만 할당 가능, 1byte = 8bit
		bbb = 127;						// -128 ~ 127
		System.out.println(bbb);
		
		byte bb;
		byte cc;
		//bb  = 128;                    	// byte 범위를 넘겨서 입력 오류
		bb = (byte) 128; 				// 앞에 (byte)붙이면 가능 , -128
		System.out.println("bb의 출력값 : " +bb );
		
		cc = (byte) 129;                       // -127
		System.out.println("cc의 출력값 : " +cc );
		

		
		short ccc;						// 정수값만 할당 가능, 2byte = 16bit
		ccc= 32767;						// -32768 ~ 32767
		System.out.println(ccc);
		
		short abc;
		abc = 32767;
		abc = (short) 32768;
		System.out.println("abc의 출력값 :"+abc);
		
		int ddd;
		ddd= 2147483647;
		System.out.println(ddd);
		
		long eee;
		eee = 1234567891234567891L;
		System.out.println(eee);
		
		double fff;
		fff = 123456789123456789123456789123456789F;
		System.out.println(fff);
	}
}
