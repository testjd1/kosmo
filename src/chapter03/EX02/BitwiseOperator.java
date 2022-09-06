package chapter03.EX02;

public class BitwiseOperator {
	public static void main(String[] args) {
/*	
 		bit연산
 		자바 메서드를 사용해서 진법 변환 ( 2진수, 8진수, 16진수 )
 */
/*		
		int data = 13;
		
		//Integer 객체의 함수 사용 ( 총 32bit, 4byte, int )
		//toBinaryString(data) : 2진수
		//toOctalString(data) : 8진수
		//toHexString(data) : 16진수
			
		System.out.println(Integer.toBinaryString(data));		// 2진수 출력			
		System.out.println(Integer.toOctalString(data));		// 8진수 출력
		System.out.println(Integer.toHexString(data));			// 16진수 출력
	
		// 2진수, 8진수, 16진수의 값 10진수로 변환
		System.out.println(Integer.parseInt("1101",2));			// 2 -> 10
		System.out.println(Integer.parseInt("15",8));			// 8 -> 10
		System.out.println(Integer.parseInt("d",16));			// 16 -> 10
		
		// 다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101);								// 0b : 2진수
		System.out.println(015);								// 0 : 8진수
		System.out.println(0xd);								// 0x : 16진수
*/		
/*		
		// 비트 연산자 And : &		<== 두 비트 모두 1일 경우 1
		System.out.println(3&10);
		System.out.println(0b0011 & 0b1010);
		System.out.println(0x03 & 0x0A);  					// 2
	
		// 비트 연산자  Or : |		<= 하나의 비트라도 1 존재하면 1
		System.out.println(3|10);
		System.out.println(0b0011|0b1010);
		System.out.println(0x03|0x0A);						// 11
		
		// 비트 연산자 Xor : ^ 	<= 두 비트가 동일하면 0, 다르면 1
		System.out.println(3^10);
		System.out.println(0b0011^0b1010);
		System.out.println(0x03^0x0A);						// 9
*/		
/*
		// 비트 연산자 NOT : ~		<= 0 일때 1, 1 일때 0
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x03);							// -4
		System.out.println(~100);							// -101
*/		

		// 복습
		int abc = 123;
		int bcd = 0123;
		int efg = 0x123;
		
		System.out.println(abc);							// 10진수
		System.out.println(bcd);							// 8진수
		System.out.println(efg);							// 16진수
	}
}
