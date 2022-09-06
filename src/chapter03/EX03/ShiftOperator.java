package chapter03.EX03;

public class ShiftOperator {

	public static void main(String[] args) {
/*		
		 산술 시프트 ( <<, >> )
		 부호 비트는 고정되어있음. 대량 계산 빠르게 가능
		 	
*/	
		
/*
		//<< 각 비트 왼쪽 이동
		System.out.println(3<<1);					// 3 * 2^1 = 6
		System.out.println(3<<2);					// 3 * 2^2  = 12
		System.out.println(3<<3);					// 3 * 2^3 = 24
		System.out.println(-3 << 1);				// -3 * 2^1 = -6
*/
		
/*	
		// >> 각 비트 오른쪽 이동
		System.out.println(5>>1);					// 5 * 2^-1 = 2
		System.out.println(5>>2);					// 5 * 2^-2 = 1
*/		
		
		// 논리 시프트 ( >>> )
		System.out.println(5>>>1);
		
	}

}
