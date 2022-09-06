package chapter03.EX06;

public class AssignmentOperator {

	public static void main(String[] args) {
/*

		// 대입 연산자 축약 표현
		- 산술 연산의 축약 표형
		 a = a + b         	=> a += b
		 a = a - b  		=> a -= b
		 a = a * b 			=> a *= b
		 a = a / b			=> a /= b
		 
		- 비트 연산 축약 표현
		 a = a & b			=> a &= b
		 a = a | b 			=> a | b
		  
		- 쉬프트 연산 축약 표현
		 a = a >> b			=> a >>= b
		 a = a << b         => a <<= b
		 
		- 논리 쉬프트 
		 a = a >>> b

*/		
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		
		int value2 = 1;							// 변수 선언 및 할당
		System.out.println(value2 +=2);			// value2 = value2 + 2
		System.out.println(value2 -= 2);		// value2 = value2 - 2
		System.out.println(value2 *= 2);		// value2 = value2 * 2
		System.out.println(value2 /= 2);		// value2 = value2 / 2
		System.out.println(value2 %= 2);		// value2 = value2 % 2
		System.out.println(value2 <<= 2);		// value2 = value2 << 2
		System.out.println(value2 >>= 2);		// value2 = value2 >> 2
		
	}

}
