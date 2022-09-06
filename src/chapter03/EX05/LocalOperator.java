package chapter03.EX05;

public class LocalOperator {
	public static void main(String[] args) {
/*		
		논리 연산자 ( &&, ||, ^, ! )
		&& : AND / || : OR / ^ : XOR / ! : NOT
		연산자 좌 or 우측에 true or false 와야함
*/		
/*
 		AND 연산 : && / 좌우 모두 true 일 때, true

		System.out.println(true   && true);  		// true
		System.out.println(true   && false);		// false
		System.out.println(true   && (5<3));		// false
		System.out.println((5<=5) && (7>2));		// true
 */		
/*
 		OR 연산 : || / 좌우 중 하나만 true 여도 true

		System.out.println(true   || true);			// true
		System.out.println(true   || false);		// true
		System.out.println(false  || (5<3));		// false
		System.out.println((5<=5) || (7>2));		// true
 */
/*
 		XOR 연산 : ^ / 좌우 중 동일하면 false, 다르면 true

		System.out.println(true   ^ true);			// false
		System.out.println(true   ^ false);			// true
		System.out.println(false  ^ (5<3));			// false
		System.out.println((5<=5) ^ (7>2));			// false
 */	
/*
 		NOT 연산 : ! / 반대로 출력, false -> true, true -> false
 
		System.out.println(!true); 					// false
		System.out.println(!false); 				// true
		System.out.println(false || ! (5<3));	 	// true
		System.out.println((5<=5) || ! (7>2)); 		// true
*/		
/*
 		비트 연산자로 논리 연산 수행

		System.out.println(true   & true);			// true
		System.out.println(true   & false);  		// false
		System.out.println(true   | (5<3)); 		// true
		System.out.println((5<=5) | (7>2));	 		// true
 */		
/*	
		숏 서킷 ( short circuit )
		왼쪽의 결과 값 만으로 결과 값 유추가능 -> 오른쪽 값 계산x
		논리 연산자에서만 작동 ( &&, ||, ^, ! )
		비트 연산자에서는 작동x ( &, |, ^, ~ )
*/		
/*
		int value1 = 3;	
		System.out.println(false && ++value1 > 6); 	// false 
		//-> 숏 서킷 작동o  ++value1 계산 x
		System.out.println(value1);					// 3
		
		int value2 = 3;
		System.out.println(false & ++value2 > 6); // false
		//-> 숏 서킷 작동x  ++value2 계산 o
		System.out.println(value2);	
		
		int value3 = 3;	
		System.out.println(true || ++value3 > 6); 	// true
		//-> 숏 서킷 작동o  ++value3 계산 x
		System.out.println(value3);					// 3
		
		int value4 = 3;
		System.out.println(true | ++value4 > 6); // true
		//-> 숏 서킷 작동x  ++value4 계산 o
		System.out.println(value4);	
*/		
		
	}
}
